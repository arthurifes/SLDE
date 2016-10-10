<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, shrink-to-fit=no, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Dados Esportivos</title>

    <!-- Bootstrap Core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="css/simple-sidebar.css" rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

    <form action="Login" method=post> 
     
        <div id="loginbox" style="margin-top:50px; color: #000033"  class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">                    
            <div class="panel panel-default"  >
                    <div class="panel-heading">
                        <div class="panel-title" >Login</div>
                        
                    </div>     
 
                    <div style="padding-top:30px" class="panel-body" >
 
                        <input name="mensagem"  style="display:none" id="login-alert" class="alert alert-danger col-sm-12"></input>
                            
                        <form id="loginform" class="form-horizontal" role="form">
                                    
                            <div style="margin-bottom: 25px" class="input-group">
                                        <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                        <input id="login-username" type="text" class="form-control" name="username" value="" placeholder="Usuário">                                        
                                    </div>
                                
                            <div style="margin-bottom: 25px" class="input-group">
                                        <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                                        <input id="login-password" type="password" class="form-control" name="password" placeholder="Senha">
                                    </div>
                                    
 
                                
                            <div class="input-group">
                                      <div class="checkbox">
                                        <label>
                                          <input id="login-remember" type="checkbox" name="remember" value="1"> Lembrar
                                        </label>
                                      </div>
                                    </div>
 
 
                                <div style="margin-top:10px" class="form-group">
                                    <!-- Button -->
 
                                    <div class="col-sm-12 controls">
                                        <input  name="login" type="submit" value="Login" id="btn-login" href="inicio.jsp" class="btn btn-success" onclick="document.getElementById("login-alert").style.display = "null"; </input>
                                      <!--<a id="btn-fblogin" href="#" class="btn btn-primary">Login com Facebook</a>-->
 
                                    </div>
                                </div>
 
 
                                <div class="form-group">
                                    <div class="col-md-12 control">
                                        <div style="border-top: 1px solid#888; padding-top:15px; font-size:85%" >
                                            Não tem uma conta! 
                                            <a href="cadastro.jsp">
                                            Crie uma agora.
                                        </a>
                                        </div>
                                    </div>
                                </div>    
                            </form>     
                        </div>                     
                    </div>  
        </div>
    </form>
</body>

</html>