import com.gai.dao.UserMapper;
import com.gai.pojo.User;
import com.gai.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author gai
 * @create 2021--04--08
 */
public class UseMapperTest {
    @Test
    public void test() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //底层使用反射
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.getUsers();
        for (User user : users) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void test1() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(1);
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void test2() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.addUser(new User(7, "hi", "123"));
        sqlSession.close();
    }

    @Test
    public void test3() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.updateUser(new User(5, "new", "1111"));
        sqlSession.close();
    }
    @Test
    public void test4(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.deleteUser(6);
        sqlSession.close();
    }

}
