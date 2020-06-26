package cn.itcast.datasource.druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

public class DruidDemo01 {
    public static void main(String[] args) throws Exception {
        // 加载配置文件
        Properties pro = new Properties();
        InputStream is = DruidDemo01.class.getClassLoader().getResourceAsStream("druid.properties");
        pro.load(is);
        // 1.定义配置文件
        DataSource ds = DruidDataSourceFactory.createDataSource(pro);

        Connection conn = ds.getConnection();
        System.out.println(conn);
    }
}
