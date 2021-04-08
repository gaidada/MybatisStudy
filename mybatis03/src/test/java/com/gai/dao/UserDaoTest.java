package com.gai.dao;

import com.gai.pojo.User;
import com.gai.utils.MybatisUtils;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class UserDaoTest {
    @Test
    public void getUserList() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(2);
        System.out.println(user);
        sqlSession.close();
    }

    static Logger logger = Logger.getLogger(UserDaoTest.class);

    @Test
    public void testLog4j() {
        logger.info("info:进入log4j方法");
        logger.debug("debug:进入log4j方法");
        logger.error("error进入log4j方法");

    }

    @Test
    public void getUserByLimit() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String, Integer> map = new HashMap<>();
        map.put("startIndex", 1);
        map.put("pageSize", 2);
        List<User> userList = mapper.getUserByLimit(map);
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void getUserByRowBounds() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        //RowBounds去实现
        RowBounds rowBounds = new RowBounds(1, 2);
        //通过java代码层面实现分页
        List<User> userList = sqlSession.selectList("com.gai.dao.UserMapper.getUserByLimitRowBounds", null, rowBounds);
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }
}
