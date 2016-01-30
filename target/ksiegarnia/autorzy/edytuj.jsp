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
				$( "#edytuj" ).on('click', function(e)
					{	
						e.preventDefault();
						$.ajax
						(
						{
						    url: '${pageContext.request.contextPath}/rest/autor/edytuj/${autorEdytowany.getId()}',
						    type: 'PUT',
						    data:
							{
						    	imie: document.getElementById('imie').value,
								wzrost: document.getElementById('wzrost').value,
								ilosck: document.getElementById('ilosck').value
								
							},
						    success: function() { document.location.replace("${pageContext.request.contextPath}/Autorzy"); },
 						    error: function() { alert("Nieprawidłowo wprowadzono dane!"); }
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
        <h1 class="text-center">Edytuj autora</h1>

        	<form action="${pageContext.request.contextPath}/rest/autor/edytuj/${autorEdytowany.getId()}" data-toggle="validator" method="post" class="form-horizontal">
		        <div class="form-group">
		            <label for="imie" class="col-sm-2 control-label">Imie:</label>

		            <div class="col-sm-10">
		                <input type="text" name="imie" id="imie" class="form-control" value="${autorEdytowany.getImie()}" data-minlength="2" required>
		            </div>
		        </div>

		        <div class="form-group">
		            <label for="wzrost" class="col-sm-2 control-label">Wzrost:</label>

		            <div class="col-sm-10">
		                <input type="text" name="wzrost" id="wzrost" pattern="^[0-9][0-9]$" class="form-control"  placeholder="0.0" value="${autorEdytowany.getWzrost()}" required>
		            </div>
		        </div>

		        <div class="form-group">
		            <label for="ilosck" class="col-sm-2 control-label">Ilość książek:</label>

		            <div class="col-sm-10">
		                <input type="text" name="ilosck" id="ilosck" pattern="^[0-9]+$" class="form-control" placeholder="0" value="${autorEdytowany.getIlosck()}" required>
		            </div>
		        </div>
		        <div class="form-group text-center">
		                <button id="edytuj" type="submit" class="btn btn-primary">Edytuj</button>
				<a href="${pageContext.request.contextPath}/Autorzy" class="btn btn-default" role="button">Wróć</a>
		 	    </div>
		        </div>
            	</form>

    <jsp:include page="../elementy/stopka.jsp" />
</div>
</body>
</html>
