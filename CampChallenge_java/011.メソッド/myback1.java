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

/**
 *
 * @author you
 */
@WebServlet(name = "myback1", urlPatterns = {"/myback1"})
public class myback1 extends HttpServlet {

    public boolean arg3(PrintWriter pw, int num1, int num2, boolean num3){
        if(num3==true){
            pw.print(num1 + "*" + num2 + "^2 =" + (num1*num2*num1*num2) + "<br>");
            return true;
        }
        else{
            pw.print(num1 + "*" + num2 + " = " + (num1*num2) + "<br>");
            return false;
        }
    }
    
    public boolean arg3(PrintWriter pw, int num1){
        return arg3(pw,num1,5,false);
    }
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

        PrintWriter out = response.getWriter();
        
        //「１０」と「３」とtrue
        if(arg3(out,10,3,true) == true){ out.print("この処理は正常に実行されました。<br>"); }
        else{ out.print("この処理はデフォルト値で実行されました。<br>"); }
        //「１０」と「３」とfalse
        if(arg3(out,10,3,false) == true){ out.print("この処理は正常に実行されました。<br>"); }
        else{ out.print("この処理はデフォルト値で実行されました。<br>"); }
        //「１０」でデフォルト
        if(arg3(out,10) == true){ out.print("この処理は正常に実行されました。<br>"); }
        else{ out.print("この処理はデフォルト値で実行されました。<br>"); }
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
