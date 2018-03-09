package com.support;
import com.alibaba.dubbo.demo.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wy on 2017/4/13.
 */
public class Consumer {
    public static void main(String[] args) {

        //测试常规服务

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        System.out.println("consumer2 start");
/*        DemoService demoService = context.getBean(DemoService.class);

        System.out.println("consumer2");
        System.out.println(demoService.getPermissions(1L));*/
      /*  UserService userService=context.getBean(UserService.class);*/
        UserService userService=(UserService) context.getBean("username");
        try {
            String a=userService.dome("admin");
            System.out.println(a);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
