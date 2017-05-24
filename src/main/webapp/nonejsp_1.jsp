<%-- 
    Document   : nonejsp
    Created on : 31/03/2017, 10:51:36
    Author     : Sergio Walter Junior
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head>
        <title>S.W. Junior - Gado Bovino</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">        
        <link rel="stylesheet" type="text/css" href="css\StyleSheet.css"/>
    </head>
    <body>
        <%@include file="cabecalho_1.jsp"%>
        <table style ="width: 100%" border="1">
            <tr>
                <th>Nome</th>
                <th>Senha</th>
                <th>Email</th>
            </tr>
            <c:forEach var="usuario" items="${Usuario}">
                <tr>
                    <th>${usuario.nome}</th>
                    <th>${usuario.senha}</th>
                    <th>${usuario.email}</th>
                    
                </tr>
                
            </c:forEach>
        </table>
                        </body>
                        </html>
