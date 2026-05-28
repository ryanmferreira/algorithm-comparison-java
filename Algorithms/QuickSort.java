package Algorithms;

public class QuickSort {
    private char[] vector;

    public QuickSort(char[] v) {
        this.vector = v;
    }

    public void sort() {
        quickSort(vector, 0, this.vector.length - 1);
    }

    private void quickSort(char arr[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, end);
        }
    }

    public void swap(char[] arr, int i, int j) {
        char aux = arr[i];
        arr[i] = arr[j];
        arr[j] = aux;
    }

    private int partition(char arr[], int begin, int end) {
        char pivot = arr[end];
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, end);
        return i + 1;
    }

    public void show() {
        for (int i = 0; i < this.vector.length; i++) {
            System.out.print(this.vector[i] + " ");
        }

        System.out.println();
    }
}