package service;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by wuxinxin on 2018/11/26.
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent>{

    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        String msg = demoEvent.getMsg();
        System.out.println("接收到消息:"+msg);
    }
}
