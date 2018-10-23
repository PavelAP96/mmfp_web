<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User List</title>
</head>
<body>
<h1>Users List</h1>
<br>
<table>
    <tr>
       <th>ID</th>
       <th>NAME</th>
       <th>EMAIL</th>
       <th>AGE</th>
    </tr>
    <#list users as user>
        <tr>
            <td><a href="/user/${user.id}">${user.id}</a></td>
            <td>${user.name}</td>
            <td>${user.email}</td>
            <td>${user.age}</td>
        </tr>
    </#list>
</table>
<a href="/addUser">New</a>
</body>
</html>