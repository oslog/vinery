<!DOCTYPE html>
<html lang="cn">
  <head>
    <title>葡萄园</title>
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

			<#assign activeName="home">
			<#import "navbar.ftl" as nav />
			<@nav.show activeName=activeName/>
	  </div>
	</nav>
	<div class="container v-container v-opacity">
		<div class="row">