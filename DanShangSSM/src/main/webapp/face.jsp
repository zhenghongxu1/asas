<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%-- <%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%> --%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%-- <base href="<%=basePath%>"> --%>

<title>管理员登录</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<link rel="stylesheet" type="text/css" href="css/face.css" />
<script type="text/javascript" src="js/jquery-1.4.4.min.js"></script>
<style>
body {
	height: 100%;
	background: #213838;
	overflow: hidden;
}

canvas {
	z-index: -1;
	position: absolute;
}
</style>
<script src="js/jquery.js"></script>
<script src="js/verificationNumbers.js"></script>
<script src="js/Particleground.js"></script>
<script>
$(document).ready(function() {
  //粒子背景特效
  $('body').particleground({
    dotColor: '#5cbdaa',
    lineColor: '#5cbdaa'
  });
  //验证码
  createCode();
  //测试提交，对接程序删除即可
  $(".submit_btn").click(function(){
	  localhost.href="index.jsp";
	  });
});
</script>


<style type="text/css">
* {
	margin: 0;
	padding: 0;
}

body {
	height: 100vh;
	background-position: center;
	overflow: hidden;
}

h1 {
	color: #fff;
	text-align: center;
	font-weight: 100;
	margin-top: 40px;
}

#media {
	width: 280px;
	height: 250px;
	margin: 10px auto 0;
	border-radius: 30px;
	overflow: hidden;
	opacity: 0.7px;
}

#video {
	
}

#canvas {
	display: none;
}

#btn {
	width: 160px;
	height: 50px;
	background: #03a9f4;
	margin: 70px auto 0;
	text-align: center;
	line-height: 50px;
	color: #fff;
	border-radius: 40px;
}
</style>
</head>
<body>
	<form action="${pageContext.request.contextPath}/facelogin.action"
		method="get">
		<dl class="admin_login" style="height: 500px;">
			<dt>
				<strong>登录</strong><em>Management System</em> <strong>请把你的脸放摄像头面前</strong>
			</dt>
			<div id="media">
				<video id="video" width="530" height="300" autoplay></video>
				<canvas id="canvas" width="400" height="300"></canvas>
			</div>
			<dd>
				<input type="button" onclick="query()" value="立即登录" class="submit_btn" />
			</dd>
			<dd style="margin-top:20px ">
				<input type="button" onclick="register()" value="立即注册" class="submit_btn" />
			</dd>
			<dd >
				<span class="submit_btn"   id="tishi" >登录验证中... </span>
			</dd>
		</dl>
		<script type="text/javascript" src="js/jquery-3.1.1.min.js"></script>
		<script type="text/javascript">
  		//var 是定义变量
  		var video = document.getElementById("video"); //获取video标签
  		var context = canvas.getContext("2d");
  		var con  ={
  			audio:false,
  			video:{
  			width:1980,
  			height:1024,
  			}
  		};	
  			//导航 获取用户媒体对象
  			navigator.mediaDevices.getUserMedia(con)
  			.then(function(stream){
  				video.src = window.URL.createObjectURL(stream);
  				video.onloadmetadate = function(e){
  					video.play();
  				}
  			});
  			function query(){
  				//把流媒体数据画到convas画布上去
  				context.drawImage(video,0,0,400,300);
  				var base = getBase64();
  				$.ajax({
  					type:"post",
  					url:"facelogin",
  					data:{"base":base},
  					success:function(data){
  						if(data=="223114"){
  							alert("人脸模糊请重新登陆！");
  						}else if(data=="1"){
  							alert("登陆成功！");
  						}else if(data=="2"){
  							alert("账户不存在，请重新登陆！");
  						}else{
  							alert("狗脸放好");
  						}
							}
						});
			}
  			
  			
  			
  			
  			
  			
  			
  			function register(){
  				//把流媒体数据画到convas画布上去
  				context.drawImage(video,0,0,400,300);
  				var base = getBase64();
  				$.ajax({
  					type:"post",
  					url:"faceregister",
  					data:{"base":base},
  					success:function(data){
  						if(data=="1"){
  							alert("注册成功！");
  						}
						);
			}
			function getBase64() {
				var imgSrc = document.getElementById("canvas").toDataURL("image/png");
				return imgSrc.split("base64,")[1];
			};
		</script>
	</form>
</body>
</html>
