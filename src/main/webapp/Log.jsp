
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../../../favicon.ico">
	
    <title>Sign-In To Weboard</title>
    
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

	<!-- jQuery library -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

	<!-- Latest compiled JavaScript -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	
	<!-- Bootstrap core CSS -->
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

   
      <style>
      .logo{
            padding:0px;
            margin:0px;
            height: 65px;
            width: 120px;
          }
          .navbar{
             background-color: rgba(100,40,0,.6);
             color:white;
          }
       
      </style>
	
	<style>
    	
    	form{
    		margin:120px auto;
    		height:700px;
    		width:400px;
    	}
	    body {
	    font-family: "Helvetica Neue",Helvetica,Arial,sans-serif;
	    font-size: 14px;
	    line-height: 2;
	    color: #333;
	    background-color: white;
		}
	    .btn-lg{
	    	    margin: 10px 0px;
	    }
    </style>
  </head>

  <body>
	 <nav class="navbar navbar-expand-lg navbar-dark navbar-custom fixed-top">
      <div class="container">
        <img src="img/weblogo.png" class="logo">
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
          <ul class="navbar-nav ml-auto">
            <li class="nav-item">
              <a class="nav-link" href="index.jsp">HOME</a>
            </li>
            
          </ul>
        </div>
      </div>
    </nav>  
  
  
  
    <form class="form-signin" method="POST" action="/weboard/UserServlet">
      <div class="text-center mb-4">
        <img class="mb-4" src="https://getbootstrap.com/assets/brand/bootstrap-solid.svg" alt="" width="72" height="72">
        <h1 class="h3 mb-3 font-weight-normal">Log-In</h1>
        </div>

      <div class="form-label-group">
      <label for="inputEmail">Email address</label>
        <input type="email" id="inputEmail" class="form-control" name = "email" placeholder="Email address" required autofocus>
        
      </div>

      <div class="form-label-group">
      <label for="inputPassword">Password</label>
        <input type="password" id="inputPassword" class="form-control" name = "password" placeholder="Password" required>
      </div>

       
      
      <button class="btn btn-lg btn-primary btn-block" type="submit">Log in</button>
      <a href="#" class="mt-5 mb-3 text-muted text-center">If You Forget Your Password Click Here ....</a>
    </form>
  </body>
</html>
