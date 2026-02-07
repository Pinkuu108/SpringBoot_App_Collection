<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="from" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration Form</title>

<style>
    body {
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        background: linear-gradient(135deg, #e3f2fd, #bbdefb);
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
        margin: 0;
    }

    h3 {
        text-align: center;
        color: #0d47a1;
        margin-bottom: 20px;
    }

    form {
        background-color: white;
        padding: 30px 40px;
        border-radius: 15px;
        box-shadow: 0 4px 20px rgba(0, 0, 0, 0.15);
        width: 400px;
        transition: 0.3s ease-in-out;
    }

    form:hover {
        transform: scale(1.02);
    }

    table {
        width: 100%;
    }

    td {
        padding: 10px;
        color: #333;
    }

    input[type="text"],
    input[type="email"],
    select {
        width: 100%;
        padding: 8px;
        border: 1px solid #90caf9;
        border-radius: 8px;
        outline: none;
        transition: 0.2s;
    }

    input[type="text"]:focus,
    input[type="email"]:focus,
    select:focus {
        border-color: #1e88e5;
        box-shadow: 0 0 5px rgba(30, 136, 229, 0.3);
    }

    input[type="radio"],
    input[type="checkbox"] {
        accent-color: #1e88e5;
    }

    input[type="submit"] {
        background-color: #1e88e5;
        color: white;
        border: none;
        padding: 10px 15px;
        border-radius: 8px;
        cursor: pointer;
        width: 100%;
        font-weight: bold;
        transition: 0.2s;
    }

    input[type="submit"]:hover {
        background-color: #1565c0;
    }

    a {
        display: block;
        text-align: center;
        margin-top: 15px;
        text-decoration: none;
        color: #1e88e5;
        font-weight: bold;
    }

    a:hover {
        text-decoration: underline;
    }

    font {
        display: block;
        text-align: center;
        margin-bottom: 10px;
        font-weight: bold;
        color: green;
    }
</style>
</head>

<body>
    <div>
        <h3>Student Registration Form</h3>
        <font color="green">${msg}</font>
        <from:form action="save" modelAttribute="student" method="POST">
            <table>
                <tr>
                    <td>Name:</td>
                    <td><from:input path="name"/></td>
                </tr>
                <tr>
                    <td>Email:</td>
                    <td><from:input path="email"/></td>
                </tr>
                <tr>
                    <td>Gender:</td>
                    <td>
                        <from:radiobutton path="gender" value="male"/> Male
                        <from:radiobutton path="gender" value="female"/> Female
                    </td>
                </tr>
                <tr>
                    <td>Course:</td>
                    <td>
                        <from:select path="course">
                            <from:option value="">-Select-</from:option>
                            <from:options items="${course}"/>
                        </from:select>
                    </td>
                </tr>
                <tr>
                    <td>Timings:</td>
                    <td>
                        <from:checkboxes items="${timings}" path="timings"/>
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Save"/></td>
                </tr>
            </table>
        </from:form>

        <a href="viewStudents">View Student</a>
    </div>
</body>
</html>
