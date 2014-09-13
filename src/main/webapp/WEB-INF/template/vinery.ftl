 <#import "spring.ftl" as spring />
 <#--
 * vineryBind
 *
 * @param object : object.
 *
 * @param path : the path (string value) of the value required to bind to.
 *   Spring defaults to a command name of "command" but this can be overridden
 *   by user config.
 -->
<#macro message code>
	<#if code!=''>
	    <@spring.message code/>
    </#if>
</#macro>

<#macro bind obj path separator>
	<#if obj!=''>
	    <@spring.bind path/><@spring.showErrors separator/>
    </#if>
</#macro>

<#macro header title activeName>
	<!DOCTYPE html>
	<html lang="cn">
	  <head>
	    <title>${title}</title>
	    <meta name="viewport" content="width=device-width, initial-scale=1.0">
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta name="Content-Language" content="utf-8" />
		<meta name="description" content="" />
	
	    <link rel="stylesheet" href="/css/bootstrap.min.css">
		<link rel="stylesheet" href="/css/style.css">
	
	    <script src="/js/jquery.min.js"></script>
	    <script src="/js/bootstrap.min.js"></script>
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
					  <li<#if activeName=="home"> class="active"</#if>><a href="/">首页</a></li>
					  <li<#if activeName=="hot"> class="active"</#if>><a href="index.html">热门</a></li>
					  <li<#if activeName=="my"> class="active"</#if>><a href="profile.html">我的</a></li>
					</ul>
					<form class="navbar-form navbar-left" role="search">
					  <div class="form-group">
						<input type="text" class="form-control" placeholder="大家正在搜索：xxx">
					  </div>
					  <button type="submit" class="btn btn-default"><span class="glyphicon glyphicon-search"></span></button>
					</form>
					<ul class="nav navbar-nav navbar-right">
						<#if currentUser??>
						<li<#if activeName=="add"> class="active"</#if>><a href="#"><span class="glyphicon glyphicon-edit"></span></a></li>
						<li<#if activeName=="col"> class="active"</#if>><a href="#"><span class="glyphicon glyphicon-briefcase"></span></a></li>
						<li<#if activeName=="mail"> class="active"</#if>><a href="#"><span class="glyphicon glyphicon-envelope"></span></a></li>
						<li<#if activeName=="set"> class="active"</#if>><a href="/set/index"><span class="glyphicon glyphicon-cog"></span></a></li>
						<#else>
						<li><a href="/login">登录</a></li>
						<li><a href="login">注册</a></li>
						</#if>
					</ul>
				  </div><!-- /.navbar-collapse -->
			  </div>
			</nav>
		  </div>
		</nav>
		<div class="container v-container v-opacity">
			<div class="row">
</#macro>

<#macro sidebar activeName>
	<div class="col-md-3">
		<div class="list-group">
		  <a href="/set/index" class="list-group-item<#if activeName=="act"> active</#if>"><span class="glyphicon glyphicon-user"></span> 个人信息</a>
		  <a href="/set/avatar" class="list-group-item<#if activeName=="ava"> active</#if>"><span class="glyphicon glyphicon-picture"></span> 头像</a>
		  <a href="tag.html" class="list-group-item"><span class="glyphicon glyphicon-heart"></span> 爱好设置</a>
		  <a href="security.html" class="list-group-item"><span class="glyphicon glyphicon-lock"></span> 账号安全</a>
		  <a href="kindle.html" class="list-group-item"><span class="glyphicon glyphicon-tower"></span> 账号绑定</a>
		</div>
	</div>
</#macro>