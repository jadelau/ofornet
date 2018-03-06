<!-- <html>
<body>
<h2>Hello World!</h2>
</body>
</html> -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8" isELIgnored="false"%>
		 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix='fmt' uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<body>
<h2>Hello World!</h2>
<form action="foresearch" method="post" >
	<div class="searchDiv">
		<input name="keyword" type="text" value="" placeholder="时尚男鞋  太阳镜 ">
		<button  type="submit" class="searchButton">搜索</button>
	</div>
</form>

<c:forEach items="${ps}" var="p">
<span >${p.name}</span><br>
</c:forEach>

</body>
</html>


