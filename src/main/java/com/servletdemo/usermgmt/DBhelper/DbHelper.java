package com.servletdemo.usermgmt.DBhelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {


    static   String url = "jdbc:mysql://localhost:3306/usermanagement";
    static   String user = "root";
    static   String password = "root123";





    public static Connection connect() throws SQLException {
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        Connection conn = DriverManager.getConnection(url,user,password);
        System.out.println("get connection established"+ conn.toString());

        return conn;
    }


}
