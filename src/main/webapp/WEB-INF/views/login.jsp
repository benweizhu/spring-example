<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="container">
    <div class="row">
        <div class="col-md-4"></div>
        <div class="col-md-4">
            <form role="form" name='f' action='/spring-example/j_spring_security_check' method='POST'>
                <h1 class="form-signin-heading">SIBSHIP</h1>

                <div class="form-group">
                    <label for="exampleInputEmail">用户名</label>
                    <input type="text" id="exampleInputEmail" name='j_username' class="form-control"
                           placeholder="Email address" required
                           autofocus>
                </div>
                <div class="form-group">
                    <label for="exampleInputPassword">密码</label>
                    <input type="password" id="exampleInputPassword" name='j_password' class="form-control"
                           placeholder="Password" required>
                </div>
                <button class="btn btn-lg btn-default btn-block" type="submit">登录</button>
            </form>
        </div>
        <div class="col-md-4"></div>
    </div>
</div>
<!-- /container -->