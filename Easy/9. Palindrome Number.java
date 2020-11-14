/** Runtime: 7 ms, faster than 66.00% of Java online submissions for Palindrome Number.
* Memory Usage: 38.3 MB, less than 79.30% of Java online submissions for Palindrome Number. */

class Solution {
   public static boolean isPalindrome(int x) {
       
      int count = 0;
      int num = x;
      boolean palindrome = false;
        
      if (x < 0) {
         return false; // return false if negative.
      }
      // Count number of digits.
      else {
         int numCalc = num;
         while(numCalc > 0) {
            numCalc = numCalc / 10;
            count++;
         }
         // Create array and put the digit into it broken up.
         int numToArray[] = new int[count];
         int numCalc2 = num;
         int count2 = count;
         while(numCalc2 > 0) {
            count2--;
            numToArray[count2] = numCalc2 % 10;
            numCalc2 = numCalc2 / 10;
         }
          
         if (count == 1 || count == 0) {
             return true;
         }

         for (int i = 0; i < numToArray.length / 2; i++) {
            if (numToArray[i] == numToArray[numToArray.length - 1 - i]) {
               palindrome = true;
            }
            else {
               return palindrome = false;
            }
         }

         return palindrome;
      }
   }
}
