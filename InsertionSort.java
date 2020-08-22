// Wei Sheng Aw
// 8/22/2020
// This program shows the functions of an insertion sort

import java.util.*;

public class InsertionSort {
   public static void main(String[] args) {
      int[] a1 = {10, 4, 14, 8, 11, 6, 9};
      System.out.println("a1: " + Arrays.toString(a1));
      System.out.println("insertionSort(a1)... ");
      insertionSort(a1);
      System.out.println("updated a1: " + Arrays.toString(a1));
   }
   // sorts the array using insertion sort
   // pre: given an unsorted array
   // post: unsorted array changed to sorted array
   // complexity: O(n^2)
   public static void insertionSort(int[] l) {
      int pointer = 1; // defines how big the sorted list is, index for current sorting value
      while (pointer < l.length) { // runs until the pointer reaches the end
         int current = l[pointer]; // sets current value to the value at pointer
         int i = 0;
         while (i < pointer && current > l[i]) { // finds the index of current value
            i++;
         }
         for (int j = pointer; j > i; j--) { // swaps values away from the found index to pointer
            l[j] = l[j - 1];
         }
         l[i] = current; // sets the found index to the current value
         pointer++; // advances pointer
      }
   }
}