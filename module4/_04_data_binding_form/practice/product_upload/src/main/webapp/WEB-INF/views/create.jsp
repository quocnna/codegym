<!DOCTYPE html>

<body>
<h3>Add Product</h3>

<div id="form">
    <form action="/product/save"
          method="POST" novalidate="novalidate" enctype="multipart/form-data">
        <input type="hidden" name="id" value="1"/>
        <div>
            <label>Name</label>
            <input type="text" name="name"/>
        </div>
        <div>
            <label>Description</label>
            <input type="text" name="description"/>
        </div>
        <div>
            <label>Image</label>
            <input type="file" name="image"/>
        </div>
        <input type="submit" value="Save"/>
    </form>
</div>

</body>
</html>