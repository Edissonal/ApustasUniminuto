/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import entidades.EJB.TipoDeporteFacade;
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
@WebServlet(name = "InserDeporte", urlPatterns = {"/InserDeporte"})
public class InserDeporte extends HttpServlet {

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
                    String nombredepor= request.getParameter("nombredepor");


                boolean esNuevo= ($id== null || $id.isEmpty());

                TipoDeporte deporte;


        try {
           
            if(esNuevo){
            
            deporte = new TipoDeporte();
            deporte.setNombDepor(nombredepor);

            
            
            tipoDeporteFacade.create(deporte);
            
            
            }else{
   
            int id= Integer.parseInt($id);    
            deporte = tipoDeporteFacade.find(id);
            deporte.setNombDepor(nombredepor);

                tipoDeporteFacade.edit(deporte);
            }
            

           // RequestDispatcher rd =request.getRequestDispatcher("/alumno_reg_success.jsp");

           RequestDispatcher rd =request.getRequestDispatcher("ConsulDeporte");
           //request.setAttribute("alumno", alumno);
            rd.forward(request, response);
        } catch (Exception e) {
           System.out.print("Error");
        }      
        
    
}

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
