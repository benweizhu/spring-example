<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="container">
    <div class="row">
        <div class="col-md-4"></div>
        <div class="col-md-4">
            <div>
                <h2>密码修改</h2>

                <form role="form" action="manage" method="post">
                    <div class="form-group">
                        <label for="exampleInputPassword1">原始密码</label>
                        <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
                    </div>
                    <div class="form-group">
                        <label for="exampleInputPassword2">新密码</label>
                        <input type="password" class="form-control" id="exampleInputPassword2" placeholder="Password">
                    </div>
                    <button type="submit" class="btn btn-default">确定</button>
                </form>
                <div>
                    <jsp:include page="${result}"/>
                </div>
            </div>
        </div>
        <div class="col-md-4"></div>
    </div>

</div>