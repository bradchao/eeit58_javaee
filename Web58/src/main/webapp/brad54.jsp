<%@ page language="java" contentType="text/html; charset=UTF8"
    pageEncoding="UTF-8"%>
<%
	String[] var1 = {"Brad","Kevin","Tony", "David"};
	pageContext.setAttribute("var1", var1);
	
	String[] var2 = {"Brad2","Kevin2","Tony2", "David2"};
	//request.setAttribute("var1", var2);

	String[] var3 = {"Brad3","Kevin3","Tony3", "David3"};
	//session.setAttribute("var1", var3);

	String[] var4 = {"Brad4","Kevin4","Tony4", "David4"};
	application.setAttribute("var1", var4);
	
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
	var1[0] = ${var1[0] }<br />
	var1[0] = ${pageScope.var1[0] }<br />
	var1[0] = ${requestScope.var1[0] }<br />
	var1[0] = ${sessionScope.var1[0] }<br />
	var1[0] = ${applicationScope.var1[0] }<br />
	
	</body>
</html>