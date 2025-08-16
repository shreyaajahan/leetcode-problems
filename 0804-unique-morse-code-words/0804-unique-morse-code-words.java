class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String morse[] = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> ss = new HashSet<String>();
        for(String word:words)
        {
            StringBuilder sb = new StringBuilder();
            for(char ch:word.toCharArray())
            {
                sb.append(morse[ch-'a']);
            } 
            ss.add(sb.toString());  
        }
        return ss.size();
    }
}