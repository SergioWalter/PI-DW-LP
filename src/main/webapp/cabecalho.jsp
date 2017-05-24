<%-- 
    Document   : cabecalho
    Created on : 31/03/2017, 11:38:15
    Author     : Sergio Walter Junior
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<header class = "cabecalho">
    <div>
        <a href="index.jsp"><img id = "logo" src="img\logo.png" alt="Logo" width="35%"/></a>  
        <form action="ServletAula" method="post">
            <div id = "logar">
                <label> Login: <label/>
                    <input type = "text" name = "Login">
                    <label> Senha: <label/>
                        <input type = "password" name = "Senha">
                        <input type = "submit" name = "Enviar">
                        <a href="cadastro.jsp"><input type="button" name="Cadastrar" value="Cadastrar"></a>
                        </div>
                        </form>
                        </div>   
                        </header> 
