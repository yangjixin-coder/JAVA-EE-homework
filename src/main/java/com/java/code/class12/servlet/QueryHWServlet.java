package com.java.code.class12.servlet;

import com.java.code.class12.jdbc.StudentHomeworkJdbc;
import com.java.code.class12.model.submitHWModel;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
//学生作业展示
@WebServlet("/list")
public class QueryHWServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<submitHWModel> list = StudentHomeworkJdbc.selectAll();

        req.setAttribute("list", list);

        req.getRequestDispatcher("QueryHW.jsp").forward(req, resp);
    }
}