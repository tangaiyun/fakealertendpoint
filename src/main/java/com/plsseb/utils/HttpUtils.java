package com.plsseb.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

import javax.security.auth.login.LoginException;

//import com.sap.security.auth.login.LoginContextFactory;

import org.apache.axis.encoding.Base64;

public class HttpUtils {

	public enum AUTH {
		BASIC, OAUTH, FORM
	}

	public static void authenticate(WebServiceContext wsctx, String expectedUsername, String expectedPassword) {
		String skipauth = parseQueryParams(wsctx).get("skipauth");
		if (Boolean.valueOf(skipauth)) {
			System.out.println("Authentication skipped!");
			return;
		}

		MessageContext mctx = wsctx.getMessageContext();
		Map<?, ?> http_headers = (Map<?, ?>) mctx.get(MessageContext.HTTP_REQUEST_HEADERS);

		List<?> list = (List<?>) http_headers.get("Authorization");
		if (list == null || list.size() == 0) {
			throw new RuntimeException("Authentication not found! This WS needs BASIC Authentication!");
		}

		String userpass = (String) list.get(0);
		if (userpass.startsWith("Basic")) {
			loginWithBasic(userpass, expectedUsername, expectedPassword);
		} else if (userpass.startsWith("Bearer")) {
			try {
				loginWithOauth();
			} catch (LoginException e) {
				throw new RuntimeException("Authenticated Failure with " + userpass + ", error: " + e.getMessage());
			}
		} else {
			throw new RuntimeException("Authentication not supported " + userpass);
		}
	}

	private static void loginWithBasic(String authentication, String expectedUsername, String expectedPassword) {
		String userpass = authentication.substring(5);
		byte[] buf = Base64.decode(userpass);
		String credentials = new String(buf);

		String username = null;
		String password = null;
		int p = credentials.indexOf(":");
		if (p > -1) {
			username = credentials.substring(0, p);
			password = credentials.substring(p + 1);
		} else {
			throw new RuntimeException("There was an error while decoding the Authentication!");
		}

		if (username.equals(expectedUsername) && password.equals(expectedPassword)) {
			System.out.println(">===========SUCCESSFACTORS AUTHENTICATION USING BASIC OK =============");
			return;
		} else {
			throw new RuntimeException("Authentication failed! Wrong username/password " + username + ":" + password);
		}
	}

	private static void loginWithOauth() throws LoginException {
//		LoginContext loginContext = LoginContextFactory.createLoginContext(AUTH.OAUTH.name());
//		loginContext.login();
		System.out.println(">===========SUCCESSFACTORS AUTHENTICATION USING OAUTH OK =============");
	}

	public static boolean fault(WebServiceContext wsctx) {
		return Boolean.valueOf(parseQueryParams(wsctx).get("fault"));
	}

	public static void delay(WebServiceContext wsctx) {
		Long delay = 0L;
		String delayString = parseQueryParams(wsctx).get("delay");

		if (delayString != null) {
			if ("random".equalsIgnoreCase(delayString)) {
				Random ra = new Random();
				delay = (long) (ra.nextInt(28) + 1) * 1000;
			} else {
				delay = Long.valueOf(delayString);
			}

			System.out.println("Will delay in million seconds: " + delay);
			doDelay(delay);
		}
	}

	private static Map<String, String> parseQueryParams(WebServiceContext wsctx) {
		Map<String, String> queryParams = new HashMap<String, String>();

		MessageContext mctx = wsctx.getMessageContext();
		String queryString = (String) mctx.get(MessageContext.QUERY_STRING);
		if (queryString != null && queryString.length() > 0) {
			for (String queryParam : queryString.split("&")) {
				String[] keyvalues = queryParam.split("=", 2);
				queryParams.put(keyvalues[0], keyvalues[1]);
			}
		}
		return queryParams;
	}

	private static void doDelay(Long millionSecs) {
		try {
			Thread.sleep(millionSecs);
		} catch (InterruptedException e) {
			System.err.println("Thread Sleep got exception: " + e.getCause());
		}
	}
}