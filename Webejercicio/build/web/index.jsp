<%-- 
    Document   : index
    Created on : 30/08/2021, 18:55:50
    Author     : DiegoR
--%>
<html>
    <head>
        <title>pagina central</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.6.0.slim.js" integrity="sha256-HwWONEZrpuoh951cQD1ov2HUK5zA5DwJ1DNUXaM6FsY=" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js" integrity="sha384-eMNCOe7tC1doHpGoWe/6oMVemdAVTMs2xqW4mwXrXsW0L84Iytr2wi5v2QjrP/xp" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.min.js" integrity="sha384-cn7l7gDp0eyniUwwAZgrzD06kc/tftFf19TOAs2zVinnD/C7E91j9yyk5//jjpt/" crossorigin="anonymous"></script>
    </head>
    <body background="">
        <!--<div class="container">
            <h2>Listado de Links para ir al formulario que desee</h2>
            <div class="list-group">
                <a href="Cliente.jsp" class="list-group-item list-group-item-action">Clientes</a>
                <a href="Empleado.jsp" class="list-group-item list-group-item-action">Empleados</a>
              </div>
        </div> -->
        
        <div class="container">
        <h2>-------------------------------------------------------------------</h2>
        <h2>------------------Seleccione el formulario-------------------------</h2>
        <h2>-------------------------------------------------------------------</h2>
        <div class="row">
            <center>
            <div class="row g-3">
                
                <div class="card" style="width: 18rem;">
                    <img src="https://jhonnanoropeza.files.wordpress.com/2016/04/acuerdo-de-negocios-de-dibujos-animados_23-2147508090.jpg?w=626" class="card-img-top" alt="...">
                    <div class="card-body">
                      <h5 class="card-title">Formulario Clientes</h5>
                      <p class="card-text">Engresar al Formulario para agrear a un cliente</p>
                      <a href="Cliente.jsp" class="btn btn-primary">CLIENTES</a>
                    </div>
                </div>
                <div class="col-md-2"></div>
                <div class="card" style="width: 18rem;">
                    <img src="https://previews.123rf.com/images/yayasyaya/yayasyaya1604/yayasyaya160400006/56750263-equipo-de-negocios-de-los-empleados-y-de-la-ilustraci%C3%B3n-jefe.jpg" class="card-img-top" alt="...">
                    <div class="card-body">
                      <h5 class="card-title">Formulario Empleados</h5>
                      <p class="card-text">ingresar al formulario para agregar a un empleado</p>
                      <a href="Empleado.jsp" class="btn btn-primary">EMPLEADOS</a>
                    </div>
                </div>
            </div>
                </center>
        </div>
        </div>
    </body>
</html>