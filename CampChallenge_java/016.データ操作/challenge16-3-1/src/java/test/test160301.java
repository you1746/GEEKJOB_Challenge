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

/**
 *
 * @author you
 */
public class test160301 extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet test160301</title>");            
            out.println("</head>");
            out.println("<body>");
            
            request.setCharacterEncoding("UTF-8");
            out.print("受け取った情報は："+ request.getParameter("total") + "・" + 
                    request.getParameter("count") + "・" + request.getParameter("type") + "です。");
            out.print("<br>");
            out.print("<br>");
            
            int mytotal = Integer.parseInt(request.getParameter("total"));
            int mycount = Integer.parseInt(request.getParameter("count"));
            int mytype = Integer.parseInt(request.getParameter("type"));
            
            out.print("種別：");
            switch(mytype){
                case 1:
                    out.print("雑貨<br>");
                    break;
                case 2:
                    out.print("生鮮食品<br>");
                    break;
                case 3:
                    out.print("その他<br>");
                    break;
            }
            out.print("<br>");
            
            out.print("単価：" + (mytotal / mycount) + "<br>");
            
            int point = 0;
            out.print("今回の追加ポイント：");
            if(mytotal >= 5000){
                point = 5;
                out.print("(" + point + "%)　" + (mytotal*point/100));
            }
            else if(mytotal >=3000 && mytotal < 5000){
                point = 4;
                out.print("(" + point + "%)　" + (mytotal*point/100));
            }
            else{
                out.print("なし");
            }
                
            
            out.println("</body>");
            out.println("</html>");
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
