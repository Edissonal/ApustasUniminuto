<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
 
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>

      
        <title>Rifas</title>
    </head>
    <body>
        <h1>Rifas</h1>
        
        <c:if test="${empty ganador}"> 
            <p>
                <a href="Boleta" class="btn btn-success">Crear una rifa</a>
            </p>
            <table class="table table-bordered">
                <thead>
                    <th>ID</th>
                    <th>Premio</th>
                    <th>Precio</th>
                    <th>Cantidad boletas</th>
                    <th>Acciones</th>
                </thead>
                <tbody>
                    <c:forEach items="${rifas}" var="dato">
                        <tr>
                            <td><c:out value="${dato.idRifa}" /> </td>
                            <td><c:out value="${dato.premio}" /> </td>
                            <td><c:out value="${dato.idBoleteria.precio}" /> </td>
                            <td><c:out value="${dato.idBoleteria.cantidad}" /> </td>
                            <td>
                                <a href='<%= request.getContextPath()+"/ConsultRifa?id="%>${dato.idRifa}'>Editar</a> - 
                                <a href='<%= request.getContextPath()+"/EjecutaRifa?id="%>${dato.idRifa}'>Rifar</a>
                            </td>
                    </c:forEach>
                </tbody>

            </table>
        </c:if>
        <c:if test="${not empty ganador}">
            <div class="col col-md">
                <p>
                    Parece que tenemos un ganador!!!!
                </p>
                <h2>El ganador es!!! <b>${ganador.idUsuarios.nombUsu}</b></h2>
                    <p>
                        <a href="https://www.efectyvirtual.com:20009/PortalEcommerce/Account/Login" class="btn btn-success">Cobrar premio</a>
                    </p>
            </div>
            </c:if>
        </body>
</html>