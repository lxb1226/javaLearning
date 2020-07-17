package cn.itcast.service;

import cn.itcast.domain.PageBean;
import cn.itcast.domain.User;

import java.util.List;
import java.util.Map;

/**
 * 用户管理的业务接口
 */
public interface UserService {

    /**
     * 查询所有的用户信息
     * @return
     */
    public List<User> findAll();

    User login(User user);

    void addUser(User user);

    /**
     * 根据id删除user
     * @param id
     */
    void deleteUser(String id);

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    User findById(String id);

    /**
     * 修改用户信息
     * @param user
     */
    void updateUser(User user);

    /**
     * 批量删除用户
     * @param uids
     */
    void delSelectedUser(String[] uids);

    /**
     * 分页条件查询
     * @param currentPage
     * @param rows
     * @param condition
     * @return
     */
    PageBean<User> findUserByPage(String currentPage, String rows, Map<String, String[]> condition);
}
