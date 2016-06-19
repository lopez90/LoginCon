<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Dom
  Date: 18.06.2016
  Time: 20:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- Semantic-UI CSS & JS -->
<spring:url value="/webjars/Semantic-UI/2.1.8/semantic.min.css" var="SemanticCSS" />
<spring:url value="/webjars/Semantic-UI/2.1.8/semantic.min.js" var="SemanticJS" />

<!-- jQuery Library -->
<spring:url value="/webjars/jquery/2.1.4/jquery.min.js" var="jQuery" />
<spring:url value="/resources/js/jquery.serialize-object.min.js" var="jQuerySerialize" />

<script src="${jQuery}"></script>

<link href="${SemanticCSS}" rel="stylesheet" />
<script src="${SemanticJS}"></script>

<html>
<head>
    <title>Title</title>

    <script>
        $(document).ready(function(){

            $('.ui.form').on('submit', function(e){
                // ma przerwac domyslna akcje, w razie gdyby jakas mial zaimplementowana
                e.preventDefault();

                // operacja ajax'a....
                $.ajax({
                    // adres na ktory poslac, c:url opisany wczesniej
                    url: '<c:url value="/user/added2"/>',
                    // typ operacji, get, post, put, delete, whatever
                    type: "post",
                    // co ma przeslac, jak zauwazyles ja zrobilem sobie fajowa metodke ktora pakuje w jsona, jest czytelniej wtedy
                    data: formToJSON(),
                    // forma danych w jakiej bedziesz posylal, jak nie bedzie sie zgadzala z tym w controllerze (consumes) to wyjebie ci blad 415
                    dataType : "json",
                    // standardowy naglowek http
                    contentType: 'application/json; charset=utf-8',
                    // tryb async true,false,
                    // tutaj opisane: http://stackoverflow.com/questions/18366118/when-to-use-async-false-and-async-true-in-ajax-function-in-jquery
                    async: false,
                    // operacja zadeklarowana kiedy przejdzie poprawnie, u mnie alert z przeslana w wiadomoscia...
                    success : function(data){
                        alert(data.message)
                    },
                    // operacja jak sie z jakiegos powodu zjebie...
                    error : function(xhr, status){
                        console.log(status);
                    }
                })
            });

            // to chyba juz jasne...
            function formToJSON() {
                // funkcja stringify tworzy JSON'a z danych
                return JSON.stringify({
                    "name": $('.ui.form').form('get value', 'name'),
                    "password": $('.ui.form').form('get value', 'password'),
                    "email": $('.ui.form').form('get value', 'email')
                })
            }
        })
    </script>
</head>
<body>
<!-- Tutaj w porownaniu do standard style, NIE dopisujesz zadnej akcji, metody NIC!!, bo masz to okodowane w AJAX'ie...-->
<h1>TUTAJ JEST FORMULARZ GDZIE WYSYLASZ AJAXEM, CALY KOD W JS</h1>
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

<br><br><br>

</body>
</html>
