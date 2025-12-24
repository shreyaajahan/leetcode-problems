class Solution {
    public String reverseWords(String s) {
    String[] words = s.split(" ");
    String result = "";

    for(int i=words.length-1;i>=0;i--)
    {
        if (words[i].length() == 0) continue;
        if (result.length() == 0)
                result = words[i];
        else result=result+" "+words[i];
        //if(i!=0) result+=" ";
    }
    return result;
    }
}