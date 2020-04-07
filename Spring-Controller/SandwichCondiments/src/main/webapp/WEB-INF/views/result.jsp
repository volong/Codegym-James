<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 4/5/2020
  Time: 9:09 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sandwich</title>
    <style>
        body {
            width: 500px;
            margin: auto;
        }
        table{
            width: 700px;
            margin: auto;
        }
        table{
            width: 90%;
            margin: auto;
        }
    </style>
</head>
<body>
<a href="/home">Back to choose sandwich</a>

<fieldset>
    <legend><h1>Sandwich</h1></legend>
    <table>
        <tr>
            <td colspan="4"><h2>Condiments with</h2></td>
        </tr>
        <tr>
            <td>${sandwich[0]}</td>
            <td>${sandwich[1]}</td>
            <td>${sandwich[2]}</td>
            <td>${sandwich[3]}</td>
        </tr>
    </table>
</fieldset>
</body>
</html>