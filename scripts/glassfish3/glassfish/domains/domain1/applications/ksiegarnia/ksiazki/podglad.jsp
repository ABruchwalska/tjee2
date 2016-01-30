<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="pl">
<head>
    	<jsp:include page="../elementy/head.jsp" />
	<jsp:include page="../elementy/skrypty.jsp" />
	<script>
		$(document).ready(function()
			{	
			$.ajax
				(
					{
						url: '${pageContext.request.contextPath}/rest/ksiazka/podglad/${ksiazkaId}',
						type: 'GET',
						success: function(w) { 
										document.getElementById('pole1').innerHTML = w.datawyd;
										document.getElementById('pole2').innerHTML = w.autor.imie;
										document.getElementById('pole3').innerHTML = w.cena;
										document.getElementById('pole4').innerHTML = w.opis;
									}
					}	
				);
			}
		);
	</script>
	<script>
		$(document).ready(function()
			{
				$( "#usun" ).on('click', function(e)
					{	
						e.preventDefault();
						$.ajax
						(
						{
						    url: '${pageContext.request.contextPath}/rest/autor/usun/${ksiazkaId}',
						    type: 'DELETE',
						    success: function() { document.location.replace("${pageContext.request.contextPath}/Ksiazki"); }
						}	
						);
					}
				);
			}
		);
	</script>
</head>

<body>
<jsp:include page="../elementy/menu.jsp" />

<div class="container">
    <div class="row">
        <h1 class="text-center">Ksiazka</h1>
        <br/>

        <label>Data wydania:</label>
        <div id = "pole1" class="well well-sm"></div>

        <label>Autor:</label>
        <div id = "pole2" class="well well-sm"></div>

        <label>Cena:</label>
        <div id = "pole3" class="well well-sm"></div>

        <label>Opis:</label>
        <div id = "pole4" class="well well-lg"></div>
	<div class="form-group text-center">
		                <a href="${pageContext.request.contextPath}/EdytujKsiazke/${ksiazkaId}" class="btn btn-primary" role="button">Edytuj</a>
		                <button id="usun" type="submit" class="btn btn-danger">Usuń</button>
				<a href="${pageContext.request.contextPath}/Ksiazka" class="btn btn-default" role="button">Wróć</a>
    	</div>
    </div>

    <jsp:include page="../elementy/stopka.jsp" />
</div>
</body>
</html>
