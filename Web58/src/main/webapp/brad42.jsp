<%@ page language="java" contentType="text/html; charset=UTF8"
    pageEncoding="UTF-8"%>
<%
	String view = "brad44";
	String viewer = String.format("%s.jsp", view);
%>
<jsp:forward page="<%= viewer %>"></jsp:forward>