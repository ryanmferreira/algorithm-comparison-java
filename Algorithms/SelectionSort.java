package Algorithms;

public class SelectionSort {
    private char[] array = null;
    private int size = 0;

    public SelectionSort(char[] array) {
        this.array = array;
        this.size = array.length;
    }

    private void swap(int a, int b) {
        char aux = this.array[a];
        this.array[a] = this.array[b];
        this.array[b] = aux;
    }

    public void sort() {
        for (int y = 0; y < size - 1; y++) {
            for (int x = y + 1; x < size; x++) {
                if (this.array[y] > this.array[x]) {
                    swap(x, y);
                }
            }
        }
    }

    public void show() {
        for (int i = 0; i < this.size; i++) {
            System.out.print(this.array[i] + " ");
        }
        
        System.out.println();
    }
}
