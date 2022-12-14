package book.tasks.bruceeckel.thinkingInJava.MultiThreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutor {
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 5; i++){
            service.execute(new LiftOff());
        }
        service.shutdown();
    }
}
