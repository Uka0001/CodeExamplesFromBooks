package book.tasks.laforeRobert.dataStructures2nd2013.l2Arrays;

import java.util.Arrays;
import java.util.Collection;

public class HighArray {
    private long[] a;
    private int nElems;

    public HighArray(int max) {
        a = new long[max];
        nElems = 0;
    }

    public boolean find(long searchKey) {
        int j;
        for (j = 0; j < nElems; j++) {
            if (a[j] == searchKey) {
                break;
            }
        }
        if (j == nElems) {
            return false;
        } else {
            return true;
        }
    }

    public void insert(long value) {
        a[nElems] = value;
        nElems++;
    }

    public boolean delete(long value) {
        int j;
        for (j = 0; j < nElems; j++) {
            if (value == a[j]) {
                break;
            }
        }
        if (j == nElems) {
            return false;
        } else {
            for (int k = j; k < nElems; k++) {
                a[k] = a[k + 1];
            }
            nElems--;
            return true;
        }
    }

    public void display() {
        for (int j = 0; j < nElems; j++) {
            System.out.print(a[j] + " ");
        }
        System.out.println("");
    }

    public int findBinary(long searchKey) {
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn;

        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            if (a[curIn] == searchKey) {
                return curIn;
            } else if (lowerBound > upperBound) {
                return nElems; //element doesnt find
            } else {
                if (a[curIn] < searchKey) {
                    lowerBound = curIn + 1;
                } else {
                    upperBound = curIn - 1;
                }
            }
        }
    }

    public long findMax() {
        long max = Integer.MIN_VALUE;
        if (a.length == 0) {
            return -1;
        } else {
            for (int i = 0; i < nElems; i++) {
                if (a[i] > max) {
                    max = a[i];
                }
            }
        }
        System.out.println("Max value: " + max);
        return max;
    }

    public void removeMax() {
        long max = Integer.MIN_VALUE;
        if (a.length == 0) {
            System.out.println("Array is empty");
        } else {
            for (int i = 0; i < nElems; i++) {
                if (a[i] > max) {
                    max = a[i];
                }
            }
            System.out.println("Find max value: " + max);
        }

        int j;
        for (j = 0; j < nElems; j++) {
            if (max == a[j]) {
                break;
            }
        }
        for (int k = j; k < nElems; k++) {
            a[k] = a[k + 1];
        }
        nElems--;
        System.out.println("Remove max element: " + max);

        //delete(findMax()); //the easiest variant :)
    }
    public void SortMax() {
        int out, in;
        for (out = nElems - 1; out > 1; out--) {
            for (in = 0; in < out; in++) {
                if (a[in] > a[in + 1]) {
                    long temp = a[in];
                    a[in] = a[in + 1];
                    a[in + 1] = temp;
                }
            }
        }
    }
}
/*
+ 2.1. Добавьте в класс HighArray из програмы highArray.java
(листинг 2.3) метод getMax(), который возвращает наибольшее
значение ключа в массиве или –1, если массив пуст. Добавьте в
main() код для тестирования нового метода. Считайте, что все ключи
являются положительными числами.
+ 2.2. Измените метод из пункта 2.1 так, чтобы элемент с
наибольшим ключом не только возвращался методом, но и удалялся
 из массива. Присвойте новой версии имя removeMax().
+ 2.3. Метод removeMax() из пункта 2.2 может использоваться
для сортировки содержимого массива по ключу.
Реализуйте алгоритм сортировки, который не
из- меняет класса HighArray (а изменяет только код main()).
Вам потребуется второй массив для хранения отсортированных данных.
(Этот алгоритм представляет со- бой крайне примитивную
разновидность сортировки методом выбора, описанной в главе 3,
«Простая сортировка».)
+-? 2.4. Измените программу orderedArray.java (листинг 2.4) так,
чтобы методы insert() и delete(), а также метод find()
использовали двоичный поиск (как пред- лагается в тексте).
2.5. Добавьте в класс OrdArray программы orderedArray.java (листинг 2.4)
метод merge(), объединяющий два упорядоченных исходных массива в один
упорядочен- ный приемный массив. Включите в main() фрагмент кода, который
заполняет два исходных массива случайными числами, вызывает merge() и выводит
содержимое полученного массива. Исходные массивы могут содержать разное
количество эле- ментов. Ваш алгоритм должен сравнивать ключи исходных
массивов и копировать меньший в приемный массив. Также необходимо
предусмотреть ситуацию, когда элементы в одном исходном массиве
заканчиваются раньше, чем в другом.
2.6. Добавьте в класс HighArray программы highArray.java (листинг 2.3)
метод noDups(), удаляющий все дубликаты из массива. Другими словами,
если массив содержит три элемента с ключом 17, метод noDups() должен удалить
два из них. Не беспокойтесь о сохранении порядка элементов. Одно из возможных
решений — сравнить каждый элемент со всеми остальными элементами и заменить все
ду- бликаты null (или другим значением, не встречающимся среди реальных ключей),
после чего удалить из массива все вхождения null. Конечно, размер массива при этом
уменьшится.*/
