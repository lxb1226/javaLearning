package cn.itcast.datasource.jdbcTemplate;

import cn.itcast.datasource.domain.Emp;
import cn.itcast.datasource.utils.JDBCUtils;
import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class JdbcTemplateDemo02 {
    private JdbcTemplate template = null;

    @Before
    public void start(){
        template = new JdbcTemplate(JDBCUtils.getDataSource());
    }


    //Junit单元测试
    @Test
    public void test1(){
        String sql = "update emp set salary = 10000 where id = ?";
        int count = template.update(sql, 1001);
        System.out.println(count);
    }

    /**
     * 添加一条记录
     */
    @Test
    public void test2(){
        String sql = "insert into emp(id,ename,dept_id) values(?,?,?)";
        int count = template.update(sql, 1015, "郭靖", 10);
        System.out.println(count);
    }

    /**
     * 删除一条记录
     */
    @Test
    public void test3(){
        String sql = "delete from emp where id = ?";
        int count = template.update(sql, 1015);
        System.out.println(count);
    }

    /**
     * 查询一条记录，并将其封装到Map中
     */
    @Test
    public void test4(){
        String sql = "select * from emp where id = ? or id = ?";
        Map<String, Object> map = template.queryForMap(sql, 1001);
        System.out.println(map);
    }

    /**
     * 查询所有记录，并将Map集合装载到List集合中
     */
    @Test
    public void test5(){
        String sql = "select * from emp";
        List<Map<String, Object>> list = template.queryForList(sql);
        for(Map<String, Object> stringObjectMap:list){
            System.out.println(stringObjectMap);
        }
    }
    
    @Test
    public void test6(){
        String sql = "select * from emp";
        List<Emp> list = template.query(sql, new RowMapper<Emp>() {

            @Override
            public Emp mapRow(ResultSet rs, int i) throws SQLException {
                Emp emp = new Emp();
                int id = rs.getInt("id");
                String ename = rs.getString("ename");
                int job_id = rs.getInt("job_id");
                int mgr = rs.getInt("mgr");
                Date joindate = rs.getDate("joindate");
                double salary = rs.getDouble("salary");
                double bonus = rs.getDouble("bonus");
                int dept_id = rs.getInt("dept_id");

                emp.setId(id);
                emp.setEname(ename);
                emp.setJob_id(job_id);
                emp.setMgr(mgr);
                emp.setJoindate(joindate);
                emp.setSalary(salary);
                emp.setBonus(bonus);
                emp.setDept_id(dept_id);

                return emp;
            }
        });

        for(Emp emp : list){
            System.out.println(emp);
        }
    }

    @Test
    public void test6_2(){
        String sql = "select * from emp";
        List<Emp> list = template.query(sql, new BeanPropertyRowMapper<Emp>(Emp.class));
        for(Emp emp:list){
            System.out.println(emp);
        }
    }

    /**
     * 查询总记录数
     */
    @Test
    public void test7(){
        String sql = "select count(*) from emp";
        Long total = template.queryForObject(sql, Long.class);
        System.out.println(total);
    }

}
