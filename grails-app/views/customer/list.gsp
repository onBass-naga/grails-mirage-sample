<%@ page import="com.area_b.samples.Customer" %>
<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main">
</head>
<body>
<div id="list-customer" class="content scaffold-list" role="main">
    <g:if test="${flash.message}">
        <div class="message" role="status">${flash.message}</div>
    </g:if>
    <g:form method="post" >
    <table>
        <tbody>
        <g:each in="${customers}" status="i" var="customer">
                <td>${fieldValue(bean: customer, field: "id")}<g:hiddenField name="record[${i}][id]" value="${fieldValue(bean: customer, field: "id")}" /></td>
                <td>${fieldValue(bean: customer, field: "name")}</td>
            </tr>
        </g:each>
        </tbody>
    </table>
        <g:actionSubmit class="save" controller="customer" action="update" value="GORMとMirageを両方使用" />
    </g:form>
</div>
</body>
</html>
