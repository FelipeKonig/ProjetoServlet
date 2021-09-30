<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/nova-empresa" var="LinkServletNovaEmpresa"/>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Cadastro de nova empresa</title>
	</head>
	<body>
		
		<form action="${LinkServletNovaEmpresa}" method="post">
			
			Nome: <input type="text" name="nome" />
			Data de abertura: <input type="text" name="data" />
			<input type="submit" />
			
		</form>
	</body>
</html>