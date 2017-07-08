<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"/>
<title>商品リスト</title>
</head>
<body>
	<table>
		<tr>
			<th>商品名</th>
			<th>価格</th>
		</tr>
		<c:forEach var="product" items="${products}">
			<tr>
				<td>${product.name}</td>
				<td>${product.price}</td>
			</tr>
		</c:forEach>
	</table>

	<form method="POST" action="productsession">
		<p>
			名前<input type="text" name="name">
		</p>
		<p>
			値段<input type="text" name="price">
		</p>
		<input type="submit" value="登録">
	</form>

</body>
</html>