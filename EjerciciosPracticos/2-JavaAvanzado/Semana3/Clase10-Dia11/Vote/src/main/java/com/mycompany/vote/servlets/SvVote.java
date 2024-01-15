package com.mycompany.vote.servlets;

import com.mycompany.vote.logic.Team;
import com.mycompany.vote.services.ServiceVote;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jeiny
 */
@WebServlet(name = "SvVote", urlPatterns = {"/SvVote"})
public class SvVote extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response){
            
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        ServiceVote serviceVote = new ServiceVote();
        String value = request.getParameter("team");
        
        System.out.println("Elección: " + value);
        int id = Integer.parseInt(value);
        
        Team team = serviceVote.getTeam(id);
        team.setVote(1);
        serviceVote.updateTeam(team);
        
        response.sendRedirect("index.jsp");
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
