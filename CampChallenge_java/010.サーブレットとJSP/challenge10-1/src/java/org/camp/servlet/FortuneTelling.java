/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Date;
import java.util.Random;
import javax.servlet.RequestDispatcher;
import org.camp.servlet.ResultData;

/**
 *
 * @author you
 */
@WebServlet(name = "FortuneTelling", urlPatterns = {"/FortuneTelling"})
public class FortuneTelling extends HttpServlet {

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

        //運勢の配列を作成・初期化
        String luckList[] = {"大吉", "中吉", "吉", "半吉", "末小吉", "凶", "小凶", "半凶", "末凶", "凶", "大凶"};
        Random rand = new Random();
        //配列の要素数までの数値を返す乱数を初期値とする。
        Integer index = rand.nextInt(luckList.length);
                
//        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet TestServlet</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("運勢は、" + luckList[index] + "です。");
//            out.println("</body>");
//            out.println("</html>");
//        }

        //ResultDataクラスのインスタンスを作成
        ResultData data = new ResultData();
        //dataのDateフィールドに日付情を格納
        data.setD(new Date());
        //dataのluckフィールドに乱数から計算したluckList配列の一つを格納
        data.setLuck(luckList[index]);
        //DATAの名称で、data情報をﾘｸｴｽﾄｽｺｰﾌﾟへ格納
        request.setAttribute("DATA",data);
        
        //FortuneTellingResult.jspへ渡す情報をrdに格納
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/FortuneTellingResult.jsp");
        //
        rd.forward(request, response);       
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
