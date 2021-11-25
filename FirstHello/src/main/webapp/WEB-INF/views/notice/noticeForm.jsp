<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
      <div>
         <h1>공지사항 등록</h1>
      </div>
      <form action="noticeRegister.do" method="post">
         <!-- 파일첨부를 위해 encrtype multipart formdata 필수로 -->
         <div>
            <table border="1">
               <tr>
                  <th>작성자</th>
                  <td><input type="text" id="name" name="name"></td>
                  <th>아이디</th>
                  <td><input type="text" id="id" name="id"></td>
                  <th>작성일</th>
                  <td><input type="date" id="wdate" name="wdate"></td>
               </tr>
               <tr>
                  <th>제목</th>
                  <td colspan="5"><input type="text" name="title" id="title"></td>
               </tr>
               <tr>
                  <th>내용</th>
                  <td colspan="5"><textarea rows="6" cols="50" name="subject"
                        id="subject"></textarea></td>
               </tr>
               <tr>
                  <th>비고</th>
                  <td colspan="5">
                  	<input type="text" id="bigo" name="bigo"> 
                  </td>
               </tr>
            </table>
         </div>
         <input type="submit" value="저장">&nbsp; <input type="button"
            onclick="location.href='home.do'" value="취소">
         <script type="text/javascript">
            document.getElementById('wdate').value = new Date()
                  .toISOString().substring(0, 10);
         </script>
      </form>
   </div>
</div>
</body>
</html>