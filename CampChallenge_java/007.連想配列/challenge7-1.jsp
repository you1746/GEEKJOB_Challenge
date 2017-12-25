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
        <%@ page import="java.util.HashMap" %>
        <%
            HashMap<String,String> text = new HashMap<String,String>();
            
            text.put("1","AAA");
            text.put("hello","world");
            text.put("soeda","33");
            text.put("20","20");
            
            out.print(text.get("1") + "<br>");
            out.print(text.get("hello") + "<br>");
            out.print(text.get("soeda") + "<br>");
            out.print(text.get("20") + "<br>");
        %>
    </body>
</html>
