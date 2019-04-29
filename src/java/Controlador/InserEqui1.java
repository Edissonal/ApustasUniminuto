/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import entidades.EJB.EquipoFacade;
import entidades.EJB.TipoDeporteFacade;
import entidades.Equipo;
import entidades.TipoDeporte;
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
@WebServlet(name = "InserEqui1", urlPatterns = {"/InserEqui1"})
public class InserEqui1 extends HttpServlet {

    @EJB
    private EquipoFacade equipoFacade;

    @EJB
    private TipoDeporteFacade tipoDeporteFacade;

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
            String nombreequipo1= request.getParameter("nombreequipo1");
            int roll= Integer.parseInt(request.getParameter("roll"));

            
            
              boolean esNuevo= ($id== null || $id.isEmpty());
            
            Equipo equipo;


        try {
            
           
            if(esNuevo){
            
            equipo = new Equipo();
            equipo.setNombEquipo(nombreequipo1);
            equipo.setIdTipoDeporte(tipoDeporteFacade.find(roll));
            
            
            equipoFacade.create(equipo);
            
            
            }else{
   
            int id= Integer.parseInt($id);    
            equipo = equipoFacade.find(id);
            equipo.setNombEquipo(nombreequipo1);
            equipo.setIdTipoDeporte(tipoDeporteFacade.find(roll));
                
            equipoFacade.edit(equipo);
            }
            

           
           RequestDispatcher rd =request.getRequestDispatcher("ConsulEquipo1");
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
