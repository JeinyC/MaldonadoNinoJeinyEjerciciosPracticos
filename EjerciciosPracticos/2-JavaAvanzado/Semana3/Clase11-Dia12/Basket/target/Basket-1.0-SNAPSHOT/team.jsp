<%-- 
    Document   : team
    Created on : 13 ene 2024, 18:01:33
    Author     : jeiny
--%>

<%@page import="com.mycompany.basket.logic.Game"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.mycompany.basket.logic.Team"%>
<%@page import="com.mycompany.basket.logic.Controller"%>
<!doctype html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <title>Teams</title>
        <link rel="stylesheet" media="all" href="style.css"/>
    </head>
    <body>

        <div class="row">
            <h1>New Team</h1>
        </div>
        <div class="row">
            <h4 style="text-align:center">Talent wins games, but teamwork and intelligence win championships.</br> (Michael Jordan)</h4>
        </div>
        <form action="SvTeam" method="post">
            <div class="row input-container">
                <div class="col-xs-12">
                    <div class="styled-input wide">
                        <input type="text" id="name" name="teamName" placeholder="Name">
                        <label for="name"></label>
                    </div>
                </div>
            </div>

            <div class="container">
                <div class="row input-container">
                    <button type="submit"class="btn-lrg submit-btn">GO !</button>
                </div>  
            </div> 
        </form>

        <div class="container">
            <%Controller controller = new Controller();%>
            <form action="SvTeam" method="get" id="getForm">
                <div class="row input-container">
                    <div class="col-xs-12">
                        <div class="col-xs-12">
                            <label for="lang">Select Team</label>
                            <select name="team" id="lang">
                                <%for (Team team : controller.getTeamList()) {%>
                                <option value="<%= team.getName()%>"><%= team.getName()%></option>
                                <%}%>
                            </select> 
                        </div>
                    </div>
                </div>
                <div class="container">
                    <div class="row input-container">
                        <button type="submit"class="btn-lrg submit-btn">Choose Team !</button>
                    </div>  
                </div> 
            </form>             
        </div>

        <div class="container">
            <div class="row">
                <% if (request.getAttribute("selectTeam") != null) {%>
                <h2>Team Information</h2>
                <table>
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Name</th>
                            <th>Total Games</th>
                        </tr>
                    </thead>
                    <tbody>
                        <% Team team = (Team) request.getAttribute("selectTeam");%>
                        <% List<Game> games = team.getGames();%>
                        <tr>
                            <td><%= team.getId()%></td>
                            <td><%= team.getName()%></td>
                            <td><%= games.size()%></td>
                        </tr>
                    </tbody>
                </table>

                <div class="row">
                    <h2><%= team.getName()%> Games</h2>
                    <table>
                        <thead>
                            <tr>
                                <th>Game</th>
                                <th>Date</th>
                                <th>Results</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%for (Game game : games) {%>
                            <tr>
                                <td><%= game.getGame()%></td>
                                <td><%= game.getDate()%></td>
                                <td><%= game.getResults()%></td>
                            </tr>
                            <%}%>
                        </tbody>
                    </table>
                </div>
                <%}%>
            </div>
        </div>
            <div class="container">
                    <div class="row input-container">
                        <a href="index.jsp" class="btn-lrg submit-btn">Back to Index</a>
                    </div>  
                </div> 
        <div class="row input-container">
            
        </div>
    </body>
</html>
