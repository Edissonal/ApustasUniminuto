<%-- 
    Document   : Home
    Created on : 28/04/2019, 10:47:58 PM
    Author     : ivan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" style="background-color: #333333"><head>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
 
  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
 <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <title>Apuestas Uniminuto</title>

    <link rel="canonical" href="https://getbootstrap.com/docs/4.0/examples/cover/">

    <!-- Bootstrap core CSS -->
    <link href="../../dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="cover.css" rel="stylesheet">
  </head>

  <body class="text-center" style="height: 500px;">

    <div class="cover-container d-flex h-100 p-3 mx-auto flex-column">
      <header class="masthead mb-auto">
        <div class="inner">
          <h3 class="masthead-brand">Apuestas</h3>
          <nav class="nav nav-masthead justify-content-center">
            <a class="nav-link active" href="<%= request.getContextPath()%>/">Home</a>
            <a class="nav-link" href="<%= request.getContextPath()%>/consulta">Usuarios</a>
            <a class="nav-link" href="<%= request.getContextPath()%>/rifa">Rifas</a>
            <a class="nav-link" href="<%= request.getContextPath()%>/ConsBoleteria">Boletería</a>
            <a class="nav-link" href="<%= request.getContextPath()%>/ConsulDeporte">Tipo de deporte</a>
            <a class="nav-link" href="<%= request.getContextPath()%>/ConsulEquipo1">Equipo Local</a>
            <a class="nav-link" href="<%= request.getContextPath()%>/ConsulEquipo2">Equipo visitante</a>
            <a class="nav-link" href="<%= request.getContextPath()%>/ConsulPartido">Consultar partido</a>
           
           
          </nav>
        </div>
      </header>

      <main role="main" class="inner cover">
        <h1 class="cover-heading">Apuestas Uniminuto</h1>
        <p class="lead">Encuentre las mejores apuestas deportivas.</p>
        <p class="lead">
          <a href="<%= request.getContextPath()%>/Constpartido" class="btn btn-lg btn-secondary">Apostar</a>
        </p>
        <a class="nav-link" href="<%= request.getContextPath()%>/ReporteApuestas">Ver ganadores</a>
           
      </main>

      <footer class="mastfoot mt-auto">
        <div class="inner">
          <p>Ver repo en <a href="https://github.com/Edissonal/ApustasUniminuto/">Github</a>, by Edisson Alonso, Yulian Imbachi, Ivan Ramirez.</p>
        </div>
      </footer>
    </div>
</body></html>
