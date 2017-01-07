<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'addUser.jsp' starting page</title>
    
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
<form id="itemForm" action="${pageContext.request.contextPath }/user/addUser.action" method="post" >
	添加User信息：
	<table width="100%" border=1>
	<tr>
		<td>name</td>
		<td><input type="text" name="name" value=""/></td>
	</tr>
	<tr>
		<td>sex</td>
		<td><input type="text" name="sex" value=""/></td>
	</tr>
	<tr>
		<td>note</td>
		<td>
		<textarea rows="3" cols="30" name="note"></textarea>
		</td>
	</tr>
	<tr>
	<td colspan="2" align="center"><input type="submit" value="提交"/>
	</td>
	</tr>
	</table>

</form>
  </body>
</html>
