/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Cliente;


public class sr_cliente extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    Cliente cliente;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet sr_cliente</title>");            
            out.println("</head>");
            out.println("<body>");
            //out.println("<h1>Servlet sr_cliente at " + request.getContextPath() + "</h1>");
            
            cliente= new Cliente(request.getParameter("txt_nit"), Integer.valueOf(request.getParameter("txt_id_cliente")), request.getParameter("txt_nombres"), request.getParameter("txt_apellidos"),request.getParameter("txt_direccion"),request.getParameter("txt_telefono"),request.getParameter("txt_nacimiento"));
            if("Agregar_cliente".equals(request.getParameter("btn_agregar_cliente")))
            {
                if (cliente.agregar()>0)
                {
                    response.sendRedirect("Cliente.jsp");
                }
                else
                {
                    String imagen ="https://i.pinimg.com/564x/3f/11/a0/3f11a0f764a27157ab310a0b1bc29e86.jpg";
                    out.println("<p>Error</p>");
                    out.println("<img src="+imagen);
                }
            }
            if("modificar_cliente".equals(request.getParameter("btn_modificar_cliente")))
            {
                if (cliente.modificar()>0)
                {
                    response.sendRedirect("Cliente.jsp");
                }
                else
                {
                    String imagen ="https://i.pinimg.com/564x/3f/11/a0/3f11a0f764a27157ab310a0b1bc29e86.jpg";
                    out.println("<p>Error</p>");
                    out.println("<img src="+imagen);
                }
            }
            if("eliminar_cliente".equals(request.getParameter("btn_eliminar_cliente")))
            {
                if (cliente.eliminar()>0)
                {
                    response.sendRedirect("Cliente.jsp");
                }
                else
                {
                    String imagen ="https://i.pinimg.com/564x/3f/11/a0/3f11a0f764a27157ab310a0b1bc29e86.jpg";
                    out.println("<p>Error</p>");
                    out.println("<img src="+imagen);
                }
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