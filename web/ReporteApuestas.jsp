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

      
        <title>Reporte</title>
    </head>
    <body>
        <h1>Reporte Apuestas</h1>
        <p>
            <a href="usuario.jsp" class="btn btn-success">Agregar</a>
        </p>
        <table class="table table-bordered">
            <thead>
                <th>ID</th>
                 <th>Usuario</th>
                 <th>Macador partido admin</th>
                  <th>Macador partido admin2</th>
                  <th>Marcador Propuesto1</th>
                   <th>Marcador Propuesto2</th>
                   <th>Precio Boleta</th>
                   <th>Resultado</th>
            </thead>
           
                <tbody>
                    <c:forEach items="${apuestas}" var="dato">
                        <tr>
                         
                            <td><c:out value="${dato.idApuesta}" /> </td>
                            <td><c:out value="${dato.idUsuarios.nombUsu}" /> </td>      
                            <td><c:out value="${dato.idPartido.marcadorEquip1}" /> </td>
                            <td><c:out value="${dato.idPartido.marcadorEquip2}" /> </td>
                            <td><c:out value="${dato.marcador1}" /> </td>
                            <td><c:out value="${dato.marcador2}" /> </td>
                            <td><c:out value="${dato.idBoleteria.precio}" /> </td>
                            
                            
                            
                            <c:set var="marcadorequipo" value="${dato.idPartido.marcadorEquip1}"/>
                             <c:set var="marcadorequipo2" value="${dato.marcador1}"/>
                             <c:set var="marcadorequipo3" value="${dato.idPartido.marcadorEquip2}"/>
                             <c:set var="marcadorequipo4" value="${dato.marcador2}"/>
                             
                             
                         <c:if test="${marcadorequipo == marcadorequipo2 && marcadorequipo3 == marcadorequipo4}">
                            <td> <c:out value="Ganador"/>   </td>
                        </c:if>
                            
                           <c:if test="${marcadorequipo !=  marcadorequipo2 || marcadorequipo3 != marcadorequipo4}">
                            <td> <c:out value="Perdedor"/>   </td>
                        </c:if>
              
               
                    </c:forEach>
                </tbody>
          
        </table>
    </body>
</html>