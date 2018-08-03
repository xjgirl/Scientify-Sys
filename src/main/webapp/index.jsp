<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/3
  Time: 22:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>梧州学院视频大数据处理实验室</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport"
          content="width=device-width, initial-scale=1">
    <meta name="format-detection" content="telephone=no">
    <meta name="renderer" content="webkit">
    <meta http-equiv="Cache-Control" content="no-siteapp"/>

    <link rel="stylesheet" href="css/amazeui.min.css"/>
    <style>
        .get {
            background: #1E5B94;
            color: #fff;
            text-align: center;
            padding: 100px 0;
        }

        .get-title {
            font-size: 200%;
            border: 2px solid #fff;
            padding: 20px;
            display: inline-block;
        }

        .get-btn {
            background: #fff;
        }

        .detail {
            background: #fff;
        }

        .detail-h2 {
            text-align: center;
            font-size: 150%;
            margin: 40px 0;
        }

        .detail-h3 {
            color: #1f8dd6;
        }

        .detail-p {
            color: #7f8c8d;
        }

        .detail-mb {
            margin-bottom: 30px;
        }

        .hope {
            background: #0bb59b;
            padding: 50px 0;
        }

        .hope-img {
            text-align: center;
        }

        .hope-hr {
            border-color: #149C88;
        }

        .hope-title {
            font-size: 140%;
        }

        .about {
            background: #fff;
            padding: 40px 0;
            color: #7f8c8d;
        }

        .about-color {
            color: #34495e;
        }

        .about-title {
            font-size: 180%;
            padding: 30px 0 50px 0;
            text-align: center;
        }

        .footer p {
            color: #7f8c8d;
            margin: 0;
            padding: 15px 0;
            text-align: center;
            background: #2d3e50;
        }
    </style>
</head>
<body>
<header class="am-topbar am-topbar-fixed-top">
    <div class="am-container">
        <h1 class="am-topbar-brand">
            <a href="#">梧州学院视频大数据处理实验室</a>
        </h1>
        <button class="am-topbar-btn am-topbar-toggle am-btn am-btn-sm am-btn-secondary am-show-sm-only"
                data-am-collapse="{target: '#collapse-head'}"><span class="am-sr-only">导航切换</span> <span
                class="am-icon-bars"></span></button>
        <div class="am-collapse am-topbar-collapse" id="collapse-head">
            <ul class="am-nav am-nav-pills am-topbar-nav">
                <li class="am-active"><a href="#about">首页</a></li>
                <li><a href="#teacher">师资队伍</a></li>
                <li><a href="#team">学生工作</a></li>
                <li class="am-dropdown" data-am-dropdown>
                    <a class="am-dropdown-toggle" data-am-dropdown-toggle href="javascript:;">
                        平台概况 <span class="am-icon-caret-down"></span>
                    </a>
                    <ul class="am-dropdown-content">
                        <li class="am-dropdown-header">平台概况简介</li>
                        <li><a href="#">科研项目</a></li>
                        <li><a href="#">重要论文</a></li>
                        <li><a href="#">科研获奖</a></li>
                        <li><a href="#">学术活动</a></li>
                    </ul>
                </li>
            </ul>
            <div class="am-topbar-right">
                <a class="am-btn am-btn-secondary am-topbar-btn am-btn-sm" href="register.html"><span class="am-icon-pencil"></span> 注册</a>
            </div>
            <div class="am-topbar-right">
                <a class="am-btn am-btn-primary am-topbar-btn am-btn-sm" href="login.jsp"><span class="am-icon-user"></span> 登录</a>
            </div>
        </div>
    </div>
</header>
<div class="am-slider am-slider-default" data-am-flexslider id="demo-slider-0"  id="about">
    <ul class="am-slides">
        <li><img src="img/001.jpg" /></li>
        <li><img src="img/003.jpg" /></li>
        <li><img src="img/004.jpg" /></li>
        <li><img src="img/005.jpg" /></li>
    </ul>
