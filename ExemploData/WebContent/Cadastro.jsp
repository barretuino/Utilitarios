<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta name="generator" content="HTML Tidy, see www.w3.org">
<meta http-equiv="Content-Type" content=
"text/html; charset=Cp1252">
<title>Cadastro de Datas</title>
</head>
<body>
<form method="POST" action="svlData">
<table>
<tr><td align="center" width="122"><b>Data de Hoje:</b></td>
<td align="left"><input type="date" name="dataAtual" value=<%= (new Date().getYear() + 1900) + "-" + (new Date().getMonth() + 1) + "-" + new Date().getDate() %>><font color="red">*</font></td></tr>
<tr><td align="center" width="122"><b>Data de Nascimento:</b></td>
<td align="left"><input type="date" name="dataNascimento"><font color="red">*</font></td></tr>
<td align="left"><p align="center"><input type="submit" value="Enviar"> 
</tr>
</table>
</form>
</body>
</html>

