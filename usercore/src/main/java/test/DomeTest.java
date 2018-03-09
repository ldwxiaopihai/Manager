package test;

import com.alibaba.dubbo.demo.UserService;
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
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-context.xml");
            context.start();
            System.out.println("服务已经启动...");
/*            UserService userService=(UserService) context.getBean("UserService");

            String  name=userService.dome("admin");
            System.out.println(name);*/
            System.in.read();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
