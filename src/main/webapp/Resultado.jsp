<%@page language="java" contentType="text/html; charset=UTF-8"%>
    pageEncoding="UTF-8">
<!DOCTYPE html>
<html>
<head>
<meta charset="UTP-8">
<title>Insert title here</title>
</head>
<body>
<h1> Usuario registro</h1>
<p>Usuario:<%= request. getAttribute("usuario") %></p>
<p>Correo: <%= request. getAttribute("correo") %></p>
<p>Genero: <%= request. getAttribute("genero") %></p>
<p>Fecha:  <%= request. getAttribute("fecha") %></p>
</body>
</html>