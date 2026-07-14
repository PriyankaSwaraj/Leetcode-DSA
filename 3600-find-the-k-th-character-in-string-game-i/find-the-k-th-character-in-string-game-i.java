class Solution {
    public char kthCharacter(int k) {
    StringBuilder sb=new StringBuilder("a");
    while(sb.length()<k) 
    {
        int n=sb.length();
     for(int i=0;i<n;i++)
     {
        int c=sb.charAt(i)-65;
        char ch=(char)(c+66);
        sb.append(ch);
     }
    }  
    return sb.charAt(k-1);
    }
}