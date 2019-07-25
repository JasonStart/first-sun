<!DOCTYPE html>
<html lang="zh-CN">
<head>
<!-- 公共的  taglib  -->
<%@include file="/pages/commons/common.jsp"%>
<!-- 公共的 css  -->
<%@include file="/pages/commons/common_css.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户管理</title>
	<link rel="stylesheet" type="text/css" href="${staticbase }/css/member.css">
</head>
<body>
	<header id="topnav" class="navbar navbar-brand-primary navbar-fixed-top navbar-indigo" role="banner">
		<div class="logo-area">
			<a href="index" class="navbar-brand navbar-brand-inverse">
				<img src="${staticbase }/assets/img/logo-icon-white.png" alt="poster" class="show-on-collapse img-logo-white">
				<img src="${staticbase }/assets/img/logo-icon-dark.png" alt="poster" class="show-on-collapse img-logo-dark">
				<img src="${staticbase }/assets/img/logo-white.png" alt="poster" class="img-white">
				<img src="${staticbase }/assets/img/logo-dark.png" alt="poster" class="img-dark">
			</a>
			<span id="trigger-sidebar" class="toolbar-trigger toolbar-icon-bg stay-on-search">
				<a data-toggle="tooltips" data-placement="right" title="Toggle Sidebar">
					<span class="icon-bg">
						<i class="material-icons">menu</i>
					</span>
				</a>
			</span>
			<div class="topbar-title">
				<ol class="breadcrumb">
					<li><a href="${staticbase }/">首页</a></li>
				</ol>
			</div>
		</div>
		<div class="quit pull-right">
			<a class="btn btn-inverse btn-raised btn-sm" href="${staticbase }/admin/logout">退出</a>
		</div>
	</header>
	<div id="wrapper">
		<div id="layout-static">
			<!-- 公共的左侧菜单  -->
			<%@include file="/pages/commons/side.jsp"%>
			<div class="static-content-wrapper">
				<div class="welcome-content">欢迎登录用户管理系统</div>
			</div>
		</div>
	</div>
</body>
<!-- 公共的js  -->
<%@include file="/pages/commons/common_script.jsp"%>
<script>
// 初始化左侧导航信息
SidebarMenu(0);
</script>
</html>
