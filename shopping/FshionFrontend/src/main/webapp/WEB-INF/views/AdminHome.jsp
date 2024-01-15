<%@ page language="java" contenType="text/html"%>
<%@include file="Header.jsp"%>


<h3></h3>
<c:forEach items="${productList}" var="product">
<div class="col-sm-4 col-md-3">
<a href ="<c:url value="/totalProductDisplay/${product.productId}" />" class="thumbnail">
<img src="<c:url value="/resource/images/${product.product.Id}.jpg" />" alt="Generic placeholder thumbnail">
</a>

<p align="center">${product.productName}</p>
<p align="center">Price : INR ${product.price}</p>
<p align="center"> Stock :${product.stock}</p>




</div>


</c:forEach>
</body>
</html>
