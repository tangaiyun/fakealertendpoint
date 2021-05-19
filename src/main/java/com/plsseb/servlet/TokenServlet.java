package com.plsseb.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class TokenServlet extends HttpServlet {

    private static final String SCOPE = "xs_user.write";
    private static final String ESUB_OAUTH_CLIENT_ID = "sb-na-8d0eb681-083e-4b9f-833a-4d0a727eb4c0!a638";
    private static final String ESUB_OAUTH_CLIENT_SECRET = "e36f2a4a-2955-4d91-a20a-6a67ae1bb16a$LqTdpwSuPIkak6z8NQkPEDBNSFO7-y8IdSvU_J31j7U=";
    private static final String ESUB_AUTHORIZATION = "Basic c2ItbmEtOGQwZWI2ODEtMDgzZS00YjlmLTgzM2EtNGQwYTcyN2ViNGMwIWE2Mzg6ZTM2ZjJhNGEtMjk1NS00ZDkxLWEyMGEtNmE2N2FlMWJiMTZhJExxVGRwd1N1UElrYWs2ejhOUWtQRURCTlNGTzcteThJZFN2VV9KMzFqN1U9";
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.println(genTokenContent());
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(validate(req)) {
            PrintWriter writer = resp.getWriter();
            writer.println(genTokenContent());
        }
        else {
            resp.sendError(401, "authorization failed");
        }
    }
    private boolean validate(HttpServletRequest req) {
        String scope = req.getParameter("scope");
        String authorization = req.getHeader("authorization");
        if(ESUB_AUTHORIZATION.equals(authorization) && scope == null) {
            return true;
        }
        else if(ESUB_AUTHORIZATION.equals(authorization) && SCOPE.equals(scope)) {
            return true;
        }
        else {
            return false;
        }
    }
    private String genTokenContent() {
        return "{    \n" +
                "  \"access_token\":\"ACCESS_TOKEN\",\n" +
                "  \"token_type\":\"bearer\",\n" +
                "  \"expires_in\":2592000,\n" +
                "  \"refresh_token\":\"REFRESH_TOKEN\",\n" +
                "  \"scope\":\"xs_user.write\"\n" +
                "}";
    }

    public static void main(String[] args) {

    }
}
