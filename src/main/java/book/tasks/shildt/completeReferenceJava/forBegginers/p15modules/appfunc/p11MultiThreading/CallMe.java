package book.tasks.shildt.completeReferenceJava.forBegginers.p15modules.appfunc.p11MultiThreading;

public class CallMe {
    /*synchronized*/ void call (String msg){

        try {
            System.out.print("[" + msg);
            Thread.sleep(1000);
            System.out.print("]\n" );
        } catch (InterruptedException e) {
            System.out.println("Aborted");
            throw new RuntimeException(e);
        }

    }
}
