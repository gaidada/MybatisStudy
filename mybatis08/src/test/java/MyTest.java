import com.gai.dao.UserMapper;
import com.gai.pojo.User;
import com.gai.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MyTest {
    @Test
    public void test() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.queryUserById(1);
        System.out.println(user);
        sqlSession.close();
        SqlSession sqlSession1 = MybatisUtils.getSqlSession();
        UserMapper mapper1 = sqlSession1.getMapper(UserMapper.class);
        User user2 = mapper1.queryUserById(1);
        System.out.println(user2);

        //sqlSession.clearCache();//清理缓存
        //mapper.updateUser(new User(2, "aaa", "bbb"));
        sqlSession1.close();
    }
}
