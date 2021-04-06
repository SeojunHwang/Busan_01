<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html lang="ko">

<head>
  <title> 조사 양식 </title>
</head>

<body>
  <h2>취미를 선택하세요</h2>
  <form action="research.jsp" method="get">
    <table>
      <tr>
        <td> 이름 : </td>
        <td> <input type="text" name="name" size="20"> </td>
      </tr>
      <tr>
        <td> 성별 : </td>
        <td>
          <input type="radio" name="gender" value="male" checked=" checked">남자
          <input type="radio" name="gender" value="female"> 여자 </td>
      </tr>

      <tr>
        <td> 좋아하는 취미: </td>
        <td> <input type="checkbox" name="season" value="1"> 음악
          <input type="checkbox" name="season" value="2" checked="checked"> 게임
<input type="checkbox" name="season" value="3"> 독서
          <input type="checkbox" name="season" value="4"> 프로그래밍 </td>
      </tr>

      <tr align="center">
        <td> <input type="submit" value="전송"> </td>
        <td> <input type="reset" value="취소"> </td>
      </tr>
    </table>
  </form>
</body>

</html>