<%-- 
    Document   : game
    Created on : 14 ene 2024, 2:04:39
    Author     : jeiny
--%>


<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.mycompany.basket.logic.Team"%>
<%@page import="com.mycompany.basket.logic.Controller"%>
<!doctype html>
<html lang="en">
    <head>
        <meta charset="utf-8">

        <meta name="viewport" content="width=device-width, initial-scale=1" />

        <title>Games</title>
        <link rel="stylesheet" media="all" href="style.css"/>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <h1>BASKETBALL GAME</h1>
            </div>
            <div class="row">
                <h4 style="text-align:center">Talent wins games, but teamwork and intelligence win championships.</br> (Michael Jordan)</h4>
            </div>

            <%Controller controller = new Controller();%>

            <form action="SvGame" method="POST">
                <div class="container-wrapper">
                    <div class=" row input-container ">
                        <div class="col-xs-12">
                            <div class="styled-input wide">
                                <input type="text" id="name" name="gameName" required placeholder="Game name">
                                <label for="name"></label>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="container-wrapper">
                    <div class="row input-container">
                        <div class="styled-input wide">
                            <input name="gameResult" id="gameResult" type="text" required placeholder="Results" />
                            <label for="gameResult"></label> 
                        </div>
                    </div>
                </div>

                <div class="container-wrapper">
                    <div class="row input-container">
                        <div class="styled-input wide">
                            <input type="date" id="start" name="localDate" min="2024-01-01" max="2025-12-31" />
                            <label for="start"></label>
                        </div>
                    </div>
                </div>

                <div class="container-wrapper">
                    <div class="container">
                        <label for="lang">TEAM 1</label>
                        <select name="team1" id="lang">
                            <%for (Team team : controller.getTeamList()) {%>
                            <option value="<%= team.getName()%>"><%= team.getName()%></option>
                            <%}%>
                        </select>
                    </div>
                    <div class="container">
                        <label for="lang">Team 2</label>
                        <select name="team2" id="lang">
                            <%for (Team team : controller.getTeamList()) {%>
                            <option value="<%= team.getName()%>"><%= team.getName()%></option>
                            <%}%>
                        </select> 
                    </div>
                </div>
                <div class="col-xs-12">
                    <button type="submit" class="btn-lrg submit-btn">GO!</button>
                </div> 
            </form>
        </div>
    </body>
</html>
