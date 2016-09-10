<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Nuevo Gasto</title>
</head>
<body>
	<table>
		<form:form action="guardarGasto">
			<form:label path="grupo">Grupo:</form:label>
			<form:textarea path="grupo"/>
			<form:label path="concepto">Concepto:</form:label>
			<form:textarea path="concepto"/>
			<form:label path="importe">Importe:</form:label>
			<form:textarea path="importe"/>
			<form:label path="descripcion">Descripcion:</form:label>
			<form:textarea path="descripcion"/>
			<form:button value="Aceptar" ></form:button>
		</form:form>
	</table>
	
</body>
</html>