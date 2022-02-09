class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        
        if (needle.length() > haystack.length()) {
            return -1;
        }
        
        int i = 0;
        
        while (i < haystack.length()) {
            if (i + needle.length() > haystack.length()) {
                break;
            }
            
            int j = 0;
            
            while (j < needle.length()) {
                if (needle.charAt(j) != haystack.charAt(i + j)) {
                    break;
                }
                
                j += 1;
            }
            
            if (j == needle.length()) {
                return i;
            }
            
            i += 1;
        }
        
        return -1;
    }
}
