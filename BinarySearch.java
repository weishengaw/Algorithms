// Wei Sheng Aw
// 8/22/2020
// This program shows the functions of a binary search

import java.util.*;

public class BinarySearch {
   public static void main(String[] args) {
      int[] a1 = {4, 7, 10, 21, 35, 115, 255};
      System.out.println("a1: " + Arrays.toString(a1));
      System.out.println("binarySearch(21, a1): " + binarySearch(21, a1));
      System.out.println("binarySearch(22, a1): " + binarySearch(22, a1));
   }
   
   // searches the array and returns the index using a binary search
   // pre: given target int and sorted int array
   // post: returns index of target int (gives the presumed index if not found), array stays the same
   // complexity: O(lg(n))
   public static int binarySearch(int val, int[] l) {
      int start = 0; // front index
      int end = l.length - 1; // back index
      int mid = 0;
      while (start <= end) { // while there is a list to traverse
         mid = (start + end) / 2; // find the middle index (rounded down)
         if (val == l[mid]) { // if the middle index is the target value return the index
            return mid;
         }
         if (val < l[mid]) { // if the middle value is greater than the target value, shift the back value to the middle value
            end = mid - 1;
         } else { // if the middle value is less than the target value, shift the front value to the middle value
            start = mid + 1;
         }
      }
      return start; // returns presumed index
   }
}