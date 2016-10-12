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

    <c:choose>
        <c:when test="${helloForm.person.dob eq null}">
            <input value="" name="person.dateOfBirth"/>
        </c:when>
        <c:otherwise>
            <input value="<fmt:formatDate value="${helloForm.person.dob}" pattern="${sessionScope.DATE_PATTERN}"/>" name="person.dateOfBirth"/>
        </c:otherwise>
    </c:choose>

    <span style="color:blue;"><form:errors path="person.dateOfBirth"/></span>


    <input type="submit" value="Save"/>

</form:form>


</body>
</html>
