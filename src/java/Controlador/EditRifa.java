package Controlador;

import entidades.EJB.BoleteriaFacade;
import entidades.EJB.PerfilesFacade;
import entidades.EJB.RifaFacade;
import entidades.EJB.UsuariosFacade;
import entidades.Rifa;
import entidades.Usuarios;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
@WebServlet(name = "EditRifa", urlPatterns = {"/EditRifa"})
public class EditRifa extends HttpServlet {
    @EJB
    private RifaFacade rifaFacade;
    
    @EJB
    private BoleteriaFacade boleteriaFacade;

        
    @EJB
    private UsuariosFacade usuariosFacade;

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
        String premio= request.getParameter("premio");
        int idBoleteria= Integer.parseInt(request.getParameter("idBoleteria"));
        int idUsuarios= Integer.parseInt(request.getParameter("idUsuarios"));
         boolean esNuevo= ($id== null || $id.isEmpty());

        Rifa rifa;

        try {
            if(esNuevo){
                rifa = new Rifa();
                rifa.setPremio(premio);
                rifa.setIdBoleteria(boleteriaFacade.find(idBoleteria));
                rifa.setIdUsuarios(usuariosFacade.find(idUsuarios));

                rifaFacade.create(rifa);
            
            }else{
                int id= Integer.parseInt($id);    
                rifa = rifaFacade.find(id);
                rifa.setPremio(premio);
                rifa.setIdBoleteria(boleteriaFacade.find(idBoleteria));
                rifa.setIdUsuarios(usuariosFacade.find(idUsuarios));

                rifaFacade.edit(rifa);
            }
            

           // RequestDispatcher rd =request.getRequestDispatcher("/alumno_reg_success.jsp");
           RequestDispatcher rd =request.getRequestDispatcher("consulta");
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