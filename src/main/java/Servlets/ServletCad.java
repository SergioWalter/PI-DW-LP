/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import DAOs.DAOUsuario;
import Entidade.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sergio Walter Junior
 */
@WebServlet(name = "ServletCad", urlPatterns = {"/ServletCad"})
public class ServletCad extends HttpServlet {

    List<Usuario> lista = new ArrayList<>();
    DAOUsuario controle = new DAOUsuario();

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
        String a = request.getParameter("Cadastrar");
        if (a.equals("Vai!")) {      
            
            try (PrintWriter out = response.getWriter()) {
                List<Usuario> dados = savePrint(request.getParameter("Logincad"), request.getParameter("Senhacad"), request.getParameter("Emailcad"));
                String aux[];
                aux = String.valueOf(dados).split(";");                
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet ServletCad</title>");
                out.println("</head>");
                out.println("<body>");                
                out.println("<h1>" + aux[0].substring(1) +aux[1]+aux[2].substring(0,aux[2].length()-1)+"</h1>");
                out.println("</body>");
                out.println("</html>");
            }
            
        }
        if (a.equals("Listar")) {       
            
            DAOs.DAOUsuario daoUsuario = new DAOs.DAOUsuario();
            
            List<Usuario> listinha = daoUsuario.listInOrderNome();
            
            request.setAttribute("Usuario", listinha);
            RequestDispatcher rd = request.getRequestDispatcher("nonejsp_1.jsp");
            rd.forward(request, response);
            
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

    private List<Usuario> savePrint(String login, String senha, String email) {

        Usuario usuario = new Usuario();

        usuario.setNome(login);
        usuario.setEmail(email);
        usuario.setSenha(senha);
        controle.inserir(usuario);

        List<Usuario> dados = new ArrayList<>();
        dados = controle.listByNome(login);
        System.out.println(dados);
        return dados;
    }
}
