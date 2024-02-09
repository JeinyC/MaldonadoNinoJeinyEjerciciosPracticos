package com.mycompany.basket.servlets;

import com.mycompany.basket.logic.Controller;
import com.mycompany.basket.logic.Game;
import com.mycompany.basket.logic.Team;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jeiny
 */
@WebServlet(name = "SvGame", urlPatterns = {"/SvGame"})
public class SvGame extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
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

        Controller controller = new Controller();

        Game game = new Game();
        List<Team> teams = new ArrayList<>();

        String team1 = request.getParameter("team1");
        String team2 = request.getParameter("team2");
        String nameGame = request.getParameter("gameName");
        String result = request.getParameter("gameResult");
        String dateString = request.getParameter("localDate");
       
        LocalDate localDate = LocalDate.parse(dateString);
        
        if (!team1.equals(team2)) {
            System.out.println("Opción 1: " + team1);
            for (Team team : controller.getTeamList()) {
                if (team.getName().equals(team1)|| team.getName().equals(team2)) {
                    teams.add(team);
                }
            }
        }

        game.setGame(nameGame);
        game.setResults(result);
        game.setDate(localDate);
        
        for(Team team : teams){
            game.setTeam(team);
            controller.addGame(game);
        }
        
        response.sendRedirect("index.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
