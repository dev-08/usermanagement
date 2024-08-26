package com.servletdemo.usermgmt.Service;

import com.servletdemo.usermgmt.User.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {

        List<User> users = new ArrayList<>();




        public User addUserdb(User user){


            System.out.println("In the userService Class"+user.getUsername());

//
            return user;

        }


}
