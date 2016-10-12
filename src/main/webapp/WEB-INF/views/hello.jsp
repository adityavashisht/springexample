<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form:form modelAttribute="helloForm" method="post">

    <form:input path="prefix"/>
    <br/>
    <form:input path="person.first"/>
    <br/>

    <input value="<fmt:formatDate value="${helloForm.person.dob}" pattern="${sessionScope.DATE_PATTERN}"/>" name="person.dateOfBirth"/>


    <input type="submit" value="Save"/>

</form:form>


</body>
</html>
