
// Define a SortingAlgorithm interface with a method for sorting an array
public interface SortingAlgorithm {
    void sort(int[] arr);
}

// Define a class for BubbleSort that implements the SortingAlgorithm interface
class BubbleSort implements SortingAlgorithm {
    public void sort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    // Swap elements if they are out of order
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}

// Define a class for MergeSort that implements the SortingAlgorithm interface
class MergeSort implements SortingAlgorithm {

    public void sort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    private void mergeSort(int arr[], int l, int r) {
        if (l < r) {
            // Find the middle point
            int m = l + (r - l) / 2;

            // Sort first and second halves
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    private void merge(int arr[], int l, int m, int r) {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        // Create temp arrays
        int L[] = new int[n1];
        int R[] = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        // Merge the temp arrays

        // Initial indices of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}

// Define a class for QuickSort that implements the SortingAlgorithm interface
class QuickSort implements SortingAlgorithm {
    public void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}

// Define a Main class for running the sorting algorithms and printing the results
class Main {
    // Method to print an array
    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create an array for sorting
        int[] arr = { 64, 34, 25, 12, 22, 11, 90 };

        // Use BubbleSort to sort the array
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(arr);
        System.out.print("Bubble Sort: ");
        printArray(arr);

        // Create a new array for sorting with MergeSort
        int[] arr2 = { 64, 34, 25, 12, 22, 11, 90 };

        // Use MergeSort to sort the new array
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(arr2);
        System.out.print("Merge Sort: ");
        printArray(arr2);

        // Create another new array for sorting with QuickSort
        int[] arr3 = { 64, 34, 25, 12, 22, 11, 90 };

        // Use QuickSort to sort the third array
        QuickSort quickSort = new QuickSort();
        quickSort.sort(arr3);
        System.out.print("Quick Sort: ");
        printArray(arr3);
    }
}
