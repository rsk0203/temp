<%-- 
    Document   : profile
    Created on : Mar 10, 2021, 12:47:12 AM
    Author     : workspace
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="cp" value="${pageContext.request.servletContext.contextPath}/resources" scope="request" />
<!DOCTYPE html>
<html>
   <head>
      <title>Profile Card</title>
          <link rel="stylesheet" type="text/css" href="${cp}/home/css/css.css">
   </head>
   <body>
      <div class="card-container">
         <div class="upper-container">
            <div class="image-container">
              <img src="/Template/resources/home/img/ro.jpg" />
            </div>
         </div>
         <div class="lower-container">
            <div>
               <h3>Rsk</h3>
               <h4>Front-end Developer</h4>
            </div>
            <div>
               <p>sodales accumsan ligula. Aenean sed diam tristique,
                  fermentum mi nec, ornare arch.
               </p>
            </div>
            <div>
               <a href="#" class="btn">View profile</a>
            </div>
         </div>
      </div>
   </body>
</html>


