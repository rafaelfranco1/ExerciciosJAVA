<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<ul>
	<li>
	<s:url value="minhaurl" value="http://localhost:8080/Projeto01/link1" />
	<s:a href="%{minhaurl}">Este é o link  1</s:a>
	</li>
	
	<li>
	<s:url value="minhaurl" value="http://localhost:8080/Projeto01/link2" />
	<s:a href="%{minhaurl}">Este é o link  2</s:a>
	</li>
	
	<li>
	<s:url value="minhaurl" value="http://localhost:8080/Projeto01/link3"/>
	<s:a href="%{minhaurl}">Este é o link  3</s:a>
	</li>
</ul>
</body>
</html>