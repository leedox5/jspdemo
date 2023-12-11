<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>사용자 목록</title>
</head>
<body>
  <h2>사용자 목록</h2>
  <table border="1">
    <thead>
      <tr>
        <th>NO</th>
        <th>이름</th>
        <th>이메일</th>
      </tr>
    </thead>
    <tbody>
      <c:forEach var="item" items="${users}" varStatus="idx">
      <tr>
        <td>${idx.index}</td>
        <td>${item.name}</td>
        <td>${item.email}</td>
      </tr>
      </c:forEach>
    </tbody>
  </table>
</body>
</html>

