package Algorithms;

public class BubbleSort {
    private char[] array = null;
    private int size = 0;

    public BubbleSort(char[] array) {
        this.array = array;
        this.size = array.length;
    }

    private void swap(int a, int b) {
        char aux = this.array[a];
        this.array[a] = this.array[b];
        this.array[b] = aux;
    }

    public void sort() {
        boolean changed = true;
        // Otimização: reduz o escopo a cada passada, pois o maior elemento "flutua"
        // para o fim
        int currentSize = this.size;

        while (changed) {
            changed = false;
            for (int i = 0; i < currentSize - 1; i++) {
                if (this.array[i] > this.array[i + 1]) {
                    this.swap(i, i + 1);
                    changed = true;
                }
            }
            currentSize--;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.size; i++) {
            sb.append("\n").append(i).append(".\t").append(this.array[i]);
        }
        return sb.toString();
    }

    public void show() {
        for (int i = 0; i < this.size; i++) {
            System.out.print(this.array[i] + " ");
        }
        System.out.println();
    }
}