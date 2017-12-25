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
        <%
            int number1 = 32;
            final int number2 = 4;
            
            out.print("加算：32+4=" + (number1 + number2) + "<br>");
            out.print("減算：32-4=" + (number1 - number2) + "<br>");
            out.print("乗算：32*4=" + (number1 * number2) + "<br>");
            out.print("除算：32/4=" + (number1 / number2) + "<br>");
        %>
    </body>
</html>
