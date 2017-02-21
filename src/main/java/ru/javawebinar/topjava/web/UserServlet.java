package ru.javawebinar.topjava.web;

import ru.javawebinar.topjava.LoggerWrapper;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by mega
 */
public class UserServlet extends HttpServlet {
private static final LoggerWrapper LOG = LoggerWrapper.get(UserServlet.class);

@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.getRequestDispatcher("/userList.jsp").forward(request, response);
        LOG.debug("redirect to userList.jsp");
        response.sendRedirect("userList.jsp");
    }
}
