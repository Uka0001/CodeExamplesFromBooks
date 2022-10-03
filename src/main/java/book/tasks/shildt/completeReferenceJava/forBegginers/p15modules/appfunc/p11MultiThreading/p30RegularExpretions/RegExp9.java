package book.tasks.shildt.completeReferenceJava.forBegginers.p15modules.appfunc.p11MultiThreading.p30RegularExpretions;

import java.util.regex.Pattern;

public class RegExp9 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[ ,.!?]");

        String [] str = pattern.split("one two,alpha9 l2!done.");

        for (int i = 0; i < str.length; i++) {
            System.out.println("Next match: " + str[i]);
        }
    }
}
