<%@ page language="java" contentType="text/html; charset=UTF8"
    pageEncoding="UTF-8"%>
<%@ page import="tw.brad.api.*" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
	<sql:setDataSource
		driver="com.mysql.cj.jdbc.Driver"
		url="jdbc:mysql://localhost/iii"
		user="root"
		password="root"
		/>
	<sql:query var="rs">
		SELECT * FROM food
	</sql:query>
	
	<c:set var="rpp" value="10" />
	<c:set var="pages">${rs.rowCount % rpp == 0 ? rs.rowCount / rpp : (rs.rowCount - (rs.rowCount % rpp)) / rpp + 1 }</c:set>
	
	<c:set var="page">${param.page == null ? 1 : param.page }</c:set>
	<c:set var="prev">${page - 1 == 0 ? 1 : page - 1 }</c:set>
	<c:set var="next">${BradUtils.nextPage(page, pages) }</c:set>
	<c:set var="start">${(page - 1) * rpp }</c:set>
	
	<sql:query var="rs2">
		SELECT * FROM food LIMIT ${start }, ${rpp }
	</sql:query>
	
	
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		總筆數: ${rs.rowCount } | 總頁數: ${pages }<br />
		<a href="?page=${prev }">Prev</a> | <a href="?page=${next }">Next</a>
		<hr />
		<table border="1" width="100%">
			<tr>
				<th>#</th>
				<th>Name</th>
				<th>Tel</th>
				<th>City</th>
				<th>Town</th>
				<th>Image</th>
			</tr>
			<c:forEach items="${rs2.rows }" var="row">
				<tr>
					<td>${row.id }</td>
					<td>${row.name }</td>
					<td>${row.tel }</td>
					<td>${row.city }</td>
					<td>${row.town }</td>
					<td><img src="${row.picurl }" width="100px" height="60px"/></td>
				</tr>
			</c:forEach>
		</table>
	</body>
</html>