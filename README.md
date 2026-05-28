# Algorithms Comparison

## Environment

- **Java Version:** 26.0.1 (2026-04-31)
- **Runtime:** OpenJDK Runtime Environment (build 26.0.1)
- **VM:** OpenJDK 64-Bit Server VM
- **Linux Kernel Version:** 7.0.10-1-cachyos (64-bit)

---

### File structure

```bash
.
├── Algorithms
│   ├── BubbleSort.java
│   ├── HeapSort.java
│   ├── InsertionSort.java
│   ├── QuickSort.java
│   └── SelectionSort.java
├── Data
│   ├── 1000000.txt
│   ├── 100000.txt
│   ├── 10000.txt
│   ├── 1000.txt
│   ├── 100.txt
│   └── 10.txt
├── Docs
│   ├── AlgorithmsComparison.xlsx
│   └── ResultsAnalysis.docx
├── Main.java
├── README.md
└── Tools
    └── Write.java

5 directories, 16 files
```

---

## How to Run

### 1. Generate Data Files

The `Tools/Write.java` script generates input data files containing random characters. It accepts the total number of elements as a command-line argument:

```bash
java Tools/Write.java 10000
```

### 2. Run the Sorting Algorithms Comparison

Execute the `Main.java` class by passing the target file path followed by the specific algorithm index number:

```bash
java Main.java Data/10000.txt <algorithm_number>
```

#### Algorithm Index Mapping

- **1:** Bubble Sort
- **2:** Insertion Sort
- **3:** Selection Sort
- **4:** Quick Sort
- **5:** Heap Sort

*Example running Heap Sort over 10,000 elements:*

```bash
java Main.java Data/10000.txt 5
```

*Note: For large scale datasets (e.g., 1,000,000 elements), it is highly recommended to increase the JVM stack size to prevent StackOverflow errors within recursive algorithms like Quick Sort:*

```bash
java -Xss4m Main.java Data/1000000.txt 4
```
