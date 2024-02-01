<%--<jsp:useBean id="message" scope="request" type="controller.IndexController"/>--%>
<%--<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org">--%>
<html>
<head>
    <meta charset="UTF-8">
    <title>Cars Table</title>
    <style>
        table {
            background-color: #d8da3d;
            table-layout: fixed;
            width: 25%;
            height: 25%;
            border: double 5px;
            border-collapse: collapse;
            padding: 5px;
        }

        th,
        td {
            padding: 10px;
            border: 2px solid;
        }
    </style>
</head>
<body>
<h1>message : ${message}</h1>
<h2>Hello World!</h2>
<div>
    <table>
        <tr>
            <th>Model</th>
            <th>Year</th>
            <th>Weight</th>
        </tr>
        <th:block th:each="user : ${users}">
            <tr>
                <td th:text="${}"></td>
                <td th:text="${user.getYear()}"></td>
                <td th:text="${user.getWeight()}"></td>
            </tr>
        </th:block>
    </table>
</div>
</body>
</html>
