<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head><title>Airports info</title></head>
<body>

<c:set var="ctx" value="${request.getContextPath()}" />
<a href="${ctx}/lang"><b>Lang : ${param.lang}</b></a><br/><br/>
<%--Name : ${param.name}<br/>--%>
<%--Name : ${paramValues.name[0]}<br/>--%>

<table>

    <c:forEach items="${paramValues.names}" var="airport">
        <tr>
            <td><c:out value="${airport}" /></td>
            <%--<td><c:out value="${airport}" /></td>--%>
        </tr>
    </c:forEach>

</table>

<%--
<c:forEach varStatus="loopCounter" items="${names}" var="airport">
        &lt;%&ndash;<c:out value="${airport}" /><br/>&ndash;%&gt;
        <c:out value="${airport.name}" /><br/>
        <c:out value="${airport.Name}" /><br/>
        <c:out value="${airport.NAME}" /><br/>
        <c:out value="${airport.iata}" /><br/>
        <c:out value="${airport.IATA}" /><br/>
</c:forEach>
--%>

</body>
</html>