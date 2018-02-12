/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;

/**
 *
 * @author you
 */
public class test180310 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        Connection db_con = null;
        PreparedStatement db_st = null;
        ResultSet db_data = null;
        int db_up;
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet test180310</title>");            
            out.println("</head>");
            out.println("<body>");
            
            //index.htmlから渡された検索文字列を取得
            request.setCharacterEncoding("UTF-8");
            out.println("登録ID：" + request.getParameter("myid") + "<br>");
            out.println("名前：" + request.getParameter("myname") + "<br>");
            out.println("電話番号：" + request.getParameter("mytel") + "<br>");
            out.println("年齢：" + request.getParameter("myage") + "<br>");
            out.println("誕生日：" + request.getParameter("mybirth") + "<br>");
            out.println("ボタン：" + request.getParameter("btnsubmit") + "<br>" + "<br>");
            
            int id = Integer.parseInt(request.getParameter("myid"));
            int age = Integer.parseInt(request.getParameter("myage"));
            String btn = request.getParameter("btnsubmit");
            
            if(btn.equals("登録")){
                if(id > 0 && id < 20 && age > 0 && age <= 100){
                    //データベースへの接続
                    Class.forName("com.mysql.jdbc.Driver").newInstance();
                    db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Challenge_db","root","");

                    //SQL文を設定
                    db_st = db_con.prepareStatement("select * from profiles where profilesID = ?");
                    db_st.setInt(1,id);

                    //SQL文を実行
                    db_data = db_st.executeQuery();
                    while(db_data.next()){
                        out.print(" / " + db_data.getInt("profilesID"));
                        out.print(" / " + db_data.getString("name"));
                        out.print(" / " + db_data.getString("tel"));
                        out.print(" / " + db_data.getInt("age"));
                        out.print(" / " + db_data.getString("birthday") + "<br>");
                    }

                    if(db_data.last() == false){
                        out.print("<br>★追加処理<br>");
                        db_st = db_con.prepareStatement("insert into profiles (profilesID,name,tel,age,birthday) values (?,?,?,?,?)");
                        db_st.setInt(1,id);
                        db_st.setString(2,request.getParameter("myname"));
                        db_st.setString(3,request.getParameter("mytel"));
                        db_st.setInt(4,age);
                        db_st.setString(5,request.getParameter("mybirth"));
                        db_up = db_st.executeUpdate();
                    }else{
                        out.print("<br>★更新処理<br>");
                        db_st = db_con.prepareStatement("update profiles set name=?, tel=?, age=?, birthday=? where profilesID = ?");
                        db_st.setString(1,request.getParameter("myname"));
                        db_st.setString(2,request.getParameter("mytel"));
                        db_st.setInt(3,age);
                        db_st.setString(4,request.getParameter("mybirth"));
                        db_st.setInt(5,id);
                        db_up = db_st.executeUpdate();
                    }

                    //クローズ処理
                    db_data.close();
                    db_st.close();
                    db_con.close();
                }
            }else if(btn.equals("削除")){
                boolean del = false;

                //データベースへの接続
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Challenge_db","root","");

                db_st = db_con.prepareStatement("select * from profiles");

                //SQL文を実行
                db_data = db_st.executeQuery();
                while(db_data.next()){
                    if(id == db_data.getInt("profilesID")){
                        del = true;
                        break;
                    }
                }

                if(del == true){
                    //SQL文を設定
                    db_st = db_con.prepareStatement("delete from profiles where profilesID = ?");
                    db_st.setInt(1,id);

                    //SQL文を実行
                    out.print("<br>★削除処理<br>" + "<br>");
                    db_up = db_st.executeUpdate();

                }else{
                    out.print("該当レコードなし" + "<br>");
                }

                //クローズ処理
                db_data.close();
                db_st.close();
                db_con.close();
            }
                
            //レコードを全件表示★
            //データベースへの接続
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Challenge_db","root","");

            //SQL文を設定
            db_st = db_con.prepareStatement("select * from profiles");
            out.print("<br>全件レコード表示<br>");
            db_data = db_st.executeQuery();
            while(db_data.next()){
                out.print(" / " + db_data.getInt("profilesID"));
                out.print(" / " + db_data.getString("name"));
                out.print(" / " + db_data.getString("tel"));
                out.print(" / " + db_data.getInt("age"));
                out.print(" / " + db_data.getString("birthday") + "<br>");
            }

            //クローズ処理
            db_data.close();
            db_st.close();
            db_con.close();

            out.println("</body>");
            out.println("</html>");
        } catch(Exception e){
            System.out.println(e);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
