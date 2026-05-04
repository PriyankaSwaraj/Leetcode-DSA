class Solution {
    public String truncateSentence(String s, int k) {
     String result="";
     for(String str:s.split(" "))
     {
        result += str;
        if(k<=1)
        break;
        result += " ";
        k--;
     }   
     return result;
    }
}