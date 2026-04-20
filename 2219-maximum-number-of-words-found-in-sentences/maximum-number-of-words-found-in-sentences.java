class Solution {
    public int mostWordsFound(String[] sentences) {
    int max=0;
    for(String str:sentences)
    {
        String[] word=str.split(" ");
        max=Math.max(max,word.length);
    } 
    return max;   
    }
}