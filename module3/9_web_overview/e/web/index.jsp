
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <style>
      label{
        width: 150px;
        display: inline-block;
      }
    </style>
  </head>
  <body>
  <form method="get" action="/calculate">
  <div>
    <label>Product Description:</label>  <input name="des">
  </div>
  <div>
    <label>List Price:</label> <input name="price">
  </div>
  <div>
    <label>Discount Percent:</label> <input name="discount">
  </div>
  <button>Calculate</button>
  </form>
  </body>
</html>
