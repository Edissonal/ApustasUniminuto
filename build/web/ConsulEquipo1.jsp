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

      
        <title>Consulta Equipo</title>
    </head>
    <body class="cover-container d-flex h-100 p-3 mx-auto flex-column">
        <a class="nav-link active" href="<%= request.getContextPath()%>/">Volver al Home</a>
        <h1>Consulta Deporte</h1>
        <p>
            <a href="inserEquipo1" class="btn btn-success">Agregar</a>
        </p>
        <table class="table table-bordered">
            <thead>
                <th>ID Equipo</th>
                <th>Nombre Equipo</th>
                <th>Nombre Deporte</th>
                <th>Editar Equipo</th>
                <th>Eliminar Equipo</th>

            </thead>
           
                <tbody>
                    <c:forEach items="${equipo1}" var="dato">
                        <tr>
                            <td><c:out value="${dato.idEquipo}" /> </td>
                            <td><c:out value="${dato.nombEquipo}" /> </td>
                            <td><c:out value="${dato.idTipoDeporte.nombDepor}" /> </td>

                  <td><a href='<%= request.getContextPath()+"/EditEquipo1?id="%>${dato.idEquipo}'>Editar</a></td>
                  <td><a href='<%= request.getContextPath()+"/DeletEquipo1?id="%>${dato.idEquipo}'>Eliminar</a></td>
             
                    </c:forEach>
                </tbody>
          
        </table>
    </body>
</html>