class Solution {
    // INT_MAX -> 2,147,483,647
    // x = 1,999,999,999
    // rev = 9, 999, 999, 991
    public boolean isPalindrome(int x) {
        // when x = 0
        if (x == 0) {
            return true;
        }
        
        // when x is negative
        if (x < 0) {
            return false;
        }
        
        // when x is divisble by 10
        if (x % 10 == 0) {
            return false;
        }
        
        // 90 -> 9
        
        int rev = 0;
        while (x > rev) {
            rev = rev * 10 + (x % 10);
            x = x / 10;
        }
        
        return x == rev || x == (rev / 10);
    }
}
