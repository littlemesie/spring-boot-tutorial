package cn.mesie.springTask;

import java.util.Date;

/**
 * Created by 2019-04-21 22:10
 *
 * @author: mesie
 */
public class SpringTaskRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("具体的逻辑代码" + new Date());
    }
}
