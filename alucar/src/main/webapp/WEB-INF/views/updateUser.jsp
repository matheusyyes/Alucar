<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>Id</td>
			<td>nome</td>
			<td>email</td>
			<td>tel</td>
			<td>nasc</td>
			<td>rg</td>
			<td>cpf</td>
		</tr>
		<c:forEach items="${usuarios}" var="usuario"  >
			<tr>
				<td>${usuario.id}</td>
				<td>${usuario.nome}</td>
				<td>${usuario.email}</td>
				<td>${usuario.tel}</td>
				<td><fmt:formatDate value="${usuario.nasc.time}" pattern="dd/MM/yyyy"/> </td>
				<td>${usuario.rg}</td>
				<td>${usuario.cpf}</td>
				<td><a href="alterarUser?id=${usuario.id}">Editar</a></td>
				<td><a href="delete?id=${i.count}">Excluir</a></td>
				
			</tr>
		</c:forEach>
	</table>
</body>
</html>