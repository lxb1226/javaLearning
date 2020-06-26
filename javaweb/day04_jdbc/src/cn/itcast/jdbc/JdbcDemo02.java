package cn.itcast.jdbc;

import java.sql.*;

/*
    account表添加一条记录 insert 语句
 */
public class JdbcDemo02 {
    public static void main(String[] args){
        Connection conn = null;
        Statement stmt = null;
        try {
            // 1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 2.获取连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3", "root", "root");
            // 3.定义sql
            String sql = "insert into account values(null, '王五', 3000)";
            // 4.获取Statement对象
            stmt = conn.createStatement();
            // 5.执行sql
            int count = stmt.executeUpdate(sql);
           if(count > 0){
               System.out.println("添加成功");
           }else{
               System.out.println("添加失败");
           }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if(stmt != null){
                    stmt.close();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

            try {
                if(conn != null){
                    conn.close();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

    }
}
