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

<h2>Ajouter Un Livre</h2>
<form method="GET" action="PostAdd">
<p>Titre <input type="text" name="titre"></p>
<p>Qte <input type="number" name="qte"></p>
<p>Prix <input type="number" name="prix"></p>
 <p><input type="submit" value="Submit"></p>

</form>
</body>
</html>