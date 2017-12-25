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
            int num = 0;
           
            for(i=1; i<=100; i++){
                num += i;
                out.print(i + "回目：" + num +"<br>");
            }
        %>
    </body>
</html>
