# Task Management Application

A simple web-based Task Management Application built using **Java (Servlet & JSP)**, **HTML**, and **CSS**.

## 🚀 Features
- Add a new task with title and description
- View added task on a simple UI
- Minimal design using plain HTML and CSS

## 🛠 Technologies Used
- Java Servlets & JSP
- HTML5 & CSS3
- Apache Tomcat (for deployment)
- Maven (for dependency management)

## 🗂 Project Structure
```
Task-Management-Application/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/taskapp/
│       │       ├── Task.java
│       │       └── TaskServlet.java
│       └── webapp/
│           ├── addTask.jsp
│           ├── index.jsp
│           ├── listTasks.jsp
│           ├── css/
│           │   └── styles.css
│           └── WEB-INF/
│               └── web.xml
```

## 📦 How to Run
1. Import the project into **Eclipse** or **IntelliJ IDEA** as a Maven project.
2. Deploy it on **Apache Tomcat Server**.
3. Access via: `http://localhost:8080/Task-Management-Application/`

## 📁 Pages
- `index.jsp`: Home page with navigation
- `addTask.jsp`: Form to add a new task
- `listTasks.jsp`: View submitted task

---

## 📌 Note
This version does not use a database. It simply displays submitted tasks temporarily using request forwarding. You can expand it to use MySQL or any relational DB.

## 👨‍💻 Author
Created with ❤️ for learning and demo purposes.

