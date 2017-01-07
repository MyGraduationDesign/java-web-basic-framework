<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'itemsList.jsp' starting page</title>
    
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
    <form action="${pageContext.request.contextPath }/item/queryItem.action" method="post">
查询条件：
<table width="100%" border=1>
<tr>
<td><input type="submit" value="查询"/></td>
</tr>
</table>
User列表：
<table width="100%" border=1>
<tr>
	<th>id</th>
	<th>name</th>
	<th>sex</th>
	<th>note</th>
	<th>操作</th>
</tr>
<c:forEach items="${itemsList }" var="item">
<tr>
	<td>${item.id }</td>
	<td>${item.name }</td>
	<td>${item.sex }</td>
	<td>${item.note }</td>	
	
	<td>
		<a href="${pageContext.request.contextPath }/user/editUser.action?id=${item.id}">修改</a>
		<a href="${pageContext.request.contextPath }/user/delUser.action?id=${item.id}">删除</a>
	</td>

</tr>
</c:forEach>

</table>
</form>
<a href="${pageContext.request.contextPath }/addUser.jsp">添加</a>
  </body>
</html>
