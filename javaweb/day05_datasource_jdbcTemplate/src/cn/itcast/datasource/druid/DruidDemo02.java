package cn.itcast.datasource.druid;

import cn.itcast.datasource.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DruidDemo02 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = JDBCUtils.getConnection();
            String sql = "insert into account values(null,?,?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "王五");
            pstmt.setDouble(2, 3000);
            int count = pstmt.executeUpdate();
            System.out.println(count);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JDBCUtils.close(pstmt, conn);
        }
    }
}
