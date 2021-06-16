<%-- 
    Document   : ltrans
    Created on : Mar 9, 2021, 12:37:58 AM
    Author     : workspace
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="cp" value="${pageContext.request.servletContext.contextPath}/resources" scope="request" />
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title></title>
  
    <link rel="icon" type="image/png" sizes="16x16" href="${cp}/home/img/ro.jpg">
    <link rel="stylesheet" type="text/css" href="${cp}/home/css/css2.css">

  </head>
  <body>
<div class="login-box">
  <h1>Login</h1>
  <div class="textbox">
    <i class="fas fa-user"></i>
    <input type="text" color="#e2d322" placeholder="Username" >
  </div>

  <div class="textbox">
    <i class="fas fa-lock"></i>
    <input type="password" placeholder="Password" color="#e2d322">
  </div>

  <input type="button" class="btn" value="Sign in">
</div>
  </body>
</html>

