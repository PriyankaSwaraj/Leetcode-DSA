class Solution {
    public String shiftingLetters(String s, int[] shifts) {

    int n=s.length();   
    int[] pre=new int[n];
    int sum=0;

    for(int i=0;i<n;i++)
    {
        shifts[i]= shifts[i]%26;
        sum += shifts[i];
    }

    StringBuilder sb=new StringBuilder();
    int nu=(s.charAt(0)-'a'+sum)%26;
    sb.append((char)(nu+'a'));

    for(int i=1;i<n;i++)
    {
        sum -= shifts[i-1];
        int num=(s.charAt(i)-'a'+sum)%26;
        sb.append((char)(num+'a'));
    }
    
    return sb.toString();
    }
}