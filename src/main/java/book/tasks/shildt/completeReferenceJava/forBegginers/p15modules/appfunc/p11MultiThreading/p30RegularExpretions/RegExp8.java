package book.tasks.shildt.completeReferenceJava.forBegginers.p15modules.appfunc.p11MultiThreading.p30RegularExpretions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp8 {
    public static void main(String[] args) {
        String str = "Jon Jonathan Frank Ken Todd";
        Pattern pattern = Pattern.compile("Jon.*? ");
        Matcher matcher = pattern.matcher(str);

        System.out.println("Original string " + str);
        str = matcher.replaceAll("Eric ");

        System.out.println("Changed string " + str);

    }
}
