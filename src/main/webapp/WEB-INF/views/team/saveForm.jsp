<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@include file="../layout/header.jsp"%>
<div style="margin-left: 30%; margin-right: 30%; margin-top: 2%">
<h3 class="text-center">팀 등록</h3>
<form action="/action_page.php">
  <div class="form-group">
    <label for="text">이름</label>
    <input type="text" class="form-control" name="name" placeholder="이름">
  </div>
  
  <div class="form-group">
    <label for="text">구단 이름</label>
    <input type="text" class="form-control" name="stadiumName" placeholder="구단 이름">
  </div>
  
  <button type="submit" class="btn btn-primary">등록</button>
</form>
</div>
</body>
</html>