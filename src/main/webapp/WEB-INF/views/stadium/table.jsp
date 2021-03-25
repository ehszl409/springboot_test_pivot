<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	<%@include file="../layout/header.jsp" %>

	<div class="container my-5">
		<table class="table">
			<thead class="thead-dark">
				<tr>
					<th>번호</th>
					<th>이름</th>
					<th>팀</th>
					<th>관리</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach var="stadiumList" items="${stadiums}">
				<tr>
					<td>${stadiumList.id}</td>
					<td>${stadiumList.name}</td>
					<td>${stadiumList.teamName}</td>
					<td class="btn btn-danger" id="btn_delete">삭제</td>
				</tr>			
			</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>
