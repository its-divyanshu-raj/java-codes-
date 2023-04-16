/* Given an integer x, return true if x is a 
palindrome
, and false otherwise.
Example 1:
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:
Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
Constraints:
-231 <= x <= 231 - 1 */

class Solution {
    public boolean isPalindrome(int X) {
      

        if(X==0) {
        return true;
        }

        if(X<0 || X%10==0) {
        return false;   
        }
        int Temp = X;
        int rev = 0;
        while(Temp != 0) {
        int rem = Temp %10 ;
        Temp = Temp/10;

        rev = rev*10+ rem ;

        }
        if(X == rev) {
        return true;
        }
        else { 
        return false;
    }

}

}
