<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="processForm2" modelAttribute="user">
FirstName:<form:input path="firstName"/>
<br>
LastName:<form:input path="lastName"/>
<input type="submit" value="submit"/>
</form:form>

</body>
</html>