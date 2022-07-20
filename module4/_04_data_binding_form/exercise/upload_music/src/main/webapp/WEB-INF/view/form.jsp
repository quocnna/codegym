<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>private String name;
private String artist;
private String genre;
private String link;
<form method="post" action="create" enctype="multipart/form-data">
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
        link: <input type="file" name="file">
    </div>
    <button>Create</button>
</form>
</body>
</html>
