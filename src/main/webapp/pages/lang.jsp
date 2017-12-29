<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head><title>Enter the lang</title></head>
<body>
<form:form action="airports" method="post">
    Enter the language: <form:input  path="lang"/> <br/>
    <%--Enter Name:<form:input  path="name"/> <br/>--%>
    <%--Enter IATA:<form:input  path="IATA"/> <br/>--%>

    <input type="submit">

</form:form>
</body>
</html>