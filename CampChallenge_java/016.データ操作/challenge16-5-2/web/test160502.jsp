<%-- 
    Document   : test160502
    Created on : 2018/01/23, 15:20:06
    Author     : you
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="javax.servlet.http.HttpSession" %>
<%@page import="java.io.IOException" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
          HttpSession hs = request.getSession();
          String nn = (String)hs.getAttribute("myname");
          String ss = (String)hs.getAttribute("mysex");
          String hh = (String)hs.getAttribute("myhobby");
          
          out.print("セッション情報<br>");
          out.print("myname：" + nn + "<br>");
          out.print("mysex：" + ss + "<br>");
          out.print("myhobby：" + hh + "<br>");
          out.print("<br>");
        %>
        
        <form action="test160502" method="get">
            名前：
            <%
            if(nn==null){
            %>
                <input type="text" name="myname">
            <%
            }
            else{
            %>
            <input type="text" name="myname" value="<% out.print(nn); %>">
            <%
            }
            %>
                
            <br>
            <br>
            性別<br>
            <%
            try{
                if(ss == null){
                %>
                    男
                    <input type="radio" name="mysex" value="man">
                    女
                    <input type="radio" name="mysex" value="woman">
                <%
                }
                else if(ss.equals("man")){
                %>
                    男
                    <input type="radio" name="mysex" value="man" checked>
                    女
                    <input type="radio" name="mysex" value="woman">
                <%
                }
                else if(ss.equals("woman")){
                %>
                    男
                    <input type="radio" name="mysex" value="man">
                    女
                    <input type="radio" name="mysex" value="woman" checked>
                <%
                }
            }
            catch (Exception e){
                out.print(e);
            }
            %>
            
            <br>
            <br>
            趣味：
            <%
            if(hh==null){
            %>
                 <input type="text" name="myhobby">
            <%
            }
            else{
            %>
                 <input type="text" name="myhobby" value="<% out.print(hh); %>">
            <%
            }
            %>
            <br>
            <br>
            <br>
            <input type="submit" name="btnsubmit">
        </form>
    </body>
</html>
