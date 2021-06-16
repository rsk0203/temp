    <%-- 
    Document   : Login
    Created on : Feb 19, 2021, 4:55:16 PM
    Author     : workspace
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       
    <title>Login Form</title>       
<body>   
    <h2>Login Page</h2><br>    
    <div class="login">    
    <form id="login-ajax">    
    <label for="Uname">username:</label><br>
    <input type="text" id="Uname" name="Uname" placeholder="Enter Username" name="Uname" required><br>
  <label for="pass">Password:</label><br>
  <input type="password" id="pass" name="pass"placeholder="Enter Password" name="Uname" required ><br><br>
  <input type="submit" value="Submit" >
</form>
          
</div>    
    <script
  src="https://code.jquery.com/jquery-3.6.0.js"
  integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk="
  crossorigin="anonymous"></script>
              <script>
    $(document).ready(function(){
       $('#login-ajax').submit(function(event)
       {   
           event.preventDefault();
          var user=$('#Uname').val();
          var pwd=$('#pass').val(); 
          $.ajax({
               type: "POST",
               url:"/Template/ajaxSample",
               data:{"Uname":user,"pass":pwd}
             }).done(function(response){ 
                 if(response === "success"){
                    window.location.href = "/Template/success";
                }else{
                    alert(response);
                }
                 

                 console.log(response);
             });                                
           });
         });
   </script>    
</body>    
</html> 