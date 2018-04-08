
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Page de competitions</title>
</head>
<body>
	<jsp:include page="userData.jsp" />
	<c:if test="${!empty sessionScope.utilisateur}">
		<div align="center">
			<h1>Les competitions disponibles</h1>
			<table border="1" cellpadding="5">
				<tr>
					<th>ID</th>
					<th>Identifiant</th>
					<th>Date de debut</th>
					<th>Action</th>
				</tr>
				<c:forEach var="competition" items="${listeCompetitions}">
					<tr>
						<td><c:out value="${competition.id}" /></td>
						<td><c:out value="${competition.identifiant}" /></td>
						<td><c:out value="${competition.dateCompetition}" /></td>
						<td><a
							href="competition?id=<c:out value="${competition.id}" />">voir
								les matches</a></td>
					</tr>
				</c:forEach>
			</table>

		</div>
	</c:if>
	<jsp:include page="loginRequired.jsp" />

</body>
</html>

