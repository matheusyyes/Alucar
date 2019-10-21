<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form:form method="post" action="gravarCar" modelAttribute="carro">
	Placa:<form:input path="placa" />
	Fabricante:
	<form:select path="fabricante">
		<form:options action="/peugeot" value="peugeot" label="peugeot" />
	</form:select>
	Modelo:
	<form:select path="fabricante">
		<form:options  value="peugeot" label="peugeot" />
	</form:select>
	Cor:<form:input path="placa" />
	Ano Modelo:
	Ano de Fabricação:
	Chassi:
	Renavam:
	Tipo de Combustível:
	Quilometragem Inicial:
	Motorista:
	Situação do Veículo:
	</form:form>
</body>
</html>