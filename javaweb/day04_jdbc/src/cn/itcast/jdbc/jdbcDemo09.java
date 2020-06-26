package cn.itcast.jdbc;

import cn.itcast.utils.JDBCUtils;

import java.sql.*;
import java.util.Scanner;

public class jdbcDemo09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.next();
        System.out.println("请输入密码");
        String password = sc.next();
        boolean flag = login2(username, password);
        if (flag) {
            System.out.println("登录成功");
        } else {
            System.out.println("登录失败");
        }

    }


    public static boolean login2(String username, String password) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        if (username == null || password == null) {
            return false;
        }

        try {
            conn = JDBCUtils.getConnection();
            String sql = "select * from user where username = ? and password = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            rs = pstmt.executeQuery();
            return rs.next();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JDBCUtils.close(rs, stmt, conn);
        }

        return false;

    }

    public static boolean login(String username, String password) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        if (username == null || password == null) {
            return false;
        }

        try {
            conn = JDBCUtils.getConnection();
            String sql = "select * from user where username = '" + username + "' and password = '" + password + "'";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            return rs.next();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JDBCUtils.close(rs, stmt, conn);
        }

        return false;

    }
}
