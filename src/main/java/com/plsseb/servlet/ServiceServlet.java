package com.plsseb.servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.security.auth.login.LoginContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import com.sap.security.auth.login.LoginContextFactory;


public class ServiceServlet extends HttpServlet {

	private static final long serialVersionUID = -7538652268445922964L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String auth = req.getHeader("Authorization");
		String auth1 = req.getHeader("authorization");
		System.err.println("auth: " + auth);
		System.err.println("auth1: " + auth1);
		if (auth != null && auth.startsWith("Bearer")){
			LoginContext loginContext;
//			try {
//				loginContext = LoginContextFactory.createLoginContext(AUTH.OAUTH.name());
//				loginContext.login();
//			} catch (LoginException e) {
//				e.printStackTrace();
//				throw new ServletException(e);
//			}
		}
		
		PrintWriter writer = resp.getWriter();
		writer.println(mockResponse(req));
	}
	
	@Override 
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String auth = req.getHeader("Authorization");
		String auth1 = req.getHeader("authorization");
		System.err.println("auth: " + auth);
		System.err.println("auth1: " + auth1);
		PrintWriter writer = resp.getWriter();
		writer.println(mockResponse(req));
	}
	
	private String getInputString(HttpServletRequest req) {
		StringBuffer buffer = new StringBuffer();
		BufferedReader reader;
		try {
			reader = req.getReader();
			String line = "";
			while ((line = reader.readLine()) != null) {
				buffer.append(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		return buffer.toString();
	}
	
	private String mockResponse(HttpServletRequest req) {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<S:Envelope xmlns:S=\"http://schemas.xmlsoap.org/soap/envelope/\">");
		buffer.append("<S:Body>");
		buffer.append("<createRcmAssessmentRequestResponse>");
		buffer.append("<rcmAssessmentResponse xmlns=\"com.plsseb.alert\">");
		buffer.append("<entityId>123</entityId>");
		buffer.append("<statusDate>"+ new java.util.Date().getTime() + "</statusDate>");
		buffer.append("<statusDetails><![CDATA[" + getInputString(req) + "]]></statusDetails>");
		buffer.append("</rcmAssessmentResponse>");
		buffer.append("</createRcmAssessmentRequestResponse>");
		buffer.append("</S:Body>");
		buffer.append("</S:Envelope>");
		return buffer.toString();
	}
	
}