</div>
<div class="detail" id="teacher">
    <div class="am-g am-container">
        <div class="am-u-lg-12">
            <h2 class="detail-h2">梧州学院视频大数据处理实验室 期待你的加入！</h2>
            <div class="am-g">
                <div class="am-u-lg-3 am-u-md-6 am-u-sm-12 detail-mb">
                    <h3 class="detail-h3">
                        <i class="am-icon-user am-icon-sm"></i>
                        教师1
                    </h3>
                    <p class="detail-p">
                        占位
                    </p>
                </div>
                <div class="am-u-lg-3 am-u-md-6 am-u-sm-12 detail-mb">
                    <h3 class="detail-h3">
                        <i class="am-icon-user am-icon-sm"></i>
                        教师2
                    </h3>
                    <p class="detail-p">
                        占位
                    </p>
                </div>
                <div class="am-u-lg-3 am-u-md-6 am-u-sm-12 detail-mb">
                    <h3 class="detail-h3">
                        <i class="am-icon-user am-icon-sm"></i>
                        教师3
                    </h3>

                    <p class="detail-p">
                        占位
                    </p>
                </div>
                <div class="am-u-lg-3 am-u-md-6 am-u-sm-12 detail-mb">
                    <h3 class="detail-h3">
                        <i class="am-icon-user am-icon-sm"></i>
                        教师4
                    </h3>
                    <p class="detail-p">
                        占位
                    </p>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="hope" id="team">
    <div class="am-g am-container">
        <div class="am-u-lg-4 am-u-md-6 am-u-sm-12 hope-img">
            <img src="assets/i/examples/landing.png" alt="" data-am-scrollspy="{animation:'slide-left', repeat: false}">
            <hr class="am-article-divider am-show-sm-only hope-hr">
        </div>
        <div class="am-u-lg-8 am-u-md-6 am-u-sm-12">
            <h2 class="hope-title">同我们一起学习！</h2>

            <p>
                占位
            </p>
        </div>
    </div>
</div>

<div class="about">
    <div class="am-g am-container">
        <div class="am-u-lg-12">
            <h2 class="about-title about-color">梧州学院视频大数据处理实验室，非常欢迎大家的参与</h2>
            <div class="am-g">
                <div class="am-u-lg-6 am-u-md-4 am-u-sm-12">
                    <form class="am-form">
                        <label for="name" class="about-color">你的姓名</label>
                        <input id="name" type="text">
                        <br/>
                        <label for="email" class="about-color">你的邮箱</label>
                        <input id="email" type="email">
                        <br/>
                        <label for="message" class="about-color">你的留言</label>
                        <textarea id="message"></textarea>
                        <br/>
                        <button type="submit" class="am-btn am-btn-primary am-btn-sm"><i class="am-icon-check"></i> 提 交</button>
                    </form>
                    <hr class="am-article-divider am-show-sm-only">
                </div>
                <div class="am-u-lg-6 am-u-md-8 am-u-sm-12">
                    <h4 class="about-color">关于我们</h4>
                    <p>
                        占位
                    </p>
                    <h4 class="about-color">平台介绍</h4>
                    <p>
                        占位
                    </p>
                </div>
            </div>
        </div>
    </div>
</div>
<footer class="footer">
    <p>© 2018 by the Graduate-design Team from Software Engineering .</p>
</footer>
<!--[if lt IE 9]>
<script src="http://libs.baidu.com/jquery/1.11.1/jquery.min.js"></script>
<script src="http://cdn.staticfile.org/modernizr/2.8.3/modernizr.js"></script>
<script src="assets/js/amazeui.ie8polyfill.min.js"></script>
<![endif]-->
<!--[if (gte IE 9)|!(IE)]><!-->
<script src="js/jquery-3.3.1.min.js"></script>
<script src="js/amazeui.min.js"></script>
</body>
</html>
