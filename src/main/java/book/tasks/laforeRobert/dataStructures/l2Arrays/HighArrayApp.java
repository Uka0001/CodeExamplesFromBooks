package book.tasks.laforeRobert.dataStructures.l2Arrays;

public class HighArrayApp {
    public static void main(String[] args) {
        int maxSize = 100;
        HighArray array = new HighArray(maxSize);
        array.insert(34);
        array.insert(45);
        array.insert(56);
        array.insert(56);
        array.insert(78);
        array.insert(89);
        array.insert(4);
        array.insert(54);
        array.insert(76);
        array.insert(56);

        array.display();

        int searchKey = 54;
        if (array.find(searchKey)) {
            System.out.println("Found " + searchKey);
        } else {
            System.out.println("Cant find " + searchKey);
        }

        array.delete(56);
        array.delete(34);
        array.delete(76);

        array.display();

        array.findMax();

        array.removeMax();

        array.display();

        array.SortMax();
        array.display();
    }
}
