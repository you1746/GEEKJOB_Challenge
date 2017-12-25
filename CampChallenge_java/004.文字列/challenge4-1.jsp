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
            String text1 = "groove";
            String text2 = "-";
            String text3 = "gear";
            
            out.print((text1 + text2 + text3) + "<br>");
            out.print("groove" + "-" + "gear" + "<br>");
        %>
    </body>
</html>
