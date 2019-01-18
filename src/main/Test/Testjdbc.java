import com.bean.User;
import com.dao.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;

/**
 * @author xiaoqiang
 * @date $(DATE)-$(TIME)
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/applicationContext.xml", "classpath:spring/dispatcher-servlet.xml"})
public class Testjdbc {

    @Autowired
    private UserMapper userMapper;
    @Test
    public void testjdbc() {
        System.out.println(userMapper.findByuserId(1));

    }
}
