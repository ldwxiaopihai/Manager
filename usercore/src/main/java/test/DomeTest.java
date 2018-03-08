package test;

import com.usercore.mapper.UserMapper;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2018/3/8 0008.
 */
public class DomeTest {
    @Test
    public void test() {
        try {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
            context.start();
            System.out.println("服务已经启动...");
            UserMapper userMapper=(UserMapper) context.getBean("userMapper");
            userMapper.selectByUserName("admin");
            /*String  name=serviceimpl.dome("admin");*/
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
