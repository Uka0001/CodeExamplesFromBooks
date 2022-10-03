package book.tasks.shildt.completeReferenceJava.forBegginers.p15modules.appfunc.p11MultiThreading;

public class MultiThreadDemo {
    public static void main(String[] args) {
        new NewThread("One");
        new NewThread("Two");
        new NewThread("Three");
        try {
            // ожидать завершения других потоков исполнения
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Головний поток прерван");
            throw new RuntimeException(e);
        }
        System.out.println("Головний поток завершен.");
    }
}
