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
				$( "#datawyd" ).datepicker
				(
					{
						changeMonth: true,
						changeYear: true,
						dateFormat: "yy-mm-dd",
					},
					$.datepicker.regional[ "pl" ]
				);
			}
		);
	</script>
	<script>
		$(document).ready(function()
			{
				$( "#dodaj" ).on('click', function(e)
					{	
						e.preventDefault();
						$.ajax
						(
						{
						    url: '${pageContext.request.contextPath}/rest/ksiazka/dodaj',
						    type: 'POST',
						    data:
							{
								datawyd: document.getElementById('datawyd').value,
								autor: document.getElementById('autor').value,
								cena: document.getElementById('cena').value,
								opis: document.getElementById('opis').value
								
							},
						    success: function() { document.location.replace("${pageContext.request.contextPath}/Ksiazki"); },
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
        <h1 class="text-center">Dodaj ksiazke</h1>
            	<form data-toggle="validator" method="post" class="form-horizontal">

		        <div class="form-group">
		            <label for="data" class="col-sm-2 control-label">Data wydania:</label>

		            <div class="col-sm-10">
		                <input type="date" name="datawyd" id="datawyd" class="form-control" placeholder="rrrr-mm-dd" required/>
		            </div>
		        </div>

		        <div class="form-group">
		         	<label for="autor" class="col-sm-2 control-label">Autor:</label>
				<div class="col-sm-10">
				         <select type="text" name="autor" id="autor" class="form-control" required>
				     		<c:forEach var="autorFK" items="${autorzyDostepni}" varStatus="loopCounter">
						    	<option value="${autorFK.id}">${autorFK.getImie()}</option>
					    	</c:forEach>
					</select>
				</div>
		        </div>

		        <div class="form-group">
		            	<label for="cena" class="col-sm-2 control-label" >Cena:</label>

		            	<div class="col-sm-10">
		                	<input type="text" pattern="^[0-9]+$|^[0-9]+[.][0-9]+$" name="cena" id="cena" class="form-control" placeholder="0.0" required>
		            	</div>
		        </div>

		        <div class="form-group">
		           	<label for="opis" class="col-sm-2 control-label">Opis:</label>

		            	<div class="col-sm-10">
		                	<input type="text" name="opis" min="2" id="opis" class="form-control"/>
		            	</div>
		        </div>
		        <div class="form-group text-center">
		                <button id="dodaj" type="submit" class="btn btn-success">Dodaj</button>
				<a href="${pageContext.request.contextPath}/Ksiazki" class="btn btn-default" role="button">Wróć</a>
		        </div>

            	</form>

    <jsp:include page="../elementy/stopka.jsp" />
</div>
</body>
</html>
