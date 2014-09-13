<#import "vinery.ftl" as vinery />
<@vinery.header title="${(systemConfig.system_title)!} - ${(systemConfig.system_subtitle)!}" activeName="home"/>
<div class="col-md-9 v-block-2">
	<div class="v-space"></div>
	<#list rssList as rss>
		<#list rss.articles as article>
			<!-- 一篇文章 -->
			<div class="media">
			  <a class="pull-left" href="#">
				<img class="media-object" src="images/0.jpg" alt="...">
			  </a>
			  <div class="media-body">
				<h4 class="media-heading">${article.title}</h4>
				<div class="v-font-dark-grey">${article.content} <a href="${article.link}" target="_blank">${article.link}</a></div>
				<small class="v-font-grey"><div class="pull-left">${article.pubDate}</div><div class="pull-right"><span class="glyphicon glyphicon-thumbs-up"/> (8) | <span class="glyphicon glyphicon-star-empty"/> | 转发(100) | 评论(0)</div></small>
			  </div>
			</div>
			<div class="v-article-space"></div>
		</#list>
	</#list>
</div>

<div class="col-md-3 v-block-1">
<#if currentUser??>
	<div class="media">
	  <a class="pull-left v-row" href="#">
		<img class="media-object" src="images/0.jpg" alt="...">
	  </a>
	  <div class="media-body v-font-grey v-font-12 v-row">
		${(currentUser.maxim)!}
	  </div>
	</div>
	<div class="row v-row v-tag-row-line">
		<div class="col-md-12">
			<span class="label label-default">开发</span>
			<span class="label label-primary">设计</span>
			<span class="label label-success">数码</span>
			<span class="label label-info">足球</span>
			<span class="label label-warning">音乐</span>
		</div>
	</div>
	<div class="v-space"><div class="v-space-title"><a href="#">我关注的人</a></div></div>
	<div class="row v-row">
		<div class="col-md-3"><a href="#"><img src="images/0.jpg"/></a></div>
		<div class="col-md-3"><a href="#"><img src="images/1.jpg"/></a></div>
		<div class="col-md-3"><a href="#"><img src="images/2.jpg"/></a></div>
		<div class="col-md-3"><a href="#"><img src="images/3.jpg"/></a></div>
	</div>
	<div class="row v-row">
		<div class="col-md-3"><a href="#"><img src="images/0.jpg"/></a></div>
		<div class="col-md-3"><a href="#"><img src="images/1.jpg"/></a></div>
		<div class="col-md-3"><a href="#"><img src="images/2.jpg"/></a></div>
		<div class="col-md-3"><a href="#"><img src="images/3.jpg"/></a></div>
	</div>
	<div class="v-space"><div class="v-space-title"><a href="#">关注我的人</a></div></div>
	<div class="row v-row">
		<div class="col-md-3"><a href="#"><img src="images/0.jpg"/></a></div>
		<div class="col-md-3"><a href="#"><img src="images/1.jpg"/></a></div>
		<div class="col-md-3"><a href="#"><img src="images/2.jpg"/></a></div>
		<div class="col-md-3"><a href="#"><img src="images/3.jpg"/></a></div>
	</div>
	<div class="v-space"><div class="v-space-title"><a href="#">我订阅的Rss</a></div></div>
	<div class="row v-row">
		<div class="col-md-12">
			<a href="#">优酷网：http://www.youku.com/rss</a><br/>
			<a href="#">新浪网：http://www.sina.com.cn/rss</a><br/>
			<a href="#">开源日志：http://oslog.cn/rss</a><br/>
			<a href="#">网易：http://www.163.com/rss</a><br/>
			<a href="#">一五一十：http://www.1510.com/a/s...</a>
		</div>
	</div>
	<div class="v-space"><div class="v-space-title"><a href="#">历史推送记录</a></div></div>
	<div class="row v-row">
		<div class="col-md-12">
			<a href="#">2014年05月15日（5个站点，15篇文章）</a><br/>
			<a href="#">2014年05月15日（5个站点，15篇文章）</a><br/>
			<a href="#">2014年05月15日（5个站点，15篇文章）</a><br/>
			<a href="#">2014年05月15日（5个站点，15篇文章）</a><br/>
			<a href="#">2014年05月15日（5个站点，15篇文章）</a><br/>
			<a href="#">2014年05月15日（5个站点，15篇文章）</a><br/>
			<a href="#">2014年05月15日（5个站点，15篇文章）</a><br/>
			<a href="#">2014年05月15日（5个站点，15篇文章）</a><br/>
			<a href="#">2014年05月15日（5个站点，15篇文章）</a>
		</div>
	</div>
	<div>　</div>
<#else>
	<div class="v-space"><div class="v-space-title"><a href="#">活跃用户</a></div></div>
	<div class="row v-row">
		<div class="col-md-3"><a href="#"><img src="images/0.jpg"/></a></div>
		<div class="col-md-3"><a href="#"><img src="images/1.jpg"/></a></div>
		<div class="col-md-3"><a href="#"><img src="images/2.jpg"/></a></div>
		<div class="col-md-3"><a href="#"><img src="images/3.jpg"/></a></div>
	</div>
	<div>　</div>
</#if>
</div>
<#include "footer.ftl">