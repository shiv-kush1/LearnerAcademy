<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

welcome <%=session.getAttribute("myname") %>>  !!!

<Br>
<a href="StudentServlet">Create Student MasterTable</a>&nbsp;

<a href="StudentLoader">Show Student MasterTable</a>

<Br>
<a href="SubjectServlet">Create Subject MasterTable</a>&nbsp;

<a href="SubjectLoader">Show Subject MasterTable</a>

<Br>
<a href="TeacherServlet">Create Teacher associate with class &subject</a>&nbsp;

<a href="TeacherLoader">Show Teacher associate with class &subject</a>

<Br>
<a href="TeacherServletF">Create Teacher associate with class & subject& Student </a>&nbsp;

<a href="TeacherLoaderF">Show Teacher associate with class & subject& Student</a>

<Br>

<a href="logout.jsp">logout</a>



</body>
</html>