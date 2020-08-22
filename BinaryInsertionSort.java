// Wei Sheng Aw
// 8/22/2020
// This program shows the functions of a binary insertion sort
// Note: BinarySearch.java must also be downloaded, as this sort utilizes binary search

import java.util.*;

public class BinaryInsertionSort {
   public static void main(String[] args) {
      int[] a1 = {10, 4, 14, 8, 11, 6, 9};
      System.out.println("a1: " + Arrays.toString(a1));
      System.out.println("binaryInsertionSort(a1)... ");
      binaryInsertionSort(a1);
      System.out.println("updated a1: " + Arrays.toString(a1));
   }
   // sorts the array using binary insertion sort
   // pre: given an unsorted array
   // post: unsorted array changed to sorted array
   // complexity: O(n log n) compares, O(n^2) swaps
   public static void binaryInsertionSort(int[] l) {
      int pointer = 1; // defines how big the sorted array section is, and points towards the current index of interest
      while (pointer < l.length) { // loops through the entire array
         int current = l[pointer]; // stores current value at pointer
         int i = BinarySearch.binarySearch(current, Arrays.copyOfRange(l, 0, pointer + 1)); // finds insertion point for current value
         for (int j = pointer; j > i; j--) { // moves elements up towards pointer
            l[j] = l[j - 1];
         }
         l[i] = current; // places current value at insertion point
         pointer++; // advances pointer
      }
   }
}