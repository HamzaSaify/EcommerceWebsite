<%@ page language="java" contentType="text/html" %>
<%@include file="Header.jsp" %>
<div class="container">
<form action="<c:url value="/receipt"/>" method="post">
<table class="table table-bordered" width="50%" align="center">
<tr class="success">
<td colspan="2"><center>Payment Detail</center></td>
</tr>

<tr class="info">
<td colspan="2"></td>


<center>
<input type="radio" name="rd" value="cc">Credit Card
<input type="radio" name="rd" value="cod">Cash On Delivery
</center>
</td>
</tr>



<tr class="warning">
<td>Card Number</td>
<td><input type="text" name="cadano"/></td>
</tr>



<tr class="warning">
<td>Valid</td>
<td>Valid<input type="text" name="Valid"/></td>
<td>CVV<input type="text" name="CVV"/></td>
</tr>

<tr class="warning">
<td><input type ="text" name="name"/></td>
</tr>

<tr class="success">
<td colspan="2"><center><input type="submit" value="Pay" class="btn btn-success"/></center>
</td>
</tr>

</table>
</form>
</div>
</body>
</html>