package book.tasks.laforeRobert.dataStructures2nd2013.l2Arrays;

public class ClassDataApp {
    public static void main(String[] args) {
        int maxSize = 100;
        ClassDataArray array = new ClassDataArray(maxSize);

        array.insert("First", "Alex", 34);
        array.insert("Second", "Slava", 23);
        array.insert("Third", "Andrei", 56);
        array.insert("Fourth", "Smith", 23);
        array.insert("Fifes", "Yee", 12);
        array.insert("Six", "Crewel", 44);
        array.insert("Seventh", "Varia", 56);
        array.insert("Eights", "Nadiya", 57);
        array.insert("Nines", "Juli", 34);
        array.insert("Tens", "Nik", 76);

        array.displayA();

        String searchKey = "Six";
        Person found = array.find(searchKey);
        if (found != null) {
            System.out.println("Found ");
            found.displayPerson();
        } else {
            System.out.println("Cant find " + searchKey);
        }

        System.out.println("Deleting Second, Yee, and Seventh");
        array.delete("Second");
        array.delete("Yee");
        array.delete("Seventh");

        array.displayA();
    }
}
