package booktasks.shildt.completeReferenceJava10th2018.p12enumAnnotation;

import static java.lang.Character.valueOf;

public class WrappersTest {
    public static void main(String[] args) {
        Character character = new Character('a');
        System.out.println(character.charValue());
        Character character1 = valueOf('d');
        System.out.println(character1.charValue());
        log.createlog("character1.charValue()");
        Boolean aBoolean = new Boolean(true);
        Boolean bBoolean = new Boolean("one");
        Boolean cBoolean = Boolean.valueOf(false);
        Boolean dBoolean = Boolean.valueOf("two");
        dBoolean.booleanValue();
        aBoolean.booleanValue();
        cBoolean.booleanValue();
        dBoolean.booleanValue();

        Integer integer = Integer.valueOf(100);

        log.createlog("Log one");
        new log("Log two");
        
    }

    public static class log {
        public log(String s) {
            System.out.println(s);
        }

        public static log createlog(String s) {
            return new log(s);
        }
    }
}
