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

<!-- Tutaj deklaracje sciezek do bibliotek,
mozesz to tez zrobic jak ja w inż, wrzucac wszystko w jeden *.jspf i pozniej includowac jedna linijka, patrz tutaj:
https://bitbucket.org/andrew92/internet-based-photo-album/src/841c8e75c038cbb6f156e5fe2c1134b9c4204b60/src/main/webapp/WEB-INF/jsp/libraries.jspf?at=master&fileviewer=file-view-default
oraz include w ten sposob jak w moich plikach jsp w inż lub opisane tutaj: http://stackoverflow.com/questions/9110148/include-another-jsp-file
W razie niejasnosci pisz, nie kombinuj na sile, szkoda czasu...
-->
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
</head>
<body>

<h1>TUTAJ JEST FORMULARZ GDZIE WYSYLASZ DRUGIM SPOSOBEM, KODEM</h1>
<!-- Tutaj formularz, prosty jak budowa cepu, podstawowa wersja, dodajesz action czyli gdzie ma poslac, i metode.. wszystko..
c:url oznacza ze sciezka wzgledem tej w ktorej sie znajdujesz, czyli w tym przypadku np. realnie ona bedzie wygladala tak:
/LoginCon-1.0-SNAPSHOT/user/addedStandard -->
<form class="ui form" action='<c:url value="/user/addedStandard"/>' method="post">
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

</body>
</html>
