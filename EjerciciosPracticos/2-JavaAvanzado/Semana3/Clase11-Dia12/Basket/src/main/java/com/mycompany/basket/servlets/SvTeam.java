package com.mycompany.basket.servlets;

import com.mycompany.basket.logic.Controller;
import com.mycompany.basket.logic.Game;
import com.mycompany.basket.logic.Team;
import java.io.IOException;
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
 * @author jeiny
 */
@WebServlet(name = "SvTeam", urlPatterns = {"/SvTeam"})
public class SvTeam extends HttpServlet {

    Controller controller = new Controller();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

        List<Game> games = new ArrayList<Game>();

        String selectTeam = request.getParameter("team");
        System.out.println("el equipo elegido : " + selectTeam);
        for (Team team : controller.getTeamList()) {
            if (team.getName().equals(selectTeam)) {
                for (Game game : controller.getGameList()) {
                    if (game.getTeam().getId() == team.getId()) {
                        System.out.println("g" + game.toString());
                        games.add(game);
                    }
                }
                team.setGames(games);
                System.out.println(team.toString());
                request.setAttribute("selectTeam", team);

            }
        }
        // Obtener el despachador de solicitudes
        RequestDispatcher dispatcher = request.getRequestDispatcher("team.jsp");

        // Enviar la solicitud y la respuesta al recurso "team.jsp"
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

        String name = request.getParameter("teamName");

        Team team = new Team();
        team.setName(name);
        controller.addTeam(team);

        response.sendRedirect("index.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
