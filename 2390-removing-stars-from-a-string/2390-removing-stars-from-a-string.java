class Solution {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> res = new Stack<>();
        for(char ch:s.toCharArray())
        {
            if(ch!='*') res.push(ch);
            else res.pop();
        }
        for(char ch:res)
        {
            sb.append(ch);
        }
        return sb.toString();
    }
}