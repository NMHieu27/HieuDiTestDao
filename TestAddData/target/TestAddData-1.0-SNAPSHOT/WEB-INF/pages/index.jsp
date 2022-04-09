<%-- 
    Document   : index
    Created on : Apr 9, 2022, 5:50:20 PM
    Author     : Asus
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>
            Thêm user
        </title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css" integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p" crossorigin="anonymous"/>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.29.1/moment.min.js"></script>
    </head>
    <body>
        <!-- HEADER -->
        <nav class="navbar navbar-expand-md bg-dark navbar-dark">
            <!-- Brand -->
            <a class="navbar-brand" href="#">Hieu Testing</a>

            <!-- Toggler/collapsibe Button -->
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
                <span class="navbar-toggler-icon"></span>
            </button>

            <!-- Navbar links -->
            <div class="collapse navbar-collapse" id="collapsibleNavbar">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link" href="<c:url value="/" />">Trang chủ</a>
                    </li>
                </ul>
                <form class="form-inline" action="<c:url value="/" />">
                    <input class="form-control mr-sm-2" name="kw" type="text" placeholder="Nhap tu khoa...">
                    <button class="btn btn-success" type="submit">Tim</button>
                </form>
            </div>
        </nav>
        <div class="container">


            <!-- CONTENT -->
            <h1 class="text-center text-danger">THÊM USER</h1>

            <c:url value="/" var="action" />

            <form:form method="post" action="${action}" 
                       enctype="multipart/form-data" modelAttribute="user">
                <div class="form-group">
                    <label for="fullname">Full Name</label>
                    <form:input type="text" id="fullname" path="fullname" class="form-control" />
                </div>
                <div class="form-group">
                    <label for="phone">Phone</label>
                    <form:input type="text" id="phone" path="phone" class="form-control" />
                </div>
                <div class="form-group">
                    <label for="username">Username</label>
                    <form:input type="text" id="username" path="username" class="form-control" />
                </div>
                <div class="form-group">
                    <label for="pass">Password</label>
                    <form:input type="password" id="pass" path="pass" class="form-control" />
                </div>
                <div class="form-group">
                    <label for="avatar">Avatar</label>
                    <form:input type="file" id="avatar" path="file" class="form-control" />
                </div>
                <div class="form-group">
                    <input type="submit" value="DANG KY" class="btn btn-danger" />
                </div>
            </form:form>

        </div>
        <!-- FOOTER -->
        <div class="jumbotron bg-info">
            <h1>Híu đang test</h1>
            <p>Nguyễn Minh Hiếu &copy; 2022</p>
        </div>
    </body>
</html>
