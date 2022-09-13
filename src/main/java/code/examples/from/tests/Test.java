package code.examples.from.tests;

public class Test {
    public static void main(String args[]) {
        int x = 9;
        if (x == 9) {
            /*int*/ x = 8;
            System.out.println(x);
        }
    }
}
// - Compilation Error!