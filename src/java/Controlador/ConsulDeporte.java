/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import entidades.EJB.TipoDeporteFacade;
import entidades.TipoDeporte;
import entidades.Usuarios;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dicita
 */
@WebServlet(name = "ConsulDeporte", urlPatterns = {"/ConsulDeporte"})
public class ConsulDeporte extends HttpServlet {

    @EJB
<<<<<<< HEAD:src/java/Controlador/rifa.java
    private RifaFacade rifaFacade;

 
=======
    private TipoDeporteFacade tipoDeporteFacade;
>>>>>>> e262f9b2c49ecb2526f9ff5d2bb4d327c57faf74:src/java/Controlador/ConsulDeporte.java

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
        List<TipoDeporte>  tdeportes=tipoDeporteFacade.findAll();
          request.setAttribute("tdeportes", tdeportes);
          RequestDispatcher rd =request.getRequestDispatcher("/ConsulDeporte.jsp");
          
          rd.forward(request, response);
<<<<<<< HEAD:src/java/Controlador/rifa.java
   }
=======
    }
>>>>>>> e262f9b2c49ecb2526f9ff5d2bb4d327c57faf74:src/java/Controlador/ConsulDeporte.java

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
