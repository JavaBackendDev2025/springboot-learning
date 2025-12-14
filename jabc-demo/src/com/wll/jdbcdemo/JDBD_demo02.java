package com.wll.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBD_demo02 {
    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://127.0.0.1:3306/text02";
        String user="root";
        String password="123456";
        Connection coon = DriverManager.getConnection(url,user,password);
        String sql="update emp set age=20 where id=1;";
        Statement statement = coon.createStatement();
        statement.executeUpdate(sql);
        statement.close();
        coon.close();

    }
}
