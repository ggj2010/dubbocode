package com.ggj;

import com.ggj.myinterface.account.bean.User;
import com.ggj.myinterface.account.service.UserService;
import com.ggj.myinterface.callback.CallbackListener;
import com.ggj.myinterface.callback.CallbackService;
import com.ggj.myinterface.sys.service.MergeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;

/**
 * @author:gaoguangjin
 * @date 2016/5/4 12:31
 */
@Slf4j
public class MainTest {
    public static void main(String[] args) throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("dubbo-consumer.xml");
        //测试不同的实现
       // testUserGroup1(context);
      //  testUserGroup2(context);
        //测试聚合
      //  testmereService(context);
        //testInsertException(context);
        //回调
        testCallBack(context);

        System.in.read();

    }

    /**
     * 有这种业务场景，
     * 需要实时返回业务数据，比如实时的交易订单记录，前后端可以使用websocket进行调用
     * 有两种方法，第一种没有使用回调的，比如 前端调用后台websocket的时候，后台触发一次dubbo调用
     * 还有以后总就是使用回调，消费者向生产者发送一个长连接请求，然后一直接生产者的回调
     * @param context
     */
    private static void testCallBack(ApplicationContext context) {
        CallbackService callbackService = (CallbackService) context.getBean(CallbackService.class); // 获取远程服务代理
        try {
            //每个回调传不同的key
            callbackService.callback("gaoguangjin", new CallbackListener() {
                public void changed(String msg) {
                    System.out.println("返回结果："+msg);
                }
            });
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 测试会带read-only事务
     * @param context
     */
    private static void testInsertException(ApplicationContext context) {
        UserService service = (UserService) context.getBean("userServiceImp"); // 获取远程服务代理
        User user=new  User();
        user.setName("ggjtest");
        service.insert(user);
    }

    private static void testUserGroup1(ApplicationContext context) {
        UserService service = (UserService) context.getBean("userServiceImp"); // 获取远程服务代理
        User user = service.get("1");
        log.info(user.toString());


    }
    private static void testUserGroup2(ApplicationContext context) {
        UserService service = (UserService) context.getBean("userServiceImpTwo"); // 获取远程服务代理
        User user = service.get("1");
        log.info(user.toString());

    }

    /**
     * 2016-05-04 15:34:22.759 [main] INFO  com.ggj.MainTest 26 main- group-2.1
     2016-05-04 15:34:22.759 [main] INFO  com.ggj.MainTest 26 main- group-2.2
     2016-05-04 15:34:22.759 [main] INFO  com.ggj.MainTest 26 main- group-1.1
     2016-05-04 15:34:22.759 [main] INFO  com.ggj.MainTest 26 main- group-1.2
     2016-05-04 15:34:22.760 [main] INFO  com.ggj.MainTest 26 main- group-3.1
     2016-05-04 15:34:22.760 [main] INFO  com.ggj.MainTest 26 main- group-3.2
     */
    private static void testmereService(ApplicationContext context) {
        MergeService mergeService = (MergeService) context.getBean("mergeServiceImp"); // 获取远程服务代理
        List<String> result = mergeService.mergeResult();
        for (String s : result) {
            log.info(s);
        }
    }




}
