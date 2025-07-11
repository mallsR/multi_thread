package thread_use_1.create_thread;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RunnableAndThread {
    public static void main(String[] args) {
        // 任务
        Runnable task = new Runnable() {
            @Override
            public void run() {
                log.debug("use runnable to create thread");
            }
        };

        // 创建线程
        Thread thread = new Thread(task, "runnable_thread");
        thread.start();
    }
}
