package book.tasks.shildt.forBegginers.p15modules.appfunc.appstart;

import book.tasks.shildt.forBegginers.p15modules.appfunc.simplefuncs.SimpleMathFuncs;

public class MyModAppDemo {
    public static void main(String[] args) {
        if (SimpleMathFuncs.isFactor(2, 10))
            System.out.println("2 является множителем 10");
        System.out.println("Haимeньшим общим множителем для 35 и 105 будет " + SimpleMathFuncs.lcf(35, 105));
        System.out.println("Haибoльшим общим множителем для 35 и 105 будет " + SimpleMathFuncs.gcf(35, 105));
    }
}
