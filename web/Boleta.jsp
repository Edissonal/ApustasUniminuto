<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
 
  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
 <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <div class="row">
            <div class="col col-md"></div>
            <div class="col-10 col-md-3">
                  <form action="<%= request.getContextPath()%>/EditRifa" method="post">
                     <input type="hidden" name="id" value="${rifa.idRifa}"/>
                    <div class="form-group"><label>Premio</label></div>
                    <div class="form-group">
                        <input type="text" class="form-control" name="premio" value="${rifa.premio}">
                    </div>
                    <br>
                    <br>
                    <div class="form-group"><label>Precio boletas</label></div>
                    <select name="idBoleteria">
                        <c:forEach items="${boleteria}" var="dato">
                            <option name="idBoleteria" value="${dato.idBoleteria}"/>
                                $ ${dato.precio}
                            </option>
                        </c:forEach>
                    </select>
                    <br>
                    <br>
                    <div class="form-group"><label>Escoger usuario</label></div>
                    <select name="idUsuarios">
                        <c:forEach items="${usuarios}" var="dato">
                            <option value="${dato.idUsuarios}"/>
                                ${dato.nombUsu}
                            </option>
                        </c:forEach>
                    </select>
                    <br>
                    <br>
                    <input type="submit" class="btn btn-success" value="Enviar">
                </form>    
            </div>
            <div class="col col-md"></div>
        </div>
</html>
         