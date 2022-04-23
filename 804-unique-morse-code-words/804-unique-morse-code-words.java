class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] encoding = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        String[] list = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        String result = "";
        
        for (int i=0; i<words.length; i++) {
            String[] chars = words[i].split("");
            result = "";
            
            
            for (String s: chars) {
                for (int j=0; j<list.length; j++) {
                    if (s.equals(list[j]))
                        result = result + encoding[j];
                }
            }
                    
            map.put(result, i);
        }
        
        return map.size();
    }
}