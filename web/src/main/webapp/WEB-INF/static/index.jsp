<%@page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<spring:url value="js/nprogress.js" var="nprogressJs" />
<spring:url value="css/nprogress.css" var="nprogressCss" />
<spring:url value="js/jquery-2.1.4.min.js" var="jquery" />
<spring:url value="css/font-awesome.css" var="awesome" />
<spring:url value="css/ext-theme-crisp-all.css" var="themeCss" />
<spring:url value="js/ext-all.js" var="extAll" />
<spring:url value="app/app.js" var="appJs" />
<!DOCTYPE html>
<html>
<head>
<meta charset=”UTF-8″>
<title>AM-CLIENT</title>
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta charset="UTF-8">
    <script type="text/javascript" src="${nprogressJs}"></script>
    <link type="text/css" rel="stylesheet" href="${nprogressCss}">
    <script type="text/javascript" src="${jquery}"></script>
	<link type="text/css" rel="stylesheet" href="${awesome}">
	<link type="text/css" rel="stylesheet" href="${themeCss}">
    <script type="text/javascript" src="${extAll}"></script>
    <script type="text/javascript" src="${appJs}"></script>
</head>
<body>
    <script language="javascript">
        $(function(){
            NProgress.start();
        })

        $(window).load(function() {
            NProgress.done();
        })
        function getCookie(name) {
            var cookieValue = null;
            if (document.cookie && document.cookie != '') {
                var cookies = document.cookie.split(';');
                for (var i = 0; i < cookies.length; i++) {
                    var cookie = jQuery.trim(cookies[i]);
                    // Does this cookie string begin with the name we want?
                    if (cookie.substring(0, name.length + 1) == (name + '=')) {
                        cookieValue = decodeURIComponent(cookie.substring(name.length + 1));
                        break;
                    }
                }
            }
            return cookieValue;
        }
    </script>
</body>
</html>
