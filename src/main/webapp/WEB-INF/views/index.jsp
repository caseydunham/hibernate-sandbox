<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:basepage>
    <jsp:body>
        <form action="/hibernate-sandbox/search">
            <input type="text" id="q" name="q" value=""/>
            <input type="submit" value="Search"/>
        </form>

        <table>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Account ID</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${customers}" var="customer">
                    <tr>
                        <td><c:out value="${customer.id}"/></td>
                        <td><c:out value="${customer.name}"/></td>
                        <td><c:out value="${customer.accountId}"/></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </jsp:body>
</t:basepage>
