<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table class="table">
  <thead>
<tr><th><center>Your Cart</center> </th></tr></thead>
			
    <tr class="table-primary">
      <th scope="col">Item</th>
      <th scope="col">Price</th>
      <th scope="col">Quantity</th>
         </tr>
  </thead>
  <tbody>
     <tr class="table-danger"><c:forEach var="cartItem" items="${cartitem}">
 
      <td class="table-danger"> ${cartItem.menuItem.description}</td>
      <td class="table-danger">${cartItem.menuItem.price}</td>
      <td class="table-danger">${cartItem.quantity}</td>
    </tr>
	
</c:forEach>
</table>
<h3>Total Amount(20% discount if you order more than 4 items): ${total}</h3>
<a href="/" > Like to order more items? Click here</a>
</body>
</html>