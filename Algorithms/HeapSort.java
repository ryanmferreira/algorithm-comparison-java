package Algorithms;

public class HeapSort {

    private char[] vector = null;
    private int heapSize = 0;

    public HeapSort(char[] vector) {
        this.vector = vector;
        this.heapSize = vector.length;
    }

    public void sort() {
        buildMaxHeap();

        for (int i = this.vector.length - 1; i > 0; i--) {
            swap(0, i);
            this.heapSize--;
            heapify(0);
        }
    }

    private void buildMaxHeap() {
        int i = (this.heapSize / 2) - 1;

        for (; i >= 0; i--) {
            heapify(i);
        }
    }

    private void heapify(int i) {
        int left = (i * 2) + 1;
        int right = (i * 2) + 2;
        int mvi = i;

        if (left < this.heapSize && this.vector[left] > this.vector[mvi]) {
            mvi = left;
        }

        if (right < this.heapSize && this.vector[right] > this.vector[mvi]) {
            mvi = right;
        }

        if (mvi != i) {
            swap(i, mvi);
            heapify(mvi);
        }
    }

    private void swap(int a, int b) {
        char aux = this.vector[a];
        this.vector[a] = this.vector[b];
        this.vector[b] = aux;
    }

    public void show() {
        for (int i = 0; i < this.vector.length; i++) {
            System.out.print(this.vector[i] + " ");
        }

        System.out.println();
    }
}