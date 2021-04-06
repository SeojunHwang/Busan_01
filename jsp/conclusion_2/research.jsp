<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>

<head>
  <title> 설문조사 결과 </title>
  <style type="text/css">
    b {
      font-size: 16pt;
    }
  </style>
</head>

<body>
  <h2>조사 결과</h2>
  <%
request.setCharacterEncoding("UTF-8");
String name = request.getParameter("name");
out.println("이름 : <b>" + name +"</b><br>");
String gender = request.getParameter("gender");
out.println("성별 : ");

if (gender.equals("male")) {
out.println("<b>남자</b><br>");
}
else {
out.println("<b>여자</b><br>");
}

String seasonArr[] = request.getParameterValues("season");
out.println("당신이 좋아하는 취미는 ");
for (int i=0; i<seasonArr.length; i++) {
int n = Integer.parseInt(seasonArr[i]);
switch (n) {
case 1: out.println("<b> 음악 </b>입니다.");
break;
case 2: out.println("<b> 게임 </b>입니다.");
break;
case 3: out.println("<b> 독서 </b>입니다.");
break;
case 4: out.println("<b> 프로그래밍 </b>입니다.");
break;
}
}
%>
  <br>
  <b><a href='javascript:history.go(-1)'> 다시 작성 </a></b>
</body>

</html>