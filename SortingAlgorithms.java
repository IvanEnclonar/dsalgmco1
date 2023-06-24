/* This file contains implementations of sorting algorithms.
 * You are NOT allowed to modify any of the given method headers.
 */

import java.util.ArrayList;

public class SortingAlgorithms {

    /*
     * You may define additional helper functions here if you need to.
     * Make sure the helper functions have the private access modifier, as
     * they will only be used in this class.
     */

    private void arrayListSwap(ArrayList<Record> sorted, int index1, int index2) {
        Record holder = sorted.get(index1);
        sorted.set(index1, sorted.get(index2));
        sorted.set(index2, holder);
    }

    private void insertAndSort(ArrayList<Record> sorted, Record record) {
        sorted.add(record);
        for (int i = sorted.size() - 1; i > 0; i--) {
            if (sorted.get(i).getIdNumber() < sorted.get(i - 1).getIdNumber()) {
                arrayListSwap(sorted, i, i - 1);
            } else {
                i = 0;
            }
        }
    }

    public void insertionSort(Record[] arr, int n) {
        // TODO: Implement this sorting algorithm here.
        ArrayList<Record> sorted = new ArrayList<>();
        for (Record element : arr) {
            insertAndSort(sorted, element);
        }
        arr = sorted.toArray(new Record[sorted.size()]);

        // Print The Arrays
        for (Record record : arr) {
            System.out.println(record.getIdNumber() + " " + record.getName());
        }

        System.out.println("INSERTION");
    }

    private void Swap(Record[] arr, int index1, int index2) {
        Record holder = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = holder;
    }

    public void selectionSort(Record[] arr, int n) {
        // TODO: Implement this sorting algorithm here.

        for (int i = 0; i < arr.length; i++) {
            int index = i;
            int minVal = arr[i].getIdNumber();
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].getIdNumber() < minVal) {
                    minVal = arr[j].getIdNumber();
                    index = j;
                }
            }
            Swap(arr, index, i);
        }

        for (Record record : arr) {
            System.out.println(record.getIdNumber() + " " + record.getName());
        }

        System.out.println("INSERTION");
    }

    public void mergeSort(Record[] arr, int p, int r) {
        // TODO: Implement this sorting algorithm here.
    }

    /*
     * Define AT LEAST ONE more sorting algorithm here, apart from the
     * ones given above. Make sure that the method accepts an array of
     * records
     */

}