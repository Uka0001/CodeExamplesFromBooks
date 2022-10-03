package book.tasks.laforeRobert.dataStructures.l3Sort;

public class BubbleSortApp {
    public static void main(String[] args) {
        int maxSize = 100;
        ArrayBub arrayBub = new ArrayBub(maxSize);

        arrayBub.insert(34);
        arrayBub.insert(56);
        arrayBub.insert(45);
        arrayBub.insert(37);
        arrayBub.insert(23);
        arrayBub.insert(67);
        arrayBub.insert(57);
        arrayBub.insert(46);
        arrayBub.insert(35);
        arrayBub.insert(25);

        arrayBub.display(); //display elements

        arrayBub.bubbleSort(); //sorting method by inserting
        arrayBub.display(); //recall display elements
    }

}
