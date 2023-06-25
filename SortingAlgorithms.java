/* This file contains implementations of sorting algorithms.
 * You are NOT allowed to modify any of the given method headers.
 */

public class SortingAlgorithms {

    /*
     * You may define additional helper functions here if you need to.
     * Make sure the helper functions have the private access modifier, as
     * they will only be used in this class.
     */

    /**
     * This function sorts an array of records using the insertion sort algorithm.
     * 
     * @param arr The array containing the records to be sorted.
     * @param n   The number of records in the array.
     */
    public void insertionSort(Record[] arr, int n) {
        // TODO: Implement this sorting algorithm here.
        // Create a new array to store the sorted elements
        Record sorted[] = new Record[n];

        // Loop through the original array and insert each element into the sorted array
        for (int i = 0; i < n; i++) {
            // Insert the element into the sorted array
            sorted[i] = arr[i];
            // Sort the last element in the sorted array
            sort(sorted, i);
        }

        // Copy the sorted array back into the original array
        System.arraycopy(sorted, 0, arr, 0, sorted.length);
    }

    /**
     * This function swaps two elements in an array.
     * 
     * @param arr    The array containing the elements.
     * @param index1 The index of the first element.
     * @param index2 The index of the second element.
     */
    private void swap(Record[] arr, int index1, int index2) {
        Record holder = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = holder;
    }

    /**
     * This function sorts the last element (the newly inserted element) in the
     * array by comparing it to the previous elements and swapping them if the
     * previous element is greater than the last element.
     * 
     * @param sorted The array containing the sorted elements.
     * @param n      The index of the last element in the array.
     */
    private void sort(Record sorted[], int n) {
        // Loop through the array until the array is sorted
        for (int i = n; i > 0; i--) {
            // Compare the last element to the previous element
            if (sorted[i].getIdNumber() < sorted[i - 1].getIdNumber()) {
                // Swap the elements if the previous element is greater
                swap(sorted, i, i - 1);
            } else {
                // If the previous element is smaller, then the array is sorted and we can stop
                // the loop
                i = 0;
            }
        }
    }

    /**
     * This function sorts an array of records using the selection sort algorithm.
     * 
     * @param arr The array containing the records to be sorted.
     * @param n   The number of records in the array.
     */
    public void selectionSort(Record[] arr, int n) {
        // TODO: Implement this sorting algorithm here.

        for (int i = 0; i < arr.length; i++) {
            // Variable to store the index of the smallest element
            int index = i;
            // Variable to store the smallest element
            int minVal = arr[i].getIdNumber();
            // Loop through the array to find the smallest element
            for (int j = i + 1; j < arr.length; j++) {
                // If the element at index j is smaller than the smallest element, then update
                // the variables
                if (arr[j].getIdNumber() < minVal) {
                    minVal = arr[j].getIdNumber();
                    index = j;
                }
            }
            // Swap the smallest element with i (the current element)
            swap(arr, index, i);
        }
    }

    /**
     * This function sorts an array of records using the merge sort algorithm.
     * 
     * @param arr The array containing the records to be sorted.
     * @param p   The starting index of the subarray to be sorted.
     * @param r   The ending index of the subarray to be sorted.
     */
    public void mergeSort(Record[] arr, int p, int r) {
        // TODO: Implement this sorting algorithm here.
        if (arr.length < 2) {
            return; // Base case: array is already sorted (or empty)
        } else if (p < r) {
            // Recursive case: split the array into two subarrays and sort them
            int mid = (p + r) / 2;
            // Sort the left subarray
            mergeSort(arr, p, mid);
            // Sort the right subarray
            mergeSort(arr, mid + 1, r);

            // Merge the two sorted subarrays together
            merge(arr, p, mid, r);
        }
    }

    /**
     * This function merges two sorted subarrays together into one sorted array.
     * 
     * @param arr The array containing the records to be sorted.
     * @param p   The starting index of the subarray to be sorted.
     * @param mid The middle index of the subarray to be sorted.
     * @param r   The ending index of the subarray to be sorted.
     */
    private void merge(Record[] arr, int p, int mid, int r) {
        // Create temporary arrays for left and right subarrays
        Record[] left = new Record[mid - p + 1];
        Record[] right = new Record[r - mid];

        // Copy data to temporary arrays
        for (int i = 0; i < left.length; i++) {
            left[i] = arr[p + i];
        }
        for (int j = 0; j < right.length; j++) {
            right[j] = arr[mid + j + 1];
        }

        // Merge the two temporary arrays together into the original array
        int i = 0, j = 0, k = p; // i = left index, j = right index, k = original array index

        // Compare the elements in the left and right subarrays and copy the smaller
        // element into the merged array
        while (i < left.length && j < right.length) {
            if (left[i].getIdNumber() <= right[j].getIdNumber()) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of left array if any
        while (i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }

        // Copy remaining elements of right array if any
        while (j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    /*
     * Define AT LEAST ONE more sorting algorithm here, apart from the
     * ones given above. Make sure that the method accepts an array of
     * records
     */

}