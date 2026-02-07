<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Form</title>
<h1>${rabi}</h1>
<style>
    body {
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        background: linear-gradient(135deg, #74b9ff, #a29bfe);
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
        margin: 0;
    }

    form {
        background: white;
        padding: 30px 40px;
        border-radius: 15px;
        box-shadow: 0 8px 20px rgba(0, 0, 0, 0.2);
        width: 350px;
        animation: fadeIn 0.8s ease;
    }

    table {
        width: 100%;
    }

    td {
        padding: 10px 5px;
        color: #2d3436;
        font-size: 16px;
    }

    input[type="text"],
    input[type="email"],
    input[type="number"] {
        width: 100%;
        padding: 10px;
        border: 1px solid #dfe6e9;
        border-radius: 8px;
        font-size: 15px;
        transition: 0.3s;
    }

    input[type="text"]:focus,
    input[type="email"]:focus,
    input[type="number"]:focus {
        border-color: #0984e3;
        outline: none;
        box-shadow: 0 0 5px rgba(9, 132, 227, 0.4);
    }

    input[type="submit"] {
        background-color: #0984e3;
        color: white;
        border: none;
        padding: 10px 20px;
        border-radius: 8px;
        font-size: 16px;
        cursor: pointer;
        width: 100%;
        transition: 0.3s;
    }

    input[type="submit"]:hover {
        background-color: #74b9ff;
        transform: translateY(-2px);
    }

    h2 {
        text-align: center;
        color: #2d3436;
        margin-bottom: 20px;
    }

    @keyframes fadeIn {
        from { opacity: 0; transform: translateY(-10px); }
        to { opacity: 1; transform: translateY(0); }
    }
</style>
</head>
<body>

<form action="user" method="POST">
    <h2>💬 User Registration</h2>
    <table>
        <tr>
            <td>Name:</td>
            <td><input type="text" name="name" required/></td>
        </tr>
        
        <tr>
            <td>Email:</td>
            <td><input type="email" name="email" required/></td>
        </tr>
        
        <tr>
            <td>Phno:</td>
            <td><input type="number" name="phno" required/></td>
        </tr>
        
        <tr>
            <td></td>
            <td><input type="submit" name="submit" value="Submit"/></td>
        </tr>
    </table>
</form>

</body>
</html>
