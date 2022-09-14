package book.tasks.laforeRobert.dataStructures2nd2013.l2Arrays;

public class OrderedArray {
    private long[] a;
    private int nElements;

    public OrderedArray(int max) {
        a = new long[max];
        nElements = 0;
    }

    public int size() {
        return nElements;
    }

    public int find(long searchKey) {
        int lowerBoundOrdered = 0;
        int upperBound = nElements - 1;
        int curIn;

        while (true) {
            curIn = (lowerBoundOrdered + upperBound) / 2;
            if (a[curIn] == searchKey) {
                return curIn;
            } else if (lowerBoundOrdered > upperBound) {
                return nElements;
            } else {
                if (a[curIn] < searchKey) {
                    lowerBoundOrdered = curIn + 1;
                } else {
                    upperBound = curIn - 1;
                }
            }
        }
    }

    public void insert(long value) {
        int j;
        for (j = 0; j < nElements; j++) {
            if (a[j] > value) {
                break;
            }
        }
        for (int k = nElements; k > j; k--) {
            a[k] = a[k - 1];
        }
        a[j] = value;
        nElements++;
    }

    public boolean delete(long value) {
        int j = find(value);
        if (j == nElements) {
            return false;
        } else {
            for (int k = j; k < nElements; k++) {
                a[k] = a[k + 1];
            }
            nElements--;
            return true;
        }
    }

    public void display() {
        for (int j = 0; j < nElements; j++) {
            System.out.println(a[j] + " ");
        }
        System.out.println("");
    }
}
