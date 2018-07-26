<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table>
		<tr>
			<td colspan="6">员工信息管理平台</td>
			
		</tr>
		<tr align="center">
			<td>编号</td>
			<td>姓名</td>
			<td>身份证号</td>
			<td>毕业学校</td>
			<td>学历</td>
			<td>调度管理</td>
		</tr>
		<c:forEach items="${allEmp }"  var="allemp">
		<tr>
			<td>${allemp.eno }</td>
			
			<td>${allemp.idCard }</td>
			<td>${allemp.empName }</td>
			<td>${allemp.graduate }</td>
			<td>${allemp.lastEducation }</td>
			<td><a href="getEno.zhd?eno=${allemp.eno }">员工调用</a>||<a href="getAllWork.zhd?eno=${allemp.eno }">查看历史调动</a></td>

		</tr>
		</c:forEach>
	</table>



</body>
</html>