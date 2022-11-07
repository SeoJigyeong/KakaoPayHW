<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
</head>
<body>
<h3>Items List</h3>
<c:if test="${!empty listOfItems}">
	<table class="tg">
	<tr>
		<th width="80">Id</th>
		<th width="120">Items Name</th>
		<th width="120">Price</th>
		<th width="60">Edit</th>
		<th width="60">Delete</th>
	</tr>
	<c:forEach items="${listOfItems}" var="items">
		<tr>
			<td>${items.id}</td>
			<td>${items.itemsName}</td>
			<td>${items.price}</td>
		</tr>
	</c:forEach>
	</table>
</c:if>
</body>
</html>
