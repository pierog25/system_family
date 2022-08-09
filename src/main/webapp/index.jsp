<%-- 
    Document   : index
    Created on : 6 ago. 2022, 01:38:56
    Author     : PIERO
--%>

<%@page import="models.User"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.UserDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    </head>
    <body>
        <div class="card">
            <div class="card-header">
                <h3>Formulario de Usuario</h3>
            </div>
            <div class="card-body" style="width: 50%">
                <form action="EditUser" method="POST">
                    <div class="form-group">
                        <input type="text" class="form-control" name="user_username" id="user_username" placeholder="Ingrese su usuario">
                    </div>
                    <div class="form-group">
                        <input type="password" class="form-control" name="user_password" id="user_password" placeholder="Ingrese su contraseña">
                    </div>
                    <div class="form-group">
                        <select name="user_role_id" class="form-control">
                            <option value="1">ADMINISTRADOR</option>
                            <option value="2">ASISTENTE</option>
                        </select>
                    </div>
                    <div class="form-group">
                        <button class="btn btn-primary form-control btn-block" type="submit">Registrar</button>
                    </div>
                </form>
            </div>
        </div>
        
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    </body>
</html>
