package book.tasks.laforeRobert.dataStructures2nd2013.l2Arrays;

public class ClassDataArray {
    private Person[] a;
    private int nElems;

    public ClassDataArray(int max) {
        this.a = new Person[max];
        this.nElems = 0;
    }

    public Person find(String searchName) {
        int j;
        for (j = 0; j < nElems; j++) {
            if (a[j].getLast().equals(searchName)) {
                break;
            }
        }
        if (j == nElems) {
            System.out.println("Значение " + searchName + " не найдено");
            System.out.println("");
            return null;
        } else {
            System.out.println("Значение " + searchName + " найдено");
            System.out.println("");
            return a[j];
        }
    }

    public void insert(String last, String first, int age) {
        a[nElems] = new Person(last, first, age);
        nElems++;
    }

    public boolean delete(String searchName) {
        int j;
        for (j = 0; j < nElems; j++) {
            if (a[j].getLast().equals(searchName)) {
                break;
            }
        }
        if (j == nElems) {
            System.out.println("Значение " + searchName + " не найдено");
            System.out.println("");
            return false;
        } else {
            for (int k = j; k < nElems; k++) {
                a[k] = a[k + 1];
            }
            nElems--;
            System.out.println("Значение " + searchName + " найдено");
            System.out.println("");
            return true;
        }
    }

    public void displayA() {
        for (int j = 0; j < nElems; j++) {
            a[j].displayPerson();
        }
    }
}
