package book.tasks.shildt.completeReferenceJava.forBegginers.p15modules.appfunc.p11MultiThreading.p12enumAnnotation;

public class EnumDemo3 {
    public static void main(String[] args) {
        
        //вывести цену на яблоко сорта Winesap
        System.out.println("Яблoкo сорта Winesap стоит: "
                + AppleNumbers.WINESON.getPrice() + " центов.");

        // вывести цены на все сорта яблок
        System.out.println("Ціни на всі сорта яблук: ");
        for(AppleNumbers each: AppleNumbers.values()){
            System.out.println("Цінa " + each.toString().toLowerCase() + " = "
                    + each.getPrice() + " центов.");
        }
    }
}
