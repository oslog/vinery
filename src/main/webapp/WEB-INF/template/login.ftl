<#import "vinery.ftl" as vinery />
<@vinery.header title="葡萄园" activeName="home"/>
	<div class="col-md-6"><@vinery.message code=errorMsg! /></div>
	<div class="col-md-4">
      <form class="form-signin" role="form" action="/login/enter" method="post">
        <h2 class="form-signin-heading">请登录</h2>
        <input type="text" class="form-control" placeholder="邮箱地址" name="email" value="${(userForm.email)!}" maxlength="100" required autofocus>
        <@vinery.bind obj=userForm! path="userForm.email" separator="<br/>"/>
        <br/>
        <input type="password" class="form-control" placeholder="密码" name="password" maxlength="16" required>
        <@vinery.bind obj=userForm! path="userForm.password" separator="<br/>"/>
        <label class="checkbox">
          <input type="checkbox" value="remember-me"> 记住我
        </label>
        <button class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
      </form>
	</div>
﻿<#include "footer.ftl">