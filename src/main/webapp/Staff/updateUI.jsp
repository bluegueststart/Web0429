<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@  include  file="../include/head.jsp" %>

</head>
<script >
$(function(){
	$("option[value=staff.did]").attr(selected,"selected");
});

  
  
</script>
<body>
<h3>修改员工</h3>
	<form action="Staff_update" method="post">
	<input  type="hidden"  name="sid"  value="${staff.sid}">
	
		名字 <input type="text" name="sname"   value="${staff.sname}"> <br />
		薪水 <input type="text" name="salary"   value="${staff.salary}"> <br />
		入职日期 <input type="text" name="hiredate"   value="${staff.hiredate}"> <br />
		部门 
		  <select  name="did">
		  <c:forEach  items="${deptlist }"  var="dept">
		
		  <option   value="${dept.did }"   >
		 ${dept.dname}
		  </option>
		  </c:forEach>
		  
		  </select><br />
		
		
		
		<button type="submit">修改</button>



	</form>
</body>
</html>