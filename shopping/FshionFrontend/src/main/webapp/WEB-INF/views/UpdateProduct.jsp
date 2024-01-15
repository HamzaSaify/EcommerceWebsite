<%@page language="java" contentType="text/html"%>
<%@include file="Header.jsp" %>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<br> <br>
<c:url var="updateProduct" value="/UpdateProduct"/>

<form:form action="${updateProduct}" modelAttribute="product" method="post">

<table align="center" class="table-bordered">
<tr>
<td colspan="2"> <center> Update Product</center></td>
</tr>

<tr>
<td> Product ID</td>
<td> <form:input path="productId"/></td>
</tr>


<tr>
<td> Product Name</td>
<td> <form:input path="productName"/></td>
</tr>


<tr>
<td> Price </td>
<td> <form:input path="price"/></td>
</tr>





 


</table>
