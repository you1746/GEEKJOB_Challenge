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
            char x = 'A';
            
            out.print("x：" + x + "<br>" + "<br>");

            switch(x){
                case A:
                    out.print("英語です");
                    break;
                case あ:
                    out.print("日本語です");
                    break;
                default:
                    out.print("例外です！");
                    break;
           }
        %>
    </body>
</html>
