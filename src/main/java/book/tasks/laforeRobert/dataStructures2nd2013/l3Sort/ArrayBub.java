package book.tasks.laforeRobert.dataStructures2nd2013.l3Sort;

import static java.util.Collections.swap;

public class ArrayBub {
    private long[] a;
    private int nElements;

    public ArrayBub(int max) {
        a = new long[max];
        nElements = 0;
    }

    public void insert(long value) {
        a[nElements] = value;
        nElements++;
    }

    public void display() {
        for (int j = 0; j < nElements; j++) {
            System.out.print(a[j] + " ");
        }
        System.out.println("");
    }

    public void bubbleSort() {
        int out, in;
        for (out = nElements - 1; out > 1; out--) {
            for (in = 0; in < out; in++) {
                if (a[in] > a[in + 1]) {
                    swap(in, in + 1);
                }
            }
        }
    }

    private void swap(int one, int two){
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
}
