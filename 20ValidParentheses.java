class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        
        Stack<Character> stack = new Stack();
        
        for (Character bracket: s.toCharArray()) {
            if (map.containsKey(bracket)) {
                Character top = stack.isEmpty() ? 'X' : stack.peek();
                
                if (top != map.get(bracket)) {
                    return false;
                }
                
                // ], [
                
                stack.pop();
            } else {
                stack.push(bracket);
            }
        }
        
        return stack.isEmpty();
    }
}
