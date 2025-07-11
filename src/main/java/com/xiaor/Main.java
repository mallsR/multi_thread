package com.xiaor;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        Thread t = new Thread() {  // 内部匿名类的方式创建线程
            @Override
            public void run() {
                log.debug("running");
            }
        };

        t.setName("测试线程");
        t.start();
    }
}