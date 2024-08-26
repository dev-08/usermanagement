package com.servletdemo.usermgmt;


import com.servletdemo.usermgmt.Service.UserService;
import com.servletdemo.usermgmt.User.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;


public class Home extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String email = req.getParameter("email");
        String mobileNumber = req.getParameter("mobileNumber");
        String date = req.getParameter("date");
        String gender  = req.getParameter("gender");

        System.out.println(username);
        System.out.println(email);
        System.out.println(mobileNumber);
        System.out.println(date);
        System.out.println(gender);

        User user = new User(username, email, mobileNumber, date, gender);

        UserService userService = new UserService();

        userService.addUserdb(user);


    }


}
