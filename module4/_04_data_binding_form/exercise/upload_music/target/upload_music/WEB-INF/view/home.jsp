<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <h1>List Song</h1>
    <a href="/create">Add new</a>
</div>
<table>
    <thead>
    <th>Name</th>
    <th>Artist</th>
    <th>Genre</th>
    <th>Link</th>
    </thead>
    <tbody>
    <c:forEach var="e" items="${res}">
        <tr>
            <td><c:out value="${e.name}"/></td>
            <td>${e.artist}</td>
            <td>${e.genre}</td>
            <td>
                <img style="width:50px;height:50px" src="<c:url value="${e.link}"/>"/>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
