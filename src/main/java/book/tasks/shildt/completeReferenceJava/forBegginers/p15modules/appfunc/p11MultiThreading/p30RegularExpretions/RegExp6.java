package book.tasks.shildt.completeReferenceJava.forBegginers.p15modules.appfunc.p11MultiThreading.p30RegularExpretions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp6 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("e.?d");
        Matcher matcher = pattern.matcher("extend cup end table");

        while (matcher.find()){
            System.out.println("Matcher find: " + matcher.group());
        }
    }
}
