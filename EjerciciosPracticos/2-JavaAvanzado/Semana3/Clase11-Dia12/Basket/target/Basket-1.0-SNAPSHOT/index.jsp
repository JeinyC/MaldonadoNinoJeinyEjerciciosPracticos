<%-- 
    Document   : index
    Created on : 13 ene 2024, 3:48:01
    Author     : jeiny
--%>

<%@page import="com.mycompany.basket.logic.Game"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1" />

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <link rel="stylesheet" media="all" href="style.css"/>
        <title>BASKET GAME</title>
    </head>
    <body>
        <h1>BASKET GAME</h1>
        <img src="pngwing.com.png">
        <div class="container-wrapper">
            <div onclick="redirectTeam()" class="container btn-lrg submit-btn">TEAM</div>
            <div onclick="redirectGame()" class="container btn-lrg submit-btn">GAME</div>
        </div>
            <script src="scripts.js"></script>
    </body>
</html>
