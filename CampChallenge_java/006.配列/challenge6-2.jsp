<%-- 
    Document   : challenge1-2
    Created on : 2017/12/25, 12:38:31
    Author     : you
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@ page import="java.util.ArrayList" %>
        <%
            ArrayList<String> text = new ArrayList<String>();
            
            text.add("10");
            text.add("100");
            text.add("soeda");
            text.add("hayashi");
            text.add("-20");
            text.add("118");
            text.add("END");
            
            text.set(2,"33");
            
            out.print(text.get(0) + "<br>");
            out.print(text.get(1) + "<br>");
            out.print(text.get(2) + "<br>");
            out.print(text.get(3) + "<br>");
            out.print(text.get(4) + "<br>");
            out.print(text.get(5) + "<br>");
            out.print(text.get(6) + "<br>");
        %>
    </body>
</html>
