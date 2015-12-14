<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    This is my JSP page. <br>
   <form action = "user/add.action" method = "post">
    	<input type="text" value="" name="user">
	    <input type="text" value="" name="password">
	    <input type="text" value="" name="phoneNum">
	    <input type="text" value="" name="userName">
	    <input type="submit" value="add">
	</form> 
	<br>
	<form action = "data/temprc.action" method ="post">
		<input type="text" value="" name="bpm">
		<input type="text" value="" name="userId">
		<input type="text" value="" name="temprcId">
		<input type="text" value="" name="status">
		<input type="text" value="" name="temprctime">
		
		<input type="submit" value="DataAdd">
	</form>
	<br>
	<form action = "user/hbModify.action" method="post">
		<input type="text" value="" name="id">
		<input type="submit" value="heartbeat">
	</form>
	<form action = "user/sleepModify.action" method ="post">
		user<input type = "text" value = "" name="id">
		<input type = "submit" value="sleep">
	</form>
	
  </body>
</html>
