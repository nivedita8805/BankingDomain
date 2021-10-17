<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
 
<html>
<head>
<style type="text/css">
.styled-table {
    border-collapse: collapse;
    margin: 25px 0;
    font-size: 0.9em;
    font-family: sans-serif;
    min-width: 400px;
    box-shadow: 0 0 20px rgba(0, 0, 0, 0.15);
}
.styled-table thead tr {
    background-color: #009879;
    color: #ffffff;
    text-align: left;
}
.styled-table thead tr {
    background-color: #009879;
    color: #ffffff;
    text-align: left;
}
.styled-table thead tr {
    background-color: #009879;
    color: #ffffff;
    text-align: left;
}
.styled-table thead tr {
    background-color: #009879;
    color: #ffffff;
    text-align: left;
}
</style>
</head>
<body>
<table  border="1" class="styled-table">
<thead>
<tr>
    <th>Account Number</th>
    <th>Account Name</th>
    <th>Account Type</th>
    <th>Balance Date</th>
    <th>Currency</th>
    <th>Opening Available Balance</th>
  </tr>
  </thead>
<c:forEach var="item" items="${account}">
<tbody>
<tr>
<td> <a href="/getDetails"><c:out value="${item.accountNumber}"></c:out></a></td>
<td></a><c:out value="${item.accountName}"></c:out></td>
<td></a><c:out value="${item.accountType}"></c:out></td>
<td><c:out value="${item.balanceDate}"></c:out></td>
<td><c:out value="${item.currency}"></c:out></td>
<td class="active-row"><a href="/getDetails"></a><c:out value="${item.currencyOpeAvaBalance}"></c:out></td>

</tr>
<tbody>

</c:forEach>

</table>
</body>
</html>
