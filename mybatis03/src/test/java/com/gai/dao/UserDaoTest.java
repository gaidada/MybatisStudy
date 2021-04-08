package com.gai.dao;

import com.gai.pojo.User;
import com.gai.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

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
}
