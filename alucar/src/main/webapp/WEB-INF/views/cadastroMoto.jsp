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
		</p>
		<p>
			Sexo: <input type="radio" value="homem" name="sexo">Masculino
			<input type="radio" value="mulher" name="sexo">Feminino
		</p>
		<p>
			CPF:<input type="text" name="cpf">
		</p>
		<p>
			RG:<input type="text" name="rg">
		</p>
		<p>
			Telefone:<input type="text" name="telefone">
		</p>
		<p>
			E-mail:<input type="email" name="email">
		</p>
		<p>
			Status: <select name="status">
				<option value="Ativo">Ativo</option>
				<option value="Afastado">Afastado</option>
			</select>
		</p>
		<p>
			Numero CNH:<input type="text" name="nunCnh">
		</p>
		<p>
			Categoria CNH: <select name="categoriaCnh">
				<option>A</option>
				<option>B</option>
				<option>C</option>
				<option>D</option>
				<option>E</option>
			</select>
		</p>


		<p>
			Data 1º CNH:<input type="date" name="dataCnh">
		</p>
		<p>Vencimento CNH:<input type="date" name="venCnh"></p>
		<button type="submit">teste</button>
	</form>

</body>
</html>