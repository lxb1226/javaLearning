package cn.itcast.jdbc;

import java.sql.*;

/*
    创建简单的表
 */
public class jdbcDemo06 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3", "root", "root");
            String sql = "select * from account";
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            // 6.处理结果
            // 6.1 让光标向下移动一行
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                double balance = rs.getDouble("balance");
                System.out.println(id + ":" + name +"-->" + balance);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if(stmt != null)
                    stmt.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

            try {
                if(conn != null)
                    conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
