package book.tasks.laforeRobert.dataStructures.l3Sort;
/*
 * Insertion sorting method*/
public class ArrayInOb {
    private Person [] a;
    private int nElems;

    public ArrayInOb(int max) {
        this.a = new Person[max];
        this.nElems = 0;
    }

    public void insert(String last, String first, int age){
        a[nElems] = new Person(last, first, age);
        nElems++;
    }

    public void display(){
        for (int j = 0; j<nElems; j++){
            a[j].displayPerson();
        }
        System.out.println("");
    }

    public void insertionSort(){
        int in, out;

        for (out = 1; out < nElems; out++){
            Person temp = a[out];
            in = out;

            while (in > 0 && a[in-1].getLastName()
                            .compareTo(temp.getLastName())>0) {
                a[in] = a[in - 1];
                --in;
            }
            a[in] = temp;
        }
    }
}
