<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Time Treasure</title>
</head>
<body>
    <a href="/login">
        <button>로그인 페이지</button>
    </a>
    <div>
        <h1>판매중인 유물</h1>
        <p>판매중인 유물 목록입니다.</p>
        <table border="1">
            <tr>
                <th>유물 이름</th>
                <th>가격</th>
                <th>희귀도</th>
                <th>구매</th>
            </tr>
            <c:forEach var="item" items="${artifacts}" varStatus="idx">
            <tr>
                <td>${item.name}</td>
                <td>${item.price}</td>
                <td>${item.rarity}</td>
                <td>
                    <form action="purchaseArtifact" method="post">
                        <input type="hidden" name="artifactId" value="${artifactId}">
                        <input type="submit" value="구매">
                    </form>
                </td>
            </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>

