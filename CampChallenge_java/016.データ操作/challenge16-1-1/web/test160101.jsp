<%-- 
    Document   : test160101
    Created on : 2018/01/15, 16:51:57
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
        <!--
        以下の入力フィールドを持ったHTMLを、Javaで処理する想定で記述してください。
        ・名前（テキストボックス）、性別（ラジオボタン）、趣味（複数行テキストボックス）
        -->
        <%
        request.setCharacterEncoding("UTF-8");

        out.print("名前　　：" + request.getParameter("myname") + "<br>");
        out.print("性別　　：" + request.getParameter("mysex") + "<br>");
        out.print("テキスト：" + request.getParameter("myhobby") + "<br>");
        %>
    </body>
</html>
