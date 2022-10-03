package book.tasks.shildt.completeReferenceJava.forBegginers.p15modules.appfunc.p11MultiThreading.p12enumAnnotation;

public enum AppleNumbers {
    JONATAN(5), GOLDENDEL(10), REDDEL(), WINESON(15), CORTLAND(9);

    private int price;

    public int getPrice() {
        return price;
    }

    AppleNumbers() {
        price = -1;
    }

    AppleNumbers(int i) {
        price = i;
    }
}
