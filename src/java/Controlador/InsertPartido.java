/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import entidades.EJB.Equipo2Facade;
import entidades.EJB.EquipoFacade;
import entidades.EJB.PartidoFacade;
import entidades.Partido;
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
 * @author Dicita
 */
@WebServlet(name = "InsertPartido", urlPatterns = {"/InsertPartido"})
public class InsertPartido extends HttpServlet {

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
            /*String nombreequipo1= request.getParameter("nombreequipo1");*/
            int equipo1= Integer.parseInt(request.getParameter("equipo1"));
            int equipo2= Integer.parseInt(request.getParameter("equipo2"));
            int marcequipo1= Integer.parseInt(request.getParameter("marcequipo1"));
            int marcequipo2= Integer.parseInt(request.getParameter("marcequipo2"));

            
            
              boolean esNuevo= ($id== null || $id.isEmpty());
            
            Partido partido;


        try {
            
           
            if(esNuevo){
            
            partido = new Partido();
            partido.setMarcadorEquip1(marcequipo1);
            partido.setMarcadorEquip2(marcequipo2);
            partido.setIdEquipo(equipoFacade.find(equipo1));
            partido.setIdEquipo2(equipo2Facade.find(equipo2));
            
            
            partidoFacade.create(partido);
            
            
            }else{
   
            int id= Integer.parseInt($id);    
            partido = partidoFacade.find(id);
            partido.setMarcadorEquip1(marcequipo1);
            partido.setMarcadorEquip2(marcequipo2);
            partido.setIdEquipo(equipoFacade.find(marcequipo1));
            partido.setIdEquipo2(equipo2Facade.find(marcequipo2));
                
            partidoFacade.edit(partido);
            }
            

           
           RequestDispatcher rd =request.getRequestDispatcher("ConsulPartido");
           rd.forward(request, response);
           
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
