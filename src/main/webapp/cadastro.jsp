<%-- 
    Document   : nonejsp
    Created on : 31/03/2017, 10:51:36
    Author     : Sergio Walter Junior
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>S.W. Junior - Gado Bovino</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">        
        <link rel="stylesheet" type="text/css" href="css\StyleSheet.css"/>
    </head>
    <body>
        <%@include file="cabecalho_1.jsp"%>
        <form action="ServletCad" method="post">
        <div id = "cadastra">
            <p id="titulo">Cadastro</p>
            <div id ="logcampo">
            <label> Login: <label/>
                <input type = "text" name = "Logincad" size="40"></br>
                </div>
            <div id ="logcampo">
                <label> Senha: <label/>
                    <input type = "password" name = "Senhacad" size="39"></br>
                    </div>
            <div id ="logcampo">
                <label> Email: <label/>
                    <input type = "text" name = "Emailcad" size="40"></br>
                    </div>
            <div id ="logcampo">
                    <input type = "submit" name = "Cadastrar">
            </div>
                    </div>
        </form>
                    </body>
                    </html>
