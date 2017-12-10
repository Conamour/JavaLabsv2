package com.helpme;
import java.io.*;
import  javax.servlet.*;
import javax.servlet.http.*;

public class Main extends HttpServlet{

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String title = "SpecialTags has generated:";
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<HTML><HEAD><TITLE>");
        out.println("SpecialTags");
        out.println("</TITLE></HEAD><BODY>");
        out.println("H1" + title + "H1");
        out.println("<P>" + TagsGenerator.makeTags());
        out.println("<P><a href=\"Main\">Создать другой список фраз</a></p>");
        out.println("</BODY></HTML>");

        out.close();

    }
}
