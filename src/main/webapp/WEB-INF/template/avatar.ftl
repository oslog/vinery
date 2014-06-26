<#import "vinery.ftl" as vinery />
<@vinery.header title="葡萄园" activeName="set"/>
<@vinery.sidebar activeName="act"/>

<script type="text/javascript" src="/js/swfobject.js"></script>
<script type="text/javascript" src="/js/fullAvatarEditor.js"></script>

<div class="col-md-9 v-block-2">
	<div class="row">
		<div class="col-md-12">
			<div class="v-space-bottom-line">请输入个人信息：</div>
		</div>
	</div>
	<div class="row">
		<div class="col-md-4">
			<div id="swfContainer">
			本组件需要安装Flash Player后才可使用，请从<a href="http://www.adobe.com/go/getflashplayer">这里</a> 下载安装。
			</div>
			<button type="button" id="upload">自定义上传按钮</button>
		</div>
	</div>
</div>

<script type="text/javascript">
            swfobject.addDomLoadEvent(function () {
                var swf = new fullAvatarEditor("swfContainer", {
                        id: 'swf',
                        upload_url: '/set/avatar/upload',
                        src_url: "/images/0.jpg",
                        src_upload:2
                    }, function (msg) {
                        switch(msg.code)
                        {
                            case 1 : alert("页面成功加载了组件！");break;
                            case 2 : alert("已成功加载默认指定的图片到编辑面板。");break;
                            case 3 :
                                if(msg.type == 0)
                                {
                                    alert("摄像头已准备就绪且用户已允许使用。");
                                }
                                else if(msg.type == 1)
                                {
                                    alert("摄像头已准备就绪但用户未允许使用！");
                                }
                                else
                                {
                                    alert("摄像头被占用！");
                                }
                            break;
                            case 5 : 
                                if(msg.type == 0)
                                {
                                    if(msg.content.sourceUrl)
                                    {
                                        alert("原图片已成功保存至服务器，url为：\n" +　msg.content.sourceUrl);
                                    }
                                    alert("头像已成功保存至服务器，url为：\n" + msg.content.avatarUrls.join("\n"));
                                }
                            break;
                        }
                    }
                );
                document.getElementById("upload").onclick=function(){
                    swf.call("upload");
                };
            });
        </script>
<#include "footer.ftl">