package book.tasks.laforeRobert.dataStructures.l2Arrays;

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

    /*
    //Dima realisation
    binarySearch(arr, x, low, high)
        repeat till low = high
               mid = (low + high)/2
                   if (x == arr[mid])
                   return mid

                   else if (x > arr[mid]) // x is on the right side
                       low = mid + 1

                   else                  // x is on the left side
                       high = mid - 1
                       */

    /*
    //Sergey's realisation
    int binSearch(long[] array, long v, int indexOffset) {
        if (array.length == 1 && array[0] != v) {
            return -1;
        } else {
            int midIndex = array.length / 2;
            long midValue = array[midIndex];
            if (midValue < v) {
                return binSearch(Arrays.copyOfRange(array, midIndex, array.length), v, indexOffset + midIndex);
            } else if (midValue > v) {
                return binSearch(Arrays.copyOfRange(array, 0, midIndex), v, indexO
                */
    public int find(long searchKey) { //binary search
        int position;
        int comparisonCount = 0;
        int first =0;
        int last = nElements-1;
        position = (first + last) / 2;
        while ((a[position] != searchKey) && (first <= last)) {
            comparisonCount++;
            if (a[position] > searchKey) {  // если число заданного для поиска
                last = position - 1; // уменьшаем позицию на 1.
            } else {
                first = position + 1;    // иначе увеличиваем на 1
            }
            position = (first + last) / 2;
        }
        if (first <= last) {
            System.out.println(searchKey + " является " + ++position + " элементом в массиве");
            System.out.println("Метод бинарного поиска нашел число после " + comparisonCount +
                    " сравнений");
            return position;
        } else {
            System.out.println("Элемент не найден в массиве. Метод бинарного поиска закончил работу после "
                    + comparisonCount + " сравнений");
            return -1;
        }
//        int lowerBoundOrdered = 0;  //line search
//        int upperBound = nElements - 1;
//        int curIn;
//
//        while (true) {
//            curIn = (lowerBoundOrdered + upperBound) / 2;
//            if (a[curIn] == searchKey) {
//                return curIn;
//            } else if (lowerBoundOrdered > upperBound) {
//                return nElements;
//            } else {
//                if (a[curIn] < searchKey) {
//                    lowerBoundOrdered = curIn + 1;
//                } else {
//                    upperBound = curIn - 1;
//                }
//            }
//        }
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

    public boolean delete(long value) { //TODO
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
