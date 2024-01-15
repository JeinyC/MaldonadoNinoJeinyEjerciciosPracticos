<%-- 
    Document   : index
    Created on : 11 ene 2024, 4:40:12
    Author     : jeiny
--%>

<%@page import="com.mycompany.vote.services.ServiceVote"%>
<%@page import="com.mycompany.vote.logic.Team"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!doctype html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>OS TEAM</title>
        <link rel="stylesheet" media="all" href="style.css" />
        <script>
            function showTable() {
                var table = document.getElementById("myTable");
                table.style.display = "table";
            }
        </script>
    </head>
    <body>
        <div class="feedback-card">
            <div class="feedback-header">
                VOTE NOW
            </div>
            <%
                ServiceVote serviceVote = new ServiceVote();
                if (serviceVote.getTeam(1) == null) {
                    Team windows = new Team(1, 0);
                    Team linux = new Team(2, 0);
                    Team ios = new Team(3, 0);

                    serviceVote.addTeam(windows);
                    serviceVote.addTeam(linux);
                    serviceVote.addTeam(ios);
                }

            %>
            <form class="feedback-body" action="SvVote"  method="POST">
                <div class="">
                    <input id="1" type="radio" name="team" value="1" class="">
                    <label class="feedback-body__message">Windows</label>
                </div>

                <div class="">
                    <input id="2" type="radio" name="team" value="2" class="">
                    <label class="feedback-body__message">Linux</label>
                </div>

                <div class="">
                    <input id="3" type="radio" name="team" value="3" class="">
                    <label class="feedback-body__message">IOS</label>
                </div>
                <button class="feedback-body_button">SEND</button>
            </form>
            <button onclick="showTable()" class="feedback-body_button">SHOW LIST</button> 
        </div>
        <br>
        <br>
        <br>
        <div class="feedback-card">
            <table id="myTable">

                <thead>
                <th>
                <tr>

                    <th>
                        <div class="feedback-header">TEAM</div>
                    </th>
                    <th><div class="feedback-header">VOTES</div>
                    </th>
                </tr>
                </th>
                </thead>

                <tbody>
                    <tr>
                        <td>Windows</td>
                        <%Team team1 = serviceVote.getTeam(1);%>
                        <td><%= team1.getVote()%></td>
                    </tr>
                    <tr>
                        <td>Linux</td>
                        <%Team team2 = serviceVote.getTeam(2);%>
                        <td><%= team2.getVote()%></td>
                    </tr>
                    <tr>
                        <td>IOS</td>
                        <%Team team3 = serviceVote.getTeam(3);%>
                        <td><%= team3.getVote()%></td>
                </tbody>
            </table>
        </div>
    </body>
</html>


