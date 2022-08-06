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
    </head>
    <body>
        <%
            UserDao usdao = new UserDao();
            ArrayList<User> listUser = usdao.list();
            String nombre = "";
            for(User us:listUser){
                nombre = us.getUser_username();
            }
        %>
        <h1><%=nombre%></h1>
    </body>
</html>
