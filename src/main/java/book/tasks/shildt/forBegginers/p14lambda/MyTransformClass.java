package book.tasks.shildt.forBegginers.p14lambda;

public class MyTransformClass {
    public static void main(String[] args) {
        MyTransform<Double>sqrt = (v) -> {
            for (int i=0; i<v.length; i++) v[i] = Math.sqrt(v[i]);
        };
    }
}
