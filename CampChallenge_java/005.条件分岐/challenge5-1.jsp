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
            int x = 1;
            
            out.print("x=" + x + "<br>");
            if(x==1){
                out.print("１です！" + "<br>");
            }else if(x==2){
                out.print("プログラミングキャンプ！" + "<br>");                
            }else{
                out.print("その他です！" + "<br>");               
            }
        %>
    </body>
</html>
