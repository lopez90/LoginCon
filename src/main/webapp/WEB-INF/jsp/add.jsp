<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Dom
  Date: 18.06.2016
  Time: 20:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel='stylesheet' href='/webjars/Semantic-UI/2.1.8/semantic.min.css'>
<script src = '/webjars/jquery/2.1.4/jquery.js'></script>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form class="ui form">
    <div class="field">
        <label>Name</label>
        <input name="name" placeholder="Name" type="text">
    </div>
    <div class="field">
        <label>Password</label>
        <input name="password" placeholder="Password" type="text">
    </div>
    <div class="field">
        <label>Email</label>
        <input name="email" placeholder="Email" type="text">
    </div>
    </div>
    <button class="ui button" type="submit">Submit</button>
</form>

<script>
    $('.ui.form').on('submit', function(e){
        e.preventDefault();
        $.ajax({
            url: '<c:url value="/user/added"/>',
            type: "post",
            data: formToJSON(),
            dataType : "json",
            contentType: 'application/json; charset=utf-8',
            async: false,
            success : function(data){
                if(data.message == "success") {
                    location.replace("<c:url value="/user/add"/>");
                }
            },
            error : function(xhr, status){
                console.log(status);
            }
        })
    });

    function formToJSON() {
        return JSON.stringify({
            "name": $('.ui.form').form('get value', 'name'),
            "password": $('.ui.form').form('get value', 'password'),
            "email": $('.ui.form').form('get value', 'email')
        })
    }
</script>

</body>
</html>
