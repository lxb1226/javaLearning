package cn.itcast.datasource.jdbcTemplate;

import cn.itcast.datasource.utils.JDBCUtils;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcTemplateDemo01 {
    public static void main(String[] args) {
        // 2.创建JDBCTemplate对象
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
        // 3.调用方法
        String sql = "update account set balance = 5000 where id = ?";
        int count = template.update(sql, 4);
        System.out.println(count);
    }
}
