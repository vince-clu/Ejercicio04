/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author al036007
 */
public class Acceso extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
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
        String user = request.getParameter("user");
        String pass = request.getParameter("pass");
        try {
            if (user.equals("admin") && pass.equals("admin")) {
                response.sendRedirect("manu.jsp");

            } else {

                response.sendRedirect("index.jsp");
            }

        } finally {
            out.close();
        }



    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
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

        //   String inputText = request.getParameter("dato");
        // String form= request.getParameter("form");
//                 getServletContext().getRequestDispatcher("/jotaesepe.jsp")
//                        .forward(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String accion = request.getParameter("form");
        String destino = null;

        switch (accion) {
            case "form1":
                String nume = request.getParameter("numero");
                int num = Integer.parseInt(nume);

                int cuadrado = 0;

                cuadrado = num * num;

                request.setAttribute("cuadrado", cuadrado);
                request.setAttribute("num", num);
                destino = "/cuadrado.jsp";
                break;
            case "form2":
                String nombre = request.getParameter("dato");
                
                request.setAttribute("nombre", nombre);
                
                destino = "/jotaesepe.jsp";
        }



        ServletContext cont = getServletConfig().getServletContext();
        RequestDispatcher reqDispatcher = cont.getRequestDispatcher(destino);
        reqDispatcher.forward(request, response);
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
