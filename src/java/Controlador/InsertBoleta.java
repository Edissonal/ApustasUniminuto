/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import entidades.Boleteria;
import entidades.EJB.BoleteriaFacade;
import entidades.EJB.UsuariosFacade;
import entidades.Usuarios;
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
@WebServlet(name = "InsertBoleta", urlPatterns = {"/InsertBoleta"})
public class InsertBoleta extends HttpServlet {

    @EJB
    private UsuariosFacade usuariosFacade;

    @EJB
    private BoleteriaFacade boleteriaFacade;

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
            int precio= Integer.parseInt(request.getParameter("precio"));
            int cantidad= Integer.parseInt(request.getParameter("cantidad"));
            int usuarios= Integer.parseInt(request.getParameter("usuario"));
            
              boolean esNuevo= ($id== null || $id.isEmpty());
            
            Boleteria boleta;


        try {
           
            if(esNuevo){
            
            boleta = new Boleteria();
            boleta.setPrecio(precio);
            boleta.setCantidad(cantidad);
            boleta.setIdUsuarios(usuariosFacade.find(usuarios));
            
            boleteriaFacade.create(boleta);
            
            
            }else{
   
            int id= Integer.parseInt($id);    
            boleta =  boleteriaFacade.find(id);
            boleta.setPrecio(precio);
            boleta.setCantidad(cantidad);
            boleta.setIdUsuarios(usuariosFacade.find(usuarios));
                
                boleteriaFacade.edit(boleta);
            }
            

           // RequestDispatcher rd =request.getRequestDispatcher("/alumno_reg_success.jsp");
           RequestDispatcher rd =request.getRequestDispatcher("ConsBoleteria");
           //request.setAttribute("alumno", alumno);
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
