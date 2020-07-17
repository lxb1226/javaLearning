package cn.itcast.travel.service.impl;

import cn.itcast.travel.dao.CategoryDao;
import cn.itcast.travel.dao.impl.CategoryDaoImpl;
import cn.itcast.travel.domain.Category;
import cn.itcast.travel.service.CategoryService;
import cn.itcast.travel.util.JedisUtil;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.Tuple;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CategoryServiceImpl implements CategoryService {
    private CategoryDao categoryDao = new CategoryDaoImpl();

    @Override
    public List<Category> findAll() {
        // 1.从redis中查询
        // 1.1获取jedis客户端
        Jedis jedis = JedisUtil.getJedis();
        // 1.2可使用sortedset排序查询
//        Set<String> categorys = jedis.zrange("category", 0, -1);
        /// 1.3查询sortedset中的分数和值
        Set<Tuple> categorys = jedis.zrangeWithScores("category", 0, -1);
        // 2.判断查询的集合是否为空
        List<Category> cs = null;
        if (categorys == null || categorys.size() == 0) {
            // 3.如果为空，则为第一次访问，需要从数据库查询
            // 3.1从数据库查询
            System.out.println("从数据库查询");
            cs = categoryDao.findAll();
            // 3.2将集合数据存储到redis中的 category中的key
            for (int i = 0; i < cs.size(); i++) {

                jedis.zadd("category", cs.get(i).getCid(), cs.get(i).getCname());
            }
        } else {
            // 4.不为空，将set的数据存入list
            System.out.println("从redis中查询");
            cs = new ArrayList<>();
            for (Tuple tuple : categorys) {
                Category category = new Category();
                category.setCname(tuple.getElement());
                category.setCid((int) tuple.getScore());
                cs.add(category);
            }

        }

        return cs;
    }
}
