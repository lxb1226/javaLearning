package cn.itcast.datasource.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCUtils {
    private static DataSource ds = null;

    static {
        try {
            Properties pro = new Properties();
            InputStream is = JDBCUtils.class.getClassLoader().getResourceAsStream("druid.properties");
            pro.load(is);
            ds = DruidDataSourceFactory.createDataSource(pro);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /***
     * 获取连接
     * @return
     * @throws SQLException
     */
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }

    /**
     * 释放资源
     *
     * @param stmt
     * @param conn
     */
    public static void close(Statement stmt, Connection conn) {
        try {
            if (stmt != null) {
                stmt.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        try {
            if (conn != null) {
                conn.close(); // 归还连接
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void close(ResultSet rs, Statement stmt, Connection conn) {
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        close(stmt, conn);
//        try {
//            if(stmt != null){
//                stmt.close();
//            }
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//
//        try {
//            if(conn != null){
//                conn.close(); // 归还连接
//            }
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
    }

    /**
     * 获取连接池
     *
     * @return
     */
    public static DataSource getDataSource() {
        return ds;
    }
}
