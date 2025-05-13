package com.taskapp;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/addTask")
public class TaskServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String title = request.getParameter("title");
        String description = request.getParameter("description");

        request.setAttribute("title", title);
        request.setAttribute("description", description);

        RequestDispatcher dispatcher = request.getRequestDispatcher("listTasks.jsp");
        dispatcher.forward(request, response);
    }
}
