<#import "vinery.ftl" as vinery />
<@vinery.header title="葡萄园" activeName="set"/>
<@vinery.sidebar activeName="act"/>
<div class="col-md-9 v-block-2">
	<div class="row">
		<div class="col-md-12">
			<div class="v-space-bottom-line">请输入个人信息：</div>
		</div>
	</div>
	<div class="row">
		<div class="col-md-4">
			<form class="form-signin" role="form" action="/set/account/edit" method="post">
				<@vinery.bind obj=accountForm! path="accountForm.nickName" separator="<br/>"/>
				<div class="input-group v-margin5">
				  <span class="input-group-addon">昵称</span>
				  <input type="text" class="form-control" name="nickName" placeholder="昵称" value="${(currentUser.nickName)!}" maxlength="20" required autofocus>
				  <span class="input-group-addon">*</span>
				</div>
				<@vinery.bind obj=accountForm! path="accountForm.email" separator="<br/>"/>
				<div class="input-group v-margin5">
				  <span class="input-group-addon">邮箱</span>
				  <input type="text" class="form-control" placeholder="邮箱地址" value="${(currentUser.email)!}" name="email" maxlength="100" placeholder="登录邮箱" required>
				  <span class="input-group-addon">*</span>
				</div>
				<@vinery.bind obj=accountForm! path="accountForm.phone" separator="<br/>"/>
				<div class="input-group v-margin5">
				  <span class="input-group-addon">手机</span>
				  <input type="text" class="form-control" value="${(currentUser.phone)!}" name="phone" placeholder="手机号码" maxlength="11">
				</div>
				<@vinery.message code=infoMsg! /><@vinery.message code=errorMsg! />
				<div class="v-center v-margin5">
					<button type="submit" class="btn btn-primary btn-sm v-margin5">保存</button>
					<button type="button" class="btn btn-primary btn-sm v-margin5">取消</button>
				</div>
			</form>
		</div>
	</div>
</div>
<#include "footer.ftl">