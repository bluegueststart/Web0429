<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@ include file="../include/head.jsp"%>
<title>Insert title here</title>
<link rel="stylesheet" href="css/index.css">
</head>
<body>
	<div id="container">
		<div id="left">
			<ul>
				<li>部门管理
					<ul>
						<li>
						<a target="mainFrame" href="Dept/save.jsp">添加部门</a>
						</li>
						<li >
						<a target="mainFrame" href="Dept_find">查看部门</a>
						</li>
					</ul>
				</li>
			</ul>
			<ul>
				<li>员工管理
					<ul>
						<li>
						<a target="mainFrame" href="Staff/save.jsp">添加员工</a>
						</li>
						<li>
						<a target="mainFrame" href="Staff_find">查看员工</a>
						</li>
					</ul>
				</li>
			</ul>

		</div>
		<div id="right"> 
		<iframe name="mainFrame" width="100%" height="100%" frameborder="0"></iframe>
		
		</div>
	</div>

</body>
</html>