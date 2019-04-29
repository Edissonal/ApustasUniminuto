<%-- 
    Document   : index
    Created on : 26/02/2019, 01:26:44 PM
    Author     : EAlonso
--%>
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
        <title>Editar Partido</title>
        
        
    </head>
    <body class="cover-container d-flex h-100 p-3 mx-auto flex-column">
        <a class="nav-link active" href="<%= request.getContextPath()%>/">Volver al Home</a>

        <div class="row">
            <div class="col col-md"></div>
            <div class="col-10 col-md-3">
                  
                  <form action="<%= request.getContextPath()%>/InsertPartido" method="post">
                     <input type="hidden" name="id" value="${partido.idPartido}"/>


                    
                    
                    <div class="form-group">
                     
                    <div class="form-group"><label>Editar Equipo1</label></div>
     
                    <div class="form-group">
                    <select name="equipo1"  class="form-group">
                    <c:forEach items="${equipo1}" var="dato">    
                    <option  class="form-group" value="${dato.idEquipo}">${dato.nombEquipo}</option>
                    </c:forEach> 
                    </select>
                    </div>                  
                        
                    </div>
                     
                    
                    <div class="form-group">
                     
                    <div class="form-group"><label>Editar Equipo2</label></div>
     
                    <div class="form-group">
                    <select name="equipo2"  class="form-group">
                    <c:forEach items="${equipo2}" var="dato">    
                    <option  class="form-group" value="${dato.idEquipo2}">${dato.nombEquipo2}</option>
                    </c:forEach> 
                    </select>
                    </div>                        
                        
                    </div> 
                     
                    <div class="form-group"><label>Marcador Equipo1</label></div>
                    <div class="form-group">
                        <input type="text" class="form-control" name="marcequipo1" value="${partido.marcadorEquip1}">
                   
                    </div>
                    
                    <div class="form-group"><label>Marcador Equipo2</label></div>
                    <div class="form-group">
                        <input type="text" class="form-control" name="marcequipo2" value="${partido.marcadorEquip2}">
                   
                    </div>    

                    
                    <input type="submit" class="btn btn-success" value="Enviar">
                </form>
                
              
            </div>
            <div class="col col-md"></div>
        </div>
        
        
</html>
         