<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>修改部门</h3>
	<form action="Dept_update" method="post">
	<input  type="hidden"  name="did"  value="${dept.did}">
		部门名称 <input type="text" name="dname"   value="${dept.dname}">
		<button type="submit">修改</button>



	</form>
</body>
</html>