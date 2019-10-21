<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/css/materialize.min.css">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
<title>Alucar</title>
</head>
<body>
	<div class="container">
		<form method="post" action="/alucar/updateById" class="col s12">
			<div class="row">
				<div class="input-field col s6">
					<label for="nome">Nome Completo</label> <input id="nome"
						type="text" name="nome" class="validate" value="${usuario.nome}">
						<form:errors path="usuario.nome"></form:errors>
				</div>
			</div>
			<input type="hidden" name="id" value="${usuario.id }">
			<div>
				<label>E-mail</label> <input type="email" name="email" value="${usuario.email}">
				<form:errors path="usuario.email"></form:errors>
			</div>
			<div>
				<label>CPF</label> <input type="text" name="cpf" value="${usuario.cpf}">
				<form:errors path="usuario.cpf"></form:errors>
			</div>
			<div>
				<label>RG</label> <input type="text" name="rg" value="${usuario.rg}">
				<form:errors path="usuario.rg"></form:errors>
			</div>

			<label>Data de Nascimento</label> <input type="date" name="nasc" pattern="dd/MM/yyyy"/>
			<form:errors path=""></form:errors>

			<div>
				<label>Telefone</label> <input type="text" name="tel" value="${usuario.tel}">
				<form:errors path="usuario.tel"></form:errors>
			</div>
			<div>
				<label>Nome de usuário</label> <input type="text" name="nomeUsu" value="${usuario.nomeUsu}">
				<form:errors path="usuario.nomeUsu"></form:errors>
			</div>
			<div>
				<label>Senha</label> <input type="password" name="senha" value="${usuario.senha}">
				<form:errors path="usuario.senha"></form:errors>
			</div>
			<br />
			<button type="submit">Cadastrar</button>

		</form>
	</div>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/js/materialize.min.js"></script>
	<script type="text/javascript"
		src="https://code.jquery.com/jquery-3.2.1.min.js"></script>

</body>
</html>