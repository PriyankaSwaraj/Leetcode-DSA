class Solution {
    public int longestPalindrome(String s) {
     int n=s.length(),check=0;
     int[] frequency=new int[52];
     for(int i=0;i<n;i++){
        char ch=s.charAt(i);
        if(ch<='Z')
        {
            frequency[ch-65]++;
        }
        else{
            frequency[ch-71]++;
        }
     }
     int count=0;
     for(int i=0;i<52;i++)
     {  
         if(frequency[i]>0&&frequency[i]%2==0)
         {
            count += frequency[i];
        }
        else if(frequency[i]>0){
            count += frequency[i]-1;
            check=1;
        }
     }
     if(check>0)
     {
        count += 1;
     }
    return count;
    }
}