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

<form action="foresearch" method="post" >
	<div class="searchDiv">
		<input name="keyword" type="text" value="" placeholder="Java">
		<button  type="submit" class="searchButton">搜索</button>
	</div>
</form>


