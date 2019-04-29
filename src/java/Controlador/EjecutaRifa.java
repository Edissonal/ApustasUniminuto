/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import java.util.ArrayList; 
import java.util.List; 
import java.util.Random; 
import entidades.Apuesta;
import entidades.Boleteria;
import entidades.EJB.BoleteriaFacade;
import entidades.EJB.ApuestaFacade;
import entidades.EJB.PerfilesFacade;
import entidades.EJB.RifaFacade;
import entidades.EJB.UsuariosFacade;
import entidades.Rifa;
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
 * @author ealonso
 */
@WebServlet(name = "EjecutaRifa", urlPatterns = {"/EjecutaRifa"})
public class EjecutaRifa extends HttpServlet {

    @EJB
    private ApuestaFacade apuestaFacade;
    
        @EJB
    private UsuariosFacade usuariosFacade; 
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       
          List<Apuesta> apuesta=apuestaFacade.findAll();
          
          
          Random rand = new Random(); 
          Apuesta winer = apuesta.get(rand.nextInt(apuesta.size())); 

          
          request.setAttribute("ganador", winer);
          RequestDispatcher rd =request.getRequestDispatcher("rifa.jsp");
          
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