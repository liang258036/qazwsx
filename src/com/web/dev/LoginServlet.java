package com.web.dev;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/**
 * @author Administrator
 */
@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //解决乱码
        req.setCharacterEncoding("UTF-8");
       String username = req.getParameter("username");
       String password = req.getParameter("password");
        //System.out.println(username+password);
        req.setAttribute("username",username);//将用户名粗如request
        req.setAttribute("password",password);
        //服务端跳转，URI地址不变
        req.getRequestDispatcher("index.jsp").forward(req,resp);
        //获取session对象
        //HttpSession session=req.getSession();
    }
}
