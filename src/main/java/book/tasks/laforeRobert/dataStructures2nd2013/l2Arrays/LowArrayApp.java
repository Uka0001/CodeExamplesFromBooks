package book.tasks.laforeRobert.dataStructures2nd2013.l2Arrays;

public class LowArrayApp {
    public static void main(String[] args) {
        long[] arr = new long[100];
        int nElems = 0;
        int j;
        long searchKey;
        arr[0] = 99;
        arr[1] = 87;
        arr[2] = 54;
        arr[3] = 34;
        arr[4] = 45;
        nElems = 5;

        for (j = 0; j < nElems; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println("");

        //find

        searchKey = 54;
        for (j = 0; j < nElems; j++) {
            if (searchKey == arr[j]) {
                break;
            }
        }
        if (searchKey == j) {
            System.out.println("Can't find " + searchKey);
        } else {
            System.out.println("Found " + searchKey);
        }

        //delete

        searchKey = 87;
        for (j=0; j<nElems; j++){
            if (arr[j] == searchKey){
                break;
            }
        }
        for (int k=j; k<nElems-1; k++){
            arr[k] = arr[k+1];
            nElems--;
        }

        //ouput elements
        for (j=0; j<nElems; j++){
            System.out.println(arr[j] + " ");
        }
        System.out.println("");
    }
}
