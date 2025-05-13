<!DOCTYPE html>
<html>
<head>
    <title>Add Task</title>
    <link rel="stylesheet" href="css/styles.css">
</head>
<body>
    <h2>Add New Task</h2>
    <form method="post" action="addTask">
        <label>Title:</label><br>
        <input type="text" name="title" required><br><br>
        <label>Description:</label><br>
        <textarea name="description" required></textarea><br><br>
        <button type="submit">Add Task</button>
    </form>
</body>
</html>
