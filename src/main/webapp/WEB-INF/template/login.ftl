<#include "header.ftl">

	<div class="col-md-4"></div>
	<div class="col-md-4">
      <form class="form-signin" role="form" action="enter" method="post">
        <h2 class="form-signin-heading">请登录</h2>
        <input type="text" class="form-control" placeholder="邮件地址" name="email" required autofocus>
        <input type="password" class="form-control" placeholder="密码" name="password" required>
        <label class="checkbox">
          <input type="checkbox" value="remember-me"> 记住我
        </label>
        <button class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
      </form>
	</div>
﻿<#include "footer.ftl">