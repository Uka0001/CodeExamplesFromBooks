package book.tasks.bruceeckel.thinkingInJava4th2009.MultiThreads;

public class DaemonSpawn implements Runnable{
    @Override
    public void run() {
        while (true){
            Thread.yield();
        }
    }
}
