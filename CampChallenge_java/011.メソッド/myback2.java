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
@WebServlet(name = "myback2", urlPatterns = {"/myback2"})
public class myback2 extends HttpServlet {

    public String[] arg4(PrintWriter pw, int num){
        String[][] number = {
            {"001","東京太郎","1999年9月9日","東京都"},
            {"002","大阪次郎","2001年1月1日","大阪府"},
            {"","","",""}
        };
    
        if(num == 0){
            return number[0];
        }
        else if(num == 1){
            return number[1];
        }
        else{
            return number[2];
        }
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
        
        String[] data;
        
        data = arg4(out,0);
        out.print(data[0] + "," + data[1] + "," + data[2] + "," + data[3] + "<br>");
        data = arg4(out,1);
        out.print(data[0] + "," + data[1] + "," + data[2] + "," + data[3] + "<br>");
        data = arg4(out,2);
        out.print(data[0] + "," + data[1] + "," + data[2] + "," + data[3] + "<br>");
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
