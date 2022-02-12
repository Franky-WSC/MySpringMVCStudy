package com.cetc28.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Auther: WSC
 * @version: 1.0
 */
@WebServlet("/myServlet.do")
public class MyServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //请求转发, 跳转至first.jsp文件
        req.getRequestDispatcher("first.jsp").forward(req,resp);
    }
}
