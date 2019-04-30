
<%@page import="org.apache.struts2.components.Include"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="../include/head.jsp"%>

<script>
	$(function() {
		$("#del").click(function() {

			return confirm('确认删除？');
		});
	});
</script>
</head>
<body>
	<h3>部门列表</h3>
	<table border="2" width="100%">
		<tr>
			<td>员工编号</td>
			<td>员工名字</td>
			<td>员工薪水</td>
			<td>员工入职日期</td>
			<td>员工部门</td>
			<td>员工操作</td>
		</tr>

		<c:forEach items="${page.list}" var="s">
			<tr>

				<td>${s.sid}</td>
				<td>${s.sname}</td>
				<td>${s.salary}</td>
				<td>${s.hiredate}</td>
				<td>${s.did} 
				${my:getDept(s.did).dname }
				</td>

				<td><a href="Staff_delete?sid=${s.sid}" id="del">删除</a> <a
					href="Staff_findById?sid=${s.sid}">修改</a></td>
			</tr>

		</c:forEach>
	</table>
</body>
</html>