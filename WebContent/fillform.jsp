<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.error{
color:red;
}
</style>
</head>
<body>

<s:form action="registered.htm" modelAttribute="stu">
<table border="2">
<tr><td>id</td><td>name</td><td>pincode</td><td>phno</td><td>date</td></tr>
<tr><td>
<br><s:label path="id"></s:label>
<s:input path="id"/>
<s:errors path="id" cssClass="error"></s:errors>
</td><td>
<br><s:label path="name"></s:label>
<s:input path="name"/>
<s:errors path="name" cssClass="error"></s:errors>
</td><td>
<br><s:label path="pincode"></s:label>
<s:input path="pincode"/>
<s:errors path="pincode"></s:errors>
</td><td>
<br><s:label path="phno"></s:label>
<s:input path="phno"/>
<s:errors path="phno"></s:errors>
</td><td>
<br><s:label path="date"></s:label>
<s:input path="date"/>
<s:errors path="date"></s:errors>
</td></tr><tr>
<input type="submit" value="register">
</tr>
</table>
</s:form>
</body>
</html>