<%
	//scriptlet
	String nomeEmpresa = (String)request.getAttribute("empresa");
	System.out.println(nomeEmpresa);
%>

<html>
	<body>
		Empresa <% out.println(nomeEmpresa); %> cadastrada com sucesso!
<!-- 		OR --> <br />

<!-- 		Empresa <%= (nomeEmpresa) %> cadastrada com sucesso! 	-->
		
	</body>
</html>