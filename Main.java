import java.io.BufferedReader;
import java.io.FileReader;

import java.io.IOException;

import Algorithms.BubbleSort;
import Algorithms.HeapSort;
import Algorithms.InsertionSort;
import Algorithms.QuickSort;
import Algorithms.SelectionSort;

public class Main {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java Algorithms <file_path> <algorithm_number>");
            System.out.println(
                    "\nHelp: 1 - Bubble Sort\n2 - Insertion Sort\n3 - Selection Sort\n4 - Quick Sort\n5 - Heap Sort");
            return;
        }

        String path = args[0];
        int algorithmNumber = Integer.parseInt(args[1]);
        char[] vector;

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            String str = bufferedReader.readLine();
            bufferedReader.close();

            if (str != null) {
                String[] letters = str.split(", ");

                int size = letters.length;
                vector = new char[size];

                for (int i = 0; i < size; i++) {
                    vector[i] = letters[i].charAt(0);
                }
            } else {
                System.out.println("The file is empty.");
                return;
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
            return;
        }

        char[] v = vector.clone();
        long start;
        long end;

        switch (algorithmNumber) {
            case 1:
                BubbleSort bubble = new BubbleSort(v);
                start = System.nanoTime();
                bubble.sort();
                end = System.nanoTime();
                bubble.show();
                CountTime("Bubble Sort", start, end);
                break;
            case 2:
                InsertionSort insertion = new InsertionSort(v);
                start = System.nanoTime();
                insertion.sort();
                end = System.nanoTime();
                insertion.show();
                CountTime("Insertion Sort", start, end);
                break;
            case 3:
                SelectionSort selection = new SelectionSort(v);
                start = System.nanoTime();
                selection.sort();
                end = System.nanoTime();
                selection.show();
                CountTime("Selection Sort", start, end);
                break;
            case 4:
                QuickSort quickSort = new QuickSort(v);
                start = System.nanoTime();
                quickSort.sort();
                end = System.nanoTime();
                quickSort.show();
                CountTime("Quick Sort", start, end);
                break;
            case 5:
                HeapSort heapSort = new HeapSort(v);
                start = System.nanoTime();
                heapSort.sort();
                end = System.nanoTime();
                heapSort.show();
                CountTime("Heap Sort", start, end);
                break;
            default:
                System.out.println("Invalid algorithm number.");
        }
    }

    public static void CountTime(String algorithmName, long start, long end) {
        double ms = (end - start) / 1000000.0;
        double s = (end - start) / 1000000000.0;
        System.out.println(algorithmName + " time in ms: " + ms + "ms");
        System.out.println(algorithmName + " time in s: " + s + "s");
    }
}