package com.aqiang.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {

//    通过 http://localhost:8080/s1/hello?name=xxx 访问
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        if (name.equals("aqiang")){
            req.getSession().setAttribute("msg","我的名字是aqiang");
        }
        else if (name.equals("鲁迅")){
            req.getSession().setAttribute("msg","我的名字是鲁迅");
        }else {
            req.getSession().setAttribute("msg","我的名字只能是鲁迅或者aqiang");
        }
        req.getRequestDispatcher("/WEB-INF/jsp/hello.jsp").forward(req,resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
