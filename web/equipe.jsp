<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>

<head>

    <jsp:include page="header.jsp"></jsp:include>
    <!-- /#sidebar-wrapper -->

    <!-- Page Content -->
    <div id="page-content-wrapper">
        <div class="container-fluid">
            <div class="row">
                <div class="col-lg-12">
                    <h1>Equipes</h1>
                    <table class="table table-striped">
                        <tr>
                            <th>Nome Equipe</th>
                            <th>Abreviação</th>
                            <th>Posição</th>
                        </tr>
                        
                        <c:forEach var="equipe" items="${equipeList}">
                            <tr>
                            <td>
                                <c:out value="${equipe.nome}"></c:out>
                            </td>
                            <td>
                                <c:out value="${equipe.abreviacao}"></c:out>
                            </td>
                            <td>
                                <c:out value="${equipe.posicao}"></c:out>
                            </td>
                            </tr>
                        </c:forEach>
                    </table>
                </div>
            </div>
        </div>
    </div>
    <!-- /#page-content-wrapper -->
</body>
<jsp:include page="footer.jsp"></jsp:include>
</html>