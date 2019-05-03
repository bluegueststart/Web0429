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
$(function(){
	$("#del").click(function(){
		return confirm("确认删除吗?");
		});
});
</script>
</head>
<body>
	<h3>部门列表</h3>
	<table border="2" width="100%" >
		<tr>
			<td>部门编号</td>
			<td>部门名称</td>
			<td>操作名称</td>

		</tr>

		<c:forEach items="${page.list}" var="d">
			<tr>
				<td>${d.did}</td>
				<td>${d.dname}</td>
				<td><a href="Dept_delete?did=${d.did}" id="del">删除</a> 
				<a  href="Dept_findById?did=${d.did}">修改</a></td>
			</tr>
			
			
		</c:forEach>
		<tr>
			<td colspan="3"><a href="${page.actionName}_find?p=1">首页</a> 
			
			
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