class Solution {
    public int lengthOfLastWord(String s) {
        int right = s.length() - 1;
        
        // consume the trailing spaces
        while (right >= 0 && s.charAt(right) == ' ') {
            right -= 1;
        }
        
        int size = 0;
        
        while (right >= 0 && s.charAt(right) != ' ') {
            right -= 1;
            size += 1;
        }
        
        return size;
    }
}
