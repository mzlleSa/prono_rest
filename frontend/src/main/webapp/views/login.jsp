<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Page de login</title>
</head>
<body>
	<c:if test="${empty sessionScope.utilisateur}">

		<div align="center">
			<h1>Login</h1>

			<div style="color: red;">
				<c:if test="${not empty errorMessage}">
					<c:out value="${errorMessage}" />
				</c:if>
			</div>
			<form:form method="post" action="loginProcess" modelAttribute="utilisateur">
				<table>
					<tr>
						<td><label for="identifiant">Identifiant</label></td>
						<td><form:input path="identifiant" id="identifiant" /></td>
					</tr>
					<tr>
						<td><label for="mdp">Mot de passe</label></td>
						<td><form:input path="motDePasse" id="mdp" /></td>

					</tr>
					<br />
					<tr>
						<td colspan="2" align="center"><input type="submit"
							value="se connecter" /></td>
					</tr>
				</table>
			</form:form>
		</div>
	</c:if>

	<c:if test="${!empty sessionScope.utilisateur}">
		<c:redirect url="competitions" />
	</c:if>

</body>
</html>
