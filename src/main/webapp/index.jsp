<%-- 
    Document   : newjsp
    Created on : 31/03/2017, 10:46:03
    Author     : Sergio Walter Junior
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>S.W. Junior - Gado Bovino</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">        
        <link rel="stylesheet" type="text/css" href="StyleSheet.css"/>
    </head>
    <body>
        <header class = "cabecalho">
            <div>
                <img id = "logo" src="logo.png" alt="Logo" width="35%"/>  
                <form action="CadBoi" method="post">
                <div id = "logar">
                <label> Login: <label/>
                    <input type = "text" name = "login">
                    <label> Senha: <label/>
                        <input type = "password" name = "senha">
                        <input type = "submit" name = "enviar">
                        </div>
                </form>
                        </div>   
                        </header>  
        <div id = "cadastro"> <a href="index_1.html"><img class ="borda" src="brinco.png" width="300px" height="300px"/></a> </div>
        <div id = "config"> <a href="index_1.html"><img class ="borda" src="ferrar.png" width="300px" height="300px"/></a> </div>
                        </body>
                        </html>
