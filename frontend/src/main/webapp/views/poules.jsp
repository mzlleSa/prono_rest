<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Page de poules</title>
</head>
<body>
	<jsp:include page="userData.jsp" />
	<c:if test="${!empty sessionScope.utilisateur}">
		<hr />
		<h1>Poules disponibles</h1>
		<hr />
		<div align="center">
			<c:forEach var="poule" items="${poules}">
				<div style="width: 20%; display: inline-block;">
					<table border="1" cellpadding="5">
						<caption>
							Poule
							<c:out value="${poule.key}" />
						</caption>
						<br />
						<tr>
							<th>ID</th>
							<th>Identifiant</th>
						</tr>
						<c:forEach var="equipe" items="${poule.value}">
							<tr>
								<td><c:out value="${equipe.id}" /></td>
								<td><c:out value="${equipe.identifiant}" /></td>
							</tr>
						</c:forEach>
						<tr>
							<a
								href="matchs?idCompetition=<c:out value="${idCompetition}" />&idPoule=<c:out value="${poule.key}" />">voir
								les matches</a>
						</tr>

					</table>

				</div>

			</c:forEach>
		</div>
		<hr />

		<h1>Huitième De Finale</h1>
		<em>En cours . . . </em>
		<hr />

		<h1>Quarts De Finale</h1>
		<em>En cours . . . </em>
		<hr />

		<h1>Demi De Finale</h1>
		<em>En cours . . . </em>
		<hr />

		<h1>Finale</h1>
		<em>En cours . . . </em>
		<hr />
	</c:if>

	<jsp:include page="loginRequired.jsp" />
</body>
</html>
