package Algorithms;

public class InsertionSort {
    private char[] array = null;
    private int size = 0;

    public InsertionSort(char[] array) {
        this.array = array;
        this.size = array.length;
    }

    public void sort() {
        for (int i = 1; i < this.size; i++) {
            char aux = this.array[i];
            int j = i;

            while ((j > 0) && (this.array[j - 1] > aux)) {
                this.array[j] = this.array[j - 1];
                j -= 1;
            }

            this.array[j] = aux;
        }
    }

    public void show() {
        for (int i = 0; i < this.size; i++) {
            System.out.print(this.array[i] + " ");
        }
       
        System.out.println();
    }
}