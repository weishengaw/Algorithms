// Wei Sheng Aw
// 8/22/2020
// This program shows the functions of a linear search

import java.util.*;

public class LinearSearch {
   public static void main(String[] args) {
      int[] a1 = {10, 4, 14, 8, 11, 6, 9};
      System.out.println("a1: " + Arrays.toString(a1));
      System.out.println("linearSearch(14, a1): " + linearSearch(14, a1));
      System.out.println("linearSearch(-5, a1): " + linearSearch(-5, a1));
   }
   
   // traverses each item of the array in order and returns the index (if found)
   // pre: given target int and int array
   // post: returns index of target int (-1 if not found), array stays the same
   // complexity: O(n)
   public static int linearSearch(int val, int[] l) {
      for (int i = 0; i < l.length; i++) {
         if (val == l[i]) {
            return i;
         }
      }
      return -1;
   }
}