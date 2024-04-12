<%@page import="com.mtechdemo.dao.UserDao"%>
<jsp:useBean id="u" class="com.mtechdemo.bean.User"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>

<%
int i=UserDao.update(u);
response.sendRedirect("viewusers.jsp");
%>