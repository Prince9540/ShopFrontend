
<%@taglib uri="http://www.springframework.org/security/tags" prefix="security" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>PhoneBazar</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</head>
<body>

<nav class="navbar navbar-expand-md bg-dark navbar-dark">
  <a class="navbar-brand" href="#">PhoneBazar</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="collapsibleNavbar">
    <ul class="navbar-nav">
      <li class="nav-item">
        <a class="nav-link" href="home">Home</a>
      </li>
      
      <security:authorize access="hasRole('ROLE_ADMIN')" >
      <li class="nav-item">
        <a class="nav-link" href="adminHome">Admin</a>
      </li>
      </security:authorize>
      
       <li class="nav-item">
        <a class="nav-link" href="aboutUs">AboutUs</a>
      </li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
      
      
      <security:authorize access="isAnonymous()">
      <li class="nav-item">
        <a class="nav-link" href="signIn"><span class="glyphicon glyphicon-log-in"></span> SignIn</a>
      </li>
      </security:authorize>
      
      
      <security:authorize access="isAnonymous()">
       <li class="nav-item">
        <a class="nav-link" href="signUp"><span class="glyphicon glyphicon-user"></span> SignUp</a>
      </li>
      </security:authorize>
      
      
       <security:authorize access="isAuthenticated()">
       <li class="nav-item">
        <a class="nav-link" href="logOut"><span class="glyphicon glyphicon-user"></span> LogOut</a>
      </li>
      </security:authorize>
     
      </ul>
      
   
  </div>  
</nav>


</body>
</html>
