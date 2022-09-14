package book.tasks.laforeRobert.dataStructures2nd2013.l2Arrays;

public class OrderedApp {
    public static void main(String[] args) {
        int maxSize = 100;
        OrderedArray array = new OrderedArray(maxSize);

        array.insert(77);
        array.insert(99);
        array.insert(89);
        array.insert(67);
        array.insert(45);
        array.insert(34);
        array.insert(23);
        array.insert(23);
        array.insert(45);
        array.insert(23);

        int searchKey = 34;

        if (array.find(searchKey) != array.size()) {
            System.out.println("Found " + searchKey);
        } else {
            System.out.println("Cant find " + searchKey);
        }

        array.display();

        array.delete(23);
        array.delete(45);
        array.delete(89);

        array.display();
    }
}
