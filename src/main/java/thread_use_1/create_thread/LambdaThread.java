package thread_use_1.create_thread;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LambdaThread {
    public static void main(String[] args) {
        Runnable task = () -> {log.debug("use lambda to create thread");};

        Thread thread = new Thread(task, "lambda_thread");
        thread.start();
    }
}
