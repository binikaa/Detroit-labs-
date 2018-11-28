<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

<meta charset="ISO-8859-1">
<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<title>Taco Loco</title>
</head>
<body>

<table class="table">
  <thead>
<tr><th><center>Taco Loco Menu</center> </th></tr></thead>
			
    <tr class="table-primary">
      <th scope="col">Item No</th>
      <th scope="col">Item </th>
      
      <th scope="col">Description</th>
      <th scope="col">Price</th>
    </tr>
  </thead>
  <tbody>
   <c:forEach items="${items}" var="item">
			<tr class="table-danger">
      
      <td class="table-danger">${item.id}</td>
      <td class="table-danger">${item.name}</td>
      <td class="table-danger">${item.description}</td>
      <td class="table-danger">${item.price}</td>
      <td><a class="badge badge-primary" href="/addtocart/${item.id}">Add to cart </a></td>
    </tr>
   </c:forEach> 

      
    
  </tbody>
</table>
</body>
</html>