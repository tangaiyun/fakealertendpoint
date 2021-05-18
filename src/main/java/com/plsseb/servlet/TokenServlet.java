package com.plsseb.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class TokenServlet extends HttpServlet {

   @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.println(genTokenContent());
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.println(genTokenContent());
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
}
