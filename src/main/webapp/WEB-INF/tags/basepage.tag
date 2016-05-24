<%@tag description="Base Page template" pageEncoding="UTF-8"%>

<html>
  <head>
    <base href="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}"/>
    <title>Hibernate Sandbox</title>
    <link rel="stylesheet" href="/static/css/main.css">
  </head>
  <body>
    <div id="header">
      <h1>Hibernate Sandbox</h1>
    </div>
    <div id="body">
      <jsp:doBody/>
    </div>
  </body>
</html>
