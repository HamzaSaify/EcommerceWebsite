<%@page language="java" contentType="text/html"%>
<%@include file="/WEB-INF/views/Header.jsp" %>
<div class="container">
<h2>Home Page</h2>
<div id="myCarousel" class="carousel slide" data-ride="carosuel">

<ol class="carosuel-indicators">
<li data-targets="#myCarosuel" data-slide-to="0" class="active"></li>
<li data-targets="#myCarosuel" data-slide-to="1" ></li>
<li data-targets="#myCarosuel" data-slide-to="2" ></li>
</ol>

<div class="carosuel-inner">

<div class="item active">
<img src="<c:url value='resource/images/Big Bazar.jpg'/>" alt="Los Angeles" style="width:100%;"> 
</div>

<div class="item">
<img src="<c:url value='resource/images/wc-banner.jpg'/>" alt="Chicago" style="width:100%;"> 
</div>

<div class="item">
<img src="<c:url value='resource/images/winter ware.jpg'/>" alt="Chicago" style="width:100%;"> 
</div>

<div class="item active">
<img src="<c:url value='resource/images/mobile.jpg'/>" alt="Chicago" style="width:100%;"> 
</div>

<div class="item active">
<img src="<c:url value='resource/images/Big Bazar.jpg'/>" alt="NewYork" style="width:100%;"> 
</div>
</div>

<a class="left carousel-control" href="#myCarousel" data-slide="prev">
<span class="glyphicon glyphicon-chevron-left"><span>
<span class="sr-only">Previous</span> 
</a>

<a class="right carousel-control" href="#myCarousel" data-slide="prev">
<span class="glyphicon glyphicon-chevron-left"><span>
<span class="sr-only">Previous</span> 
</a>




</div>







<h2>Home Page</h2>

</body>
</html>