# Linear Data Structures and Algorithms in Java

## Overview

This repository contains Java implementations of fundamental linear data structures and algorithms. The focus is on providing clear explanations, examples, and applications for various concepts in linear data structures. The topics covered include searching, sorting, linked lists, stacks, queues, recursions, object-oriented programming (OOP), and hash maps.

## Table of Contents

1. [Searching](#searching)

     - Linear Search
     - Binary Search

2. [Sorting](#sorting)

     - Bubble Sort
     - Selection Sort
     - Insertion Sort
     - Merge Sort
     - Quick Sort

3. [Linked Lists](#linked-lists)

     - Singly Linked List
     - Doubly Linked List
     - Circular Linked List

4. [Stacks](#stacks)

     - Stack Implementation
     - Applications of Stacks

5. [Queues](#queues)

     - Queue Implementation
     - Circular Queue
     - Priority Queue

6. [Recursions](#recursions)

     - Recursive Algorithms
     - Tail Recursion
     - Applications of Recursion

7. [Object-Oriented Programming (OOP)](#object-oriented-programming-oop)

     - Classes and Objects
     - Inheritance
     - Polymorphism
     - Encapsulation
     - Abstraction

8. [Hash Maps](#hash-maps)
     - HashMap Implementation
     - Applications of HashMaps

## Searching

### Linear Search

Linear search is a simple search algorithm that sequentially checks each element in a collection until a match is found.

```java
// Java implementation of Linear Search

// Linear Search on Array
public static int linearSearch(int[] arr, int target) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == target) {
            return i; // Return the index if the target is found
        }
    }
    return -1; // Return -1 if the target is not found
}

// Linear search on String
public static int linearSearch(String[] arr, String target) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i].equals(target)) {
            return i; // Return the index if the target is found
        }
    }
    return -1; // Return -1 if the target is not found
}
```

### Binary Search

Binary search is an efficient search algorithm that works on sorted arrays by repeatedly dividing the search interval in half.

```java
// Java implementation of Binary Search
public static int binarySearch(int arr[], int x) {
    int left = 0, right = arr.length - 1;
    while (left <= right) {
        int mid = left + (right - left) / 2;

        // Check if x is present at the mid
        if (arr[mid] == x)
            return mid;

        // If x greater, ignore the left half
        if (arr[mid] < x)
            left = mid + 1;

        // If x is smaller, ignore the right half
        else
            right = mid - 1;
    }
    return -1;
}
```

## Sorting

### Bubble Sort

Bubble sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order.

```java
// Java implementation of Bubble Sort
for (int i = 0; i < array.length - 1; i++) {
    for (int j = 0; j < array.length - i - 1; j++) {
        // Swap if the element found is greater than the next element
        if (arr[j] > arr[j + 1]) {
            // Swap arr[j] and arr[j + 1]
            int temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;
        }
    }
}


public static void bubbleSortOptimized(int[] arr) {
    // Optimized version of bubble sort: One way to optimize the Bubble Sort
    // algorithm is to add a flag that checks if a swap has occurred in the inner
    // loop. If no swap has occurred in a complete pass of the inner loop, it means
    // the array is already sorted and there's no need to continue with further
    // passes. This optimization makes Bubble Sort perform well on already sorted
    // (or nearly sorted) lists, reducing the time complexity to O(n) in the best
    // case.

    int n = arr.length;
    boolean swapped;

    for (int i = 0; i < n - 1; i++) {
        swapped = false;

        for (int j = 0; j < n - i - 1; j++) {
            // Swap if the element found is greater than the next element
            if (arr[j] > arr[j + 1]) {
                // Swap arr[j] and arr[j + 1]
                swapped = true;
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }

            // If no two elements were swapped by inner loop, then break
            if (swapped == false) {
                break;
            }
        }
    }
}

```

### Selection Sort

Selection sort is a simple sorting algorithm that repeatedly selects the minimum element from the unsorted portion and swaps it with the first unsorted element.

```java
// Java implementation of Selection Sort
 public static void selectionSort(int[] arr) {
    int n = arr.length;

    for (int i = 0; i < n - 1; i++) {
        int minIndex = i;

        // Find the index of the minimum element in the unsorted part
        for (int j = i + 1; j < n; j++) {
            if (arr[j] < arr[minIndex]) {
                // Update minIndex if a smaller element is found
                minIndex = j;
            }
        }

        // Swap the found minimum element with the first element in the unsorted part
        int temp = arr[minIndex];
        arr[minIndex] = arr[i];
        arr[i] = temp;
    }
}
```

### Insertion Sort

Insertion sort is a simple sorting algorithm that builds the final sorted array one item at a time.

```java
// Java implementation of Insertion Sort
public static void insertionSort(int[] arr) {
    int n = arr.length;

    for (int i = 1; i < n; i++) { // Start from the second element

        for (int j = i; j > 0; j--) { // The inner loop will run as long as j > 0
            if (arr[j] < arr[j - 1]) {
                // Swap arr[j] and arr[j - 1]
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            } else {
                // Stop the inner loop
                break;
            }
        }
    }
}

// optimizing the insertion sort algorithm by using binary search
public static void insertionSortOptimized(int[] arr) {
    int n = arr.length;

    for (int i = 1; i < n; i++) {
        int key = arr[i];
        int j = i - 1;

        // Find the index j within the sorted subset arr[0..i-1]
        // where element arr[i] belongs
        int index = Arrays.binarySearch(arr, 0, i, key);

        // If element is not found in the array, it returns
        // (-(insertion_point) - 1). So once we know the insertion point
        // we can shift elements to right and insert the element
        if (index < 0) {
            index = -1 - index;
        }

        // Shifting the elements
        while (j >= index) {
            arr[j + 1] = arr[j];
            j--;
        }
        // Insert the element at its correct position
        arr[j + 1] = key;
    }
}
```

### Merge Sort

Merge sort is a divide-and-conquer algorithm that divides the input array into two halves, recursively sorts them, and then merges the sorted halves.

```java
// Java implementation of Merge Sort
// ...
```

### Quick Sort

Quick sort is a divide-and-conquer algorithm that partitions the array into two sub-arrays and then recursively sorts the sub-arrays.

```java
// Java implementation of Quick Sort
// ...
```

## Linked Lists

### Singly Linked List

A singly linked list is a collection of nodes where each node contains data and a reference to the next node in the sequence.

```java
// Java implementation of Singly Linked List
// ...
```

### Doubly Linked List

A doubly linked list is a linked list where each node contains data and references to both the next and previous nodes in the sequence.

```java
// Java implementation of Doubly Linked List
// ...
```

### Circular Linked List

A circular linked list is a linked list where the last node points back to the first node, forming a circle.

```java
// Java implementation of Circular Linked List
// ...
```

## Stacks

### Stack Implementation

A stack is a Last In, First Out (LIFO) data structure where elements are added and removed from the same end.

```java
// Java implementation of Stack
// ...
```

### Applications of Stacks

-    Expression Evaluation
-    Function Call Management
-    Undo Mechanism

## Queues

### Queue Implementation

A queue is a First In, First Out (FIFO) data structure where elements are added at the rear and removed from the front.

```java
// Java implementation of Queue
// ...
```

### Circular Queue

A circular queue is a variation of a queue where the rear can wrap around to the front.

```java
// Java implementation of Circular Queue
// ...
```

### Priority Queue

A priority queue is a type of queue where each element is assigned a priority and elements with higher priority are served before elements with lower priority.

```java
// Java implementation of Priority Queue
// ...
```

## Recursions

### Recursive Algorithms

A recursive algorithm is an algorithm that calls itself during its execution.

```java
// Java implementation of Recursive Algorithm
// ...
```

### Tail Recursion

Tail recursion is a type of recursion where the recursive call is the last operation in the function.

```java
// Java implementation of Tail Recursion
// ...
```

### Applications of Recursion

-    Factorial Calculation
-    Fibonacci Sequence
-    Tower of Hanoi

## Object-Oriented Programming (OOP)

### Classes and Objects

Classes are blueprints for creating objects, and objects are instances of classes.

```java
// Java implementation of Class and Object
// ...
```

### Inheritance

Inheritance is a mechanism in which a new class inherits properties and behaviors from an existing class.

```java
// Java implementation of Inheritance
// ...
```

### Polymorphism

Polymorphism allows objects of different classes to be treated as objects of a common base class.

```java
// Java implementation of Polymorphism
// ...
```

### Encapsulation

Encapsulation is the bundling of data and methods that operate on the data into a single unit.

```java
// Java implementation of Encapsulation
// ...
```

### Abstraction

Abstraction is the process of hiding the implementation details and showing only the necessary features of an object.

```java
// Java implementation of Abstraction
// ...
```

## Hash Maps

### HashMap Implementation

A HashMap is a data structure that stores key-value pairs and allows fast retrieval of values based on their keys.

```java
// Java implementation of HashMap
// ...
```

### Applications of HashMaps

-    Caching
-    Frequency Counting
-    Indexing

## Conclusion

This repository serves as a comprehensive guide to linear data structures and algorithms in Java. Each topic includes clear explanations, code examples, and applications to help you understand and implement these concepts in your projects. Feel free to explore the provided code and adapt it to your specific needs. Happy coding!
