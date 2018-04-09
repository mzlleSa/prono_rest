<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Page d'inscription</title>
<style>
.error {
	color: red
}
</style>
</head>
<body>
	<div align="center">
		<h1>Inscirption</h1>
		<br />
		<form:form method="post" action="inscriptionProcess"
			modelAttribute="utilisateur">
			<table>
				<tr>
					<td><label for="nom">Nom (*)</label></td>
					<td><form:input path="nom" id="nom" /></td>
					<td><form:errors path="nom" cssClass="error" /></td>
				</tr>
				<tr>
					<td><label for="prenom">Prenom (*)</label></td>
					<td><form:input path="prenom" id="prenom" /></td>
					<td><form:errors path="prenom" cssClass="error" /></td>
				</tr>
				<tr>
					<td><label for="identifiant">Identifiant (*)</label></td>
					<td><form:input path="identifiant" id="identifiant" /></td>
					<td><form:errors path="identifiant" cssClass="error" /></td>

				</tr>
				<tr>
					<td><label for="email">Adresse email (*)</label></td>
					<td><form:input path="email" id="email" /></td>
					<td><form:errors path="email" cssClass="error" /></td>

				</tr>
				<tr>
					<td><label for="mdp">Mot de passe (*)</label></td>
					<td><form:input path="motDePasse" id="mdp" /></td>
					<td><form:errors path="motDePasse" cssClass="error" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="valider" /></td>

				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>
