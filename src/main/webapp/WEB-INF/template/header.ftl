<!DOCTYPE html>
<html lang="cn">
  <head>
    <title>葡萄园</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta name="Content-Language" content="utf-8" />
	<meta name="description" content="" />

    <link rel="stylesheet" href="./css/bootstrap.min.css">
	<link rel="stylesheet" href="./css/style.css">

    <script src="./js/jquery.min.js"></script>
    <script src="./js/bootstrap.min.js"></script>
  </head>
  <body>
	<nav class="navbar navbar-default navbar-fixed-top v-opacity" role="navigation">
		<div class="container">
		  <!-- Brand and toggle get grouped for better mobile display -->
		  <div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
			  <span class="sr-only">Toggle navigation</span>
			  <span class="icon-bar"></span>
			  <span class="icon-bar"></span>
			  <span class="icon-bar"></span>
			</button>
			<div class="v-logo"></div>
		  </div>

		  <!-- Collect the nav links, forms, and other content for toggling -->
		  <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav">
			  <li class="active"><a href="index.html">首页</a></li>
			  <li><a href="index.html">热门</a></li>
			  <li><a href="profile.html">我的</a></li>
			</ul>
			<form class="navbar-form navbar-left" role="search">
			  <div class="form-group">
				<input type="text" class="form-control" placeholder="大家正在搜索：xxx">
			  </div>
			  <button type="submit" class="btn btn-default"><span class="glyphicon glyphicon-search"></span></button>
			</form>
			<ul class="nav navbar-nav navbar-right">
				<#if userVo??>
				<li><a href="#"><span class="glyphicon glyphicon-edit"></span></a></li>
				<li><a href="#"><span class="glyphicon glyphicon-briefcase"></span></a></li>
				<li><a href="#"><span class="glyphicon glyphicon-envelope"></span></a></li>
				<li><a href="account.html"><span class="glyphicon glyphicon-cog"></span></a></li>
				<#else>
				<li><a href="login">登录</a></li>
				<li><a href="login">注册</a></li>
				</#if>
			</ul>
		  </div><!-- /.navbar-collapse -->
	  </div>
	</nav>
	<div class="container v-container v-opacity">
		<div class="row">