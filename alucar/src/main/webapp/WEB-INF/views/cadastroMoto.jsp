<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Alucar</title>
</head>
<body>

	<form method="post" action="gravarMoto">
		<p>
			Nome:<input type="text" name="nome">
			<form:errors path="motorista.nome"></form:errors>
		</p>
		<p>
			Idade:<input type="text" name="idade">
			<form:errors path="motorista.idade"></form:errors>
			
		</p>
		<p>
			Data de Nascimento:<input type="date" name="dataNascimento">
			<form:errors path="motorista.dataNascimento"></form:errors>
		</p>
		<p>
			Sexo: <input type="radio" value="homem" name="sexo">Masculino
			<input type="radio" value="mulher" name="sexo">Feminino
			<form:errors path="motorista.sexo"></form:errors>
		</p>
		<p>
			CPF:<input type="text" name="cpf">
			<form:errors path="motorista.cpf"></form:errors>
		</p>
		<p>
			RG:<input type="text" name="rg">
			<form:errors path="motorista.rg"></form:errors>
		</p>
		<p>
			Telefone:<input type="text" name="telefone">
			<form:errors path="motorista.telefone"></form:errors>
		</p>
		<p>
			E-mail:<input type="email" name="email">
			<form:errors path="motorista.email"></form:errors>
		</p>
		<p>
			Status: <select name="status">
				<option value="Ativo">Ativo</option>
				<option value="Afastado">Afastado</option>
			</select>
			<form:errors path="motorista.status"></form:errors>
		</p>
		<p>
			Numero CNH:<input type="text" name="nunCnh">
			<form:errors path="motorista.nunCnh"></form:errors>
		</p>
		<p>
			Categoria CNH: <select name="categoriaCnh">
				<option>A</option>
				<option>B</option>
				<option>C</option>
				<option>D</option>
				<option>E</option>
			</select>
			<form:errors path="motorista.categoriaCnh"></form:errors>
		</p>


		<p>
			Data 1º CNH:<input type="date" name="dataCnh">
			<form:errors path="motorista.dataCnh"></form:errors>
		</p>
		<p>Vencimento CNH:<input type="date" name="venCnh">
			<form:errors path="motorista.venCnh"></form:errors>
		</p>
		<button type="submit">teste</button>
	</form>

</body>
</html>