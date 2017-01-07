<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>My JSP 'list.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="bootstrap-3.3.5-dist/css/bootstrap.min.css">

  </head>
  
  <body>
    <div class="container">
    	<h1>User List</h1>
    	<table class="table">
    		<tr>
    			<th>id</th>
    			<th>name</th>
    			<th>password</th>
    			<th>操作</th>
    		</tr>
    		<c:forEach items="${userList}" var="user">
    			<tr>
    				<td>${user.id }</td>
    				<td>${user.name }</td>
    				<td>${user.password }</td>
    				<td><a href="update.jsp?id=${user.id }&name=${user.name }&password=${user.password }" class="btn btn-info">修改</a>&nbsp;&nbsp;
    				<a class="btn btn-info" href="DeleteUser?id=${user.id }">删除</a></td>
    			</tr>
    		</c:forEach>
    	</table>
    	<div align="center">
    		<a href="SelectUserList?currentPage=1">首页</a>  |
    		<a href="SelectUserList?currentPage=${page.currentPage -1 }">上一页</a>  |
    		<a href="SelectUserList?currentPage=${page.currentPage + 1 }">下一页</a>  |
    		<a href="SelectUserList?currentPage=${page.totalPage }">尾页</a>  |
	    	<font color="red">当前为${page.currentPage}页,共${page.totalPage}页</font> &nbsp;&nbsp;
   		</div>
   		<a href="add.jsp" class="btn btn-info">添加</a>
    </div>
  </body>
</html>
