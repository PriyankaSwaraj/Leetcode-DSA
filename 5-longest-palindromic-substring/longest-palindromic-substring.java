class Solution {
    public String longestPalindrome(String s) {
     int len=0,n=s.length(),l=0,r=0;
     for(int i=0;i<n;i++)
     {
        int left=i,right=i;
        while(left>=0&&right<n&&s.charAt(left)==s.charAt(right))
        {
            if(right-left+1>len)
            {
                len=right-left+1;
                l=left;
                r=right;
            }
            left--;
            right++;
        }
        left=i;
        right=i+1;
        while(left>=0&&right<n&&s.charAt(left)==s.charAt(right))
        {
            if(right-left+1>len)
            {
                len=right-left+1;
                l=left;
                r=right;
            }
            left--;
            right++;
        }
     }   
     return s.substring(l,r+1);
    }
}