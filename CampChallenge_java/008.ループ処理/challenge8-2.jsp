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
            int i;
            String text = "A";
           
            for(i=0; i<30; i++){
                text += "A";
                out.print((i+1) + "回目：" + text +"<br>");
            }
        %>
    </body>
</html>
