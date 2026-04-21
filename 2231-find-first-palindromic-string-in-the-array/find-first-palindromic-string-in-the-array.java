class Solution {
    public String firstPalindrome(String[] words) {
     for(String str:words)
     {
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        if(str.equals(sb.toString()))
        return str;
     }  
     return ""; 
    }
}