package com.example.testmaven;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "tao là núi, khong phai dau";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html>\n" +
                "<head>\n" +
                "    <title>JSP - Hello World</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h1><%= \"Hello World!\" %>\n" +
                "</h1>\n" +
                "<br/>\n" +
                "<a href=\"hello-servlet\">Hello Servlet</a>\n" +
                "\n" +
                "</body>\n" +
                "đã sửa by sơn" +"123" +"thao dep gai"+
                "</html>");
    }

    public void destroy() {
    }
}