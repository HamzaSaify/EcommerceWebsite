<%@ page language="java" contenetType="text/html" %>
<%@include file="Header.jsp" %>
<form action="perform_login" method="post">
<table border="1" align="center">

<tr bg color="gray">
<td colspan="2"><center> Signin</center></td>
</tr>

<tr bgcolor="pink">
<td> Login Name</td>
<td> <input type="text" name="username" required/></td>
</tr>

<tr bgcolor="pink">
<td> Password </td>
<td> <input type="password" name="password" required/></td>
</tr>

<tr bgcolor="gray">
<td colspan="2"> <center><input type="submit" value="LOGIN"/></center></td>
</tr>






</table>




</form>