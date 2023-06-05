<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Gestion Livres</title>
</head>
<body>

<h1>Gestion Des Livres</h1>
<p><a href="PreAdd">Ajouter un livre</a></p>
<table border="1">
<c:forEach items="${liste}" var="lv">
<tr>
<td>${lv.id}</td>
<td>${lv.titre}</td>
<td>${lv.prix}</td>
<td><a href="Delete?id=${lv.id}">delete</a></td>
</tr>
</c:forEach>
</table>

</body>
</html>