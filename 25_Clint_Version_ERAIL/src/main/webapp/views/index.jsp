<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <form action="bookticket" method="post">
  <table>

		<tr>

			<td>Fname:</td>
			<td ><input type="text" name="fname"></td>
		</tr>
		<tr>

			<td>from:</td>
			<td ><input type="text" name="from"></td>
		</tr>
		<tr>

			<td>to:</td>
			<td> <input type="text" name="to"></td>
		</tr>
		
		<tr>

			<td>doj:</td>
			<td ><input type="text" name="doj"></td>
		</tr>
		
		 <tr>
            <td colspan="2" align="center">
                <input type="submit" value="Book Ticket">
            </td>
        </tr>
	</table>
  </form>
	
</body>
</html>