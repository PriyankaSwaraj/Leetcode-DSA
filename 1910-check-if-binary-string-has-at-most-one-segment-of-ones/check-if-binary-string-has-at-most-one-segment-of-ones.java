class Solution {
    public boolean checkOnesSegment(String s) {
     int count=0,n=s.length();
     boolean check=s.charAt(0)=='1';
     for(int i=1;i<n;i++)
     {
        if(s.charAt(i)!=s.charAt(i-1))
        {
            count++;
        }
        if(s.charAt(i)=='1')
        {
            check=true;
        }
     } 
     if(count==0&&check)
     {
        return true;
     }
     return count==1;
    }
}