// Wei Sheng Aw
// 8/22/2020
// This program shows the functions of a counting sort

import java.util.*;

public class CountingSort {
   public static void main(String[] args) {
      int[] a1 = {10, 4, 14, 8, 11, 6, 9};
      System.out.println("a1: " + Arrays.toString(a1));
      System.out.println("countingSort(a1)... ");
      countingSort(a1);
      System.out.println("updated a1: " + Arrays.toString(a1));
   }
   // sorts the array using counting sort
   // pre: given an unsorted array
   // post: unsorted array changed to sorted array
   // complexity: O(n + k) where n is the number of items and k is the number of possible values
   public static void countingSort(int[] l) {
      // initializes sorted map
      TreeMap<Integer, Integer> aux = new TreeMap<>();
      // counts how many of each integer are in the array
      for (int i : l) {
         if (aux.containsKey(i)) {
            aux.replace(i, aux.get(i) + 1);
         } else {
            aux.put(i, 1);
         }
      }
      // takes each key in the map and uses the count of the key to reassemble the array
      int i = 0;
      while (aux.size() > 0) {
         int value = aux.firstKey();
         for (int j = 0; j < aux.get(value); j++) {
            l[i] = value;
            i++;
         }
         aux.remove(value);
      }
   }
}