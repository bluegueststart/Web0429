
<%@page import="org.apache.struts2.components.Include"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="../include/head.jsp"%>

<script type="text/javascript">
	$(function() {

		$("input[name=p]")[0].oninput=(function() {
          if(isNaN(this.value)){
             this.value="";
              };
		});

	});
</script>
<script>
	$(function() {
		$("#del").click(function() {

			return confirm('确认删除？');
		});
	});
</script>
</head>
<h3>查询用户</h3>
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
				<td>${s.did}${my:getDept(s.did).dname }</td>

				<td><a href="Staff_delete?sid=${s.sid}" id="del">删除</a> <a
					href="Staff_findById?sid=${s.sid}">修改</a></td>
			</tr>

		</c:forEach>
		<tr>
			<td colspan="6"><a href="${page.actionName}_find?p=1">首页</a> 
			
			
			  <a  href="${page.actionName}_find?p=${page.prev }">上一页</a> 
			 <c:forEach  begin="${page.startPage}" end="${page.endPage}"  var="x">
			 <c:if   test="${x==page.pg}">
             <button  style="color:red;">${x}</button>
            </c:if>
           <c:if   test="${x!=page.pg}">
			  <a  href="${page.actionName}_find?p=${x}"><button>${x}</button></a>
			  </c:if> 
			
			  
			 </c:forEach>
			  
			<a href="${page.actionName}_find?p=${page.next }">下一页</a> 
				
				
			<a  href="${page.actionName}_find?p=${page.maxPage}"> 末页</a>


			<form action="${page.actionName}_find" method="post" style="display: inline">
					跳到<input name="p" size="2">页
					<button type="submit">GO</button>
			</form>
			<font size="10"> ${page.pg}</font>  /  ${page.maxPage}
			</td>
		</tr>
	</table>
</body>
</html>