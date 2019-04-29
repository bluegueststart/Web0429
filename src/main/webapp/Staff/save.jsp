<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="../include/head.jsp" %>
</head>
<body>
	<h3>添加员工</h3>
	<form action="Staff_save" method="post">
		名字 <input type="text" name="sname"><br/>
		薪水 <input type="text" name="salary"><br/>
		入职日期 <input type="text" name="hiredate"><br/>
		部门
		<select  name="did">
		<c:forEach  items="${deptlist}"  var="dept">
		<option  value="${dept.did}" >${dept.dname}</option>
		
		</c:forEach>
		</select><br/>
		<button type="submit">添加</button>



	</form>

</body>
</html>