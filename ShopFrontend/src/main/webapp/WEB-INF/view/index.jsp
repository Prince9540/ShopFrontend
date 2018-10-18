<%@taglib uri="http://www.springframework.org/security/tags" prefix="security" %>

<%@include file ="Header.jsp"%>

<security:authorize access="hasRole('ROLE_ADMIN')">
<jsp:forward page="/adminHome"/>
</security:authorize>

<%@include file ="Carousel.jsp"%>
<%@include file ="Footer.jsp"%>