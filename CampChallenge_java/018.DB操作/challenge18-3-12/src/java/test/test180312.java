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
public class test180312 extends HttpServlet {

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
            out.println("名前：" + request.getParameter("myname") + "<br>");
            out.println("年齢：" + request.getParameter("myage") + "<br>");
            out.println("誕生日：" + request.getParameter("mybirth") + "<br>");
            out.println("検索条件：" + request.getParameter("myradio") + "<br>" + "<br>");
            
            String name = request.getParameter("myname");
            int age = Integer.parseInt(request.getParameter("myage"));
            String birth = request.getParameter("mybirth");
            String radio = request.getParameter("myradio");
            
            //OR検索とAND検索で処理を分岐
            if(radio.equals("OR")){
                //データベースへの接続
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Challenge_db","root","");

                //SQL文を設定
                db_st = db_con.prepareStatement("select * from profiles where name = ? or age = ? or birthday = ?");
                db_st.setString(1,name);
                db_st.setInt(2,age);
                db_st.setString(3,birth);

                //SQL文を実行
                out.print("★検索結果（OR条件）" + "<br>");
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
            } else if(radio.equals("AND")){
                //データベースへの接続
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Challenge_db","root","");

                //SQL文を設定
                db_st = db_con.prepareStatement("select * from profiles where name = ? and age = ? and birthday = ?");
                db_st.setString(1,name);
                db_st.setInt(2,age);
                db_st.setString(3,birth);

                //SQL文を実行
                out.print("★検索結果（AND条件）" + "<br>");
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
            }

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
