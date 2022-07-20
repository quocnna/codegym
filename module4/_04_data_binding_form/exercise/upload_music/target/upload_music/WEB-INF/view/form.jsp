<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="save" novalidate="novalidate" enctype="multipart/form-data">
    <div>
        Name: <input type="text" name="name">
    </div>

    <div>
        artist: <input type="text" name="artist">
    </div>

    <div>
        genre: <input type="text" name="genre">
    </div>

    <div>
        link: <input type="text" name="link">
    </div>

    <button>Create</button>
</form>
</body>
</html>
