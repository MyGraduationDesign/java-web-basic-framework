<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'add.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" type="text/css" href="bootstrap-3.3.5-dist/css/bootstrap.min.css">
  </head>
  
  <body>
    <div class="container">
    	<div> 
    		<form action="AddUser">
    			<table class="table">
    				<tr>
    					<td>Name:</td>
    					<td><input type="text" name="name"/></td>
    				</tr>
    				<tr>
    					<td>Password:</td>
    					<td><input type="text" name="password"/></td>
    				</tr>
    			</table>
    			<input type="submit" value="add" class="btn btn-success"/>
    		</form>
    	</div>
    </div>
  </body>
</html>
