import com.gai.dao.TeacherMapper;
import com.gai.pojo.Teacher;
import com.gai.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyTest {
    @Test
    public void test1() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher3(1);
        System.out.println(teacher);
        sqlSession.close();
    }
}
