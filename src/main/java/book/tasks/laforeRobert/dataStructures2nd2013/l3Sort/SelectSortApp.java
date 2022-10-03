package book.tasks.laforeRobert.dataStructures2nd2013.l3Sort;

public class SelectSortApp {
    public static void main(String[] args) {
        int maxSize = 100;
        ArraySel arr;
        arr = new ArraySel(maxSize);
        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(0);
        arr.insert(66);
        arr.insert(33);
        //before sorting
        arr.display();
        arr.selectionSort();
        //after sorting
        arr.display();
    }
}

