<!doctype html>
<html>
<head>
    <meta name="layout" content="quote"/>
    <title>Random Quote</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<body>
    <div id="menu">
        <g:link controller="quote" action="random">Next</g:link>
    </div>
    <div id="quote">
        <p>${quote.author}</p>
        <q>${quote.content}</q>
    </div>

</body>
</html>
