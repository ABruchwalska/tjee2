<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="pl">
<head>
    	<jsp:include page="elementy/head.jsp" />
	<jsp:include page="elementy/skrypty.jsp" />
</head>

<body>
	<jsp:include page="elementy/menu.jsp" />
	<div class="container">
		<div class="jumbotron">
			<i><h1 class="text-center"><small>Ksiegarnia</small></h1></i>
			<i><u><h2 class="text-center">Olka Bruchwalska</h2></u></i>
			<i><h3 class="text-center"><small><a href="mailto:abruchwalska@inf.ug.edu.pl">abruchwalska@inf.ug.edu.pl</a></small></h3></i>
			<p class="text-center">W księgarni można sprawdzić:
			    </br>autora
			    </br>książki
			</p>
		</div>
	</div>
	<jsp:include page="elementy/stopka.jsp" />
</body>
</html>
