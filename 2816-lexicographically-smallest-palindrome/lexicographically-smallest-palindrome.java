class Solution {
    public String makeSmallestPalindrome(String s) {
    StringBuilder sb=new StringBuilder(s);
    int n=s.length();
    for(int i=0,j=n-1;i<n/2;i++,j--)
    {
        char ch1=s.charAt(i),ch2=s.charAt(j);
        if(ch1<ch2)
        {
           sb.setCharAt(j,ch1);
        }
        else if(ch1>ch2)
        {
            sb.setCharAt(i,ch2);
        }
    }    
    return sb.toString();
    }
}