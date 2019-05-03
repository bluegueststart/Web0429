<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="../include/head.jsp"%>
<%@ taglib  uri="/struts-tags"  prefix="s"%>



<script type="text/javascript">
$(function() {
	var aa = false;
	alert(1);
	$("input[name=dname]")[0].oninput = function() {
		//var  re=/^[\u0061-\u007a]{2-4}&/
		var re = /^[a-z]{2,4}$/;
		aa = re.test(this.value);
		if(aa) {
//			this.nextElementSibling.innerHTML = "正确";
			$(this).next().html("正确");
		} else {
//			this.nextElementSibling.innerHTML = "错误";
				$(this).next().html("错误");
		};
	};
	$("form:eq(0)").submit(function() {
		return aa;

	});

});
</script>
</head>
<body>
  	<h3>添加部门</h3>
<!--	<form action="Dept_save" method="post">
		部门名称 <input type="text" name="dname"  value="${param.dname}">
		<!--  部门名称 <input type="text" name="dname" value="<%=request.getParameter("dname")%>"> -->
	<!--	<span>
		<s:fielderror fieldName="error"></s:fielderror>
		</span>
		<button type="submit">添加</button>

</form>
	-->
	<s:form action="Dept_save">
	
	部门名称<s:textfield  name="dname"></s:textfield>
	<s:submit>添加</s:submit>
	
	</s:form>
	
</body>
</html>