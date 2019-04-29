/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import entidades.Apuesta;
import entidades.EJB.ApuestaFacade;
import entidades.EJB.BoleteriaFacade;
import entidades.EJB.PartidoFacade;
import entidades.EJB.UsuariosFacade;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "InsApu", urlPatterns = {"/InsApu"})
public class InsApu extends HttpServlet {

    @EJB
    private ApuestaFacade apuestaFacade;

    @EJB
    private BoleteriaFacade boleteriaFacade;

    @EJB
    private UsuariosFacade usuariosFacade;

    @EJB
    private PartidoFacade partidoFacade;

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
           try {
            int id= Integer.parseInt(request.getParameter("id"));
            int marcador1= Integer.parseInt(request.getParameter("marcador1"));
            int marcador2= Integer.parseInt(request.getParameter("marcador2"));
            int usuario= Integer.parseInt(request.getParameter("usuario"));
            int precio= Integer.parseInt(request.getParameter("precio"));
            
            Apuesta apuesta = new Apuesta();
            
            apuesta.setIdPartido(partidoFacade.find(id));
            apuesta.setIdUsuarios(usuariosFacade.find(usuario));
            apuesta.setIdBoleteria(boleteriaFacade.find(precio));
            apuesta.setMarcador1(marcador1);
            apuesta.setMarcador2(marcador2);
            
            apuestaFacade.create(apuesta);
            RequestDispatcher rd =request.getRequestDispatcher("Cosntapuesta");
            rd.forward(request, response);
          
            
        /*
             System.out.print(id);
             System.out.print(usuario);
             System.out.print(precio);
             System.out.print(marcador1);
             System.out.print(marcador2);
             */
           } catch (Exception e) {
           System.out.print("Error");
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
