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
@WebServlet(name = "myarguback2", urlPatterns = {"/myarguback2"})
public class myarguback2 extends HttpServlet {
    public String[] arg5(PrintWriter pw, int num){
        String[] data1 = {"001","002","003"};
        String[] data2 = {"東京太郎","大阪次郎","京都三郎"};
        String[] data3 = {"1999年9月9日","2001年1月1日","2003年3月3日"};
        String[] data4 = {"東京都","","京都府"};
    
        String[] data = {data2[num], data3[num], data4[num]};
        
        return data;
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
        int i,j,check;
        
        for(i=0; i<3; i++){
            data = arg5(out,i);
            check = 0;
            for(j=0; j<data.length; j++){
                if(data[j] == ""){
                    check=1;
                    continue;
                }
            }
            if(check == 0){
                out.print(data[0] + "," + data[1] + "," + data[2] + "<br>");   
            }
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
