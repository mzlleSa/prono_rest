<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Page d'acceuil</title>
</head>
<body>

	<c:if test="${!empty sessionScope.utilisateur}">

		<p>
			Hello
			<c:out value="${sessionScope.utilisateur.nom}" />
			<c:out value="${sessionScope.utilisateur.prenom}" />
			, <a href="profile">mon compte</a> <a href="logout">Déconnexion</a>
		</p>
		<hr />
	</c:if>

	<center>
		<h1>Bienvenue Sur Pronostic Foot</h1>
		<hr />
		<div style="height: 200px; text-align: center; padding-top: 150px;">

			<a href="competitions">Gestion Competitions</a> 
			<br /> 
			<a href="equipes">Gestion Equipes</a>
				<br /> <a href="Matchs">Gestion Matchs</a>
				<br /> <a href="resultats">Gestion Resultats</a>
				<br /> <a href="utilisateurs">Gestion Utilisateurs</a>
		</div>

		<hr />
		<h5>Copyright SEZ_GROUP Technomaker 2018</h5>
	</center>
</body>
</html>
