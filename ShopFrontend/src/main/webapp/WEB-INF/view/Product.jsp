
 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>   
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="Header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product</title>

<style>
   body {
     
    background-size: cover;}   
    div.container{background-color:#F2F2F2;}
  </style>
  
</head>
<body>

<br><br>
<div class="container" width="50%">
<h2 align="center">Add Product</h2><hr>
<spring:form action="${pageContext.request.contextPath}/adminAddProduct" modelAttribute="product" method="POST">
<div class="form-group">
<c:if test="${not empty product.productName}">
<label for="pid">Product Id:</label>
<spring:input type="text" path="productId" class="form-control" id="pid"  readonly="true" disabled="true"/>
<spring:hidden path="productId"/>
</c:if>
</div>
<div class="form-group">
<label for="pname">Product Name:</label>
 <spring:input type="text" class="form-control" id="pname" path="productName"/>
 </div>
 <div class="form-group">
 <label for="pdesc">Product Description:</label>
<spring:input type="text" class="form-control" id="pdesc" path="productDescription"/>
</div>
 <div class="form-group">
 <label for="pprice">Product Price:</label>
<spring:input type="number" class="form-control" id="pprice" path="productPrice"/>
</div>
<div class="form-group">
<label for="pQty">Product Quantity:</label>
<spring:input type="number" class="form-control" id="pQty" path="productQuantity"/>
</div>

<c:if test="${empty product.productName}"><button type="submit" class="btn btn-outline-success my-2 my-sm-0"><b>ADD</b></button></c:if>
<c:if test="${not empty product.productName}"><button type="submit" class="btn btn-outline-success my-2 my-sm-0"><b>Update</b></button></c:if>

<spring:select path="categoryId">
<c:forEach items="${categoryList}" var="catObj">
<option value="${catObj.categoryId }">${catObj.categoryName }</option>
</c:forEach>
</spring:select>




</spring:form>
</div>



<br></br>


<c:if test="${not empty productList}">
<div class="container">

<table class="table table-hover" >

 <thead> 
<tr>
<th>Product Id</th>
<th>Product Name</th>
<th>Product Description</th>
<th>Product Price</th>
<th>Product Quantity</th>
<th>Product Edit</th>
<th>Product Delete</th>
</tr>
</thead>

<c:forEach items="${productList}" var="pro">

<tbody>
<tr>
<td><b>${pro.productId}</b></td>
<td><b>${pro.productName}</b></td>
<td><b>${pro.productDescription}</b></td>
<td><b>${pro.productPrice}</b></td>
<td><b>${pro.productQuantity}</b></td>
<td><a href="adminEditProduct/${pro.productId}"><b>Edit</b></a></td>
<td><a href="adminDeleteProduct/${pro.productId}"><b>Delete</b></a></td>
</tr>
</tbody>
</c:forEach>
</table>
</div>
</c:if>
</body>
</html>