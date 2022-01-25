class Solution {
    public String getCommonPrefix(String s1, String s2) {
        if (s2.length() < s1.length()) {
            return getCommonPrefix(s2, s1);
        }
        
        
        // "", "apple"
        if (s1.length() == 0 || s2.length() == 0) {
            return "";
        }
        
        int i = 0;
        
        while (i < s1.length()) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return s1.substring(0, i);
            }
            i += 1;
        }
        
        return s1;
    }
    
    public String longestCommonPrefix(String[] strs) {
        if (strs == null) {
            return "";
        }
        
        if (strs.length == 0) {
            return "";
        }
        
        String prefix = strs[0];
        
        for (int i = 1; i < strs.length; i += 1) {
            prefix = getCommonPrefix(prefix, strs[i]);
        }
        
        return prefix;
    }
}
