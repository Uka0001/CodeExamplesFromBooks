package book.tasks.laforeRobert.dataStructures2nd2013.l2Arrays;

public class LowArray {
    private long [] a;

    public LowArray(int size) {
        a = new long[size];
    }

    public void setElement(int index, long value){
        a[index] = value;
    }

    public long getElement(int index){
        return a[index];
    }
}
