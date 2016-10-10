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

        <div id="signupbox"  style="margin-top:50px;" class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    <div class="panel-title">Criar Login</div>
                                </div>  
                                <div class="panel-body" >
                                    <form  id="signupform" class="form-horizontal" role="form" action="cadastro" method="POST">

                                        <div id="signupalert" style="display:none" class="alert alert-danger">
                                            <p>Erro:</p>
                                            <span></span>
                                        </div>
                                        <div id="sucess" style="display:none" class="success">
                                            <p>${message}</p>
                                            <span></span>
                                        </div>  
                                        
                                        <div class="form-group">
                                            <label for="firstname" class="col-md-3 control-label">Nome Completo</label>
                                            <div class="col-md-9">
                                                <input type="text" class="form-control" name="nome" placeholder="Nome completo">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="email" class="col-md-3 control-label">E-mail</label>
                                            <div class="col-md-9">
                                                <input type="text" class="form-control" name="email" placeholder="exemplo@gmail.com">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="password" class="col-md-3 control-label">Senha</label>
                                            <div class="col-md-9">
                                                <input type="password" class="form-control" name="senha" placeholder="">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="password" class="col-md-3 control-label">Repita a Senha</label>
                                            <div class="col-md-9">
                                                <input type="password" class="form-control" name="senha2" placeholder="">
                                            </div>
                                        </div>

                                        <div class="form-group">
                                            <!-- Button -->                                        
                                            <div class="col-md-offset-3 col-md-9">
                                                <input name="botao" value="Cadastrar" type="submit" class="btn btn-info"><i class="icon-hand-right"></i></input>
                                                <a id="voltar" href="index.jsp" class="btn btn-info">Voltar  </a>
                                            </div>
                                           
                                        </div>

                                           
                                    </form>
                                 </div>
                            </div>
                 </div> 
</body>
</html>