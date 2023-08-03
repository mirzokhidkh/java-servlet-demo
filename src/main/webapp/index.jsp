<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
<br/
>
<a href="searcher.jsp">Google Searcher</a>


<br/>
<%--<form action="welcome" method="get">--%>
<%--    Enter your name<input type="text" name="name"><br>--%>
<%--    <input type="submit" value="login">--%>
<%--</form>--%>

<br/>

<form action="welcome" method="post">
    Name:<input type="text" name="name"/><br/>
    Password:<input type="password" name="uPassword"/><br/>
    <input type="submit" value="login"/>
</form>


</body>
</html>