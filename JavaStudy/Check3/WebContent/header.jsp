<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%@ page import="java.util.*,java.text.SimpleDateFormat"%>
    <%@ page import="java.util.*,java.util.Calendar"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <link rel="stylesheet" href="css/style.css">
<title>Insert title here</title>
</head>
<body>

<div>
<label>login</label>

<label>
   <% Calendar a = Calendar.getInstance();
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
      String formatDate = sdf.format(a.getTime());
   out.print(formatDate); %>
  </label>

</div>

<!-- </body>
</html> -->
