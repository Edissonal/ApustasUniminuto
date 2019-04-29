/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import entidades.EJB.Equipo2Facade;
import entidades.EJB.EquipoFacade;
import entidades.EJB.PartidoFacade;
import entidades.Equipo;
import entidades.Equipo2;
import entidades.Partido;
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
@WebServlet(name = "EditPartido", urlPatterns = {"/EditPartido"})
public class EditPartido extends HttpServlet {

    @EJB
    private Equipo2Facade equipo2Facade;

    @EJB
    private EquipoFacade equipoFacade;

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

        
        String $id= request.getParameter("id");
           int id= Integer.parseInt($id);
          
           Partido  partido=partidoFacade.find(id);                  
           request.setAttribute("partido", partido);
           
           List<Equipo>  equipo1=equipoFacade.findAll();
           request.setAttribute("equipo1", equipo1);
           
           List<Equipo2>  equipo2=equipo2Facade.findAll();
           request.setAttribute("equipo2", equipo2);
           
           RequestDispatcher rd =request.getRequestDispatcher("/UpdatePartido.jsp");
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
