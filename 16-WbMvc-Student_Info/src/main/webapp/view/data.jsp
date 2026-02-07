<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Students</title>

<style>
    body {
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        background: linear-gradient(135deg, #e3f2fd, #bbdefb);
        margin: 0;
        padding: 0;
    }

    h2 {
        text-align: center;
        color: #0d47a1;
        margin-top: 40px;
    }

    a {
        display: inline-block;
        margin: 20px auto;
        text-decoration: none;
        color: white;
        background-color: #1e88e5;
        padding: 10px 20px;
        border-radius: 8px;
        transition: 0.3s;
        font-weight: bold;
    }

    a:hover {
        background-color: #1565c0;
    }

    .container {
        width: 90%;
        max-width: 900px;
        margin: 30px auto;
        background-color: white;
        padding: 20px;
        border-radius: 15px;
        box-shadow: 0 4px 20px rgba(0, 0, 0, 0.15);
        overflow-x: auto;
        animation: fadeIn 0.8s ease-in-out;
    }

    @keyframes fadeIn {
        from { opacity: 0; transform: translateY(10px); }
        to { opacity: 1; transform: translateY(0); }
    }

    table {
        width: 100%;
        border-collapse: collapse;
        text-align: center;
    }

    th, td {
        padding: 12px;
        border-bottom: 1px solid #ddd;
    }

    th {
        background-color: #1e88e5;
        color: white;
    }

    tr:hover {
        background-color: #f1f8ff;
    }

    td {
        color: #333;
    }

    .top-bar {
        display: flex;
        justify-content: space-between;
        align-items: center;
        width: 90%;
        max-width: 900px;
        margin: 20px auto 0;
    }
</style>

</head>
<body>

    <div class="top-bar">
        <h2>View Student Details</h2>
        <a href="/">+ Add New Student</a>
    </div>

    <div class="container">
        <table>
            <thead>
                <tr>
                    <th>S.No</th>
                    <th>Name</th>
                    <th>Email</th>
                    <th>Gender</th>
                    <th>Course</th>
                    <th>Timings</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${student}" var="student" varStatus="index">
                    <tr>
                        <td>${index.count}</td>
                        <td>${student.name}</td>
                        <td>${student.email}</td>
                        <td>${student.gender}</td>
                        <td>${student.course}</td>
                        <td>${student.timings}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>

</body>
</html>
