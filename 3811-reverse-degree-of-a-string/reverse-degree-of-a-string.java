class Solution {
    public int reverseDegree(String s) {
    int count=0,n=s.length();
    for(int i=0;i<n;i++)
    {
        int num='a'-s.charAt(i)+26;
        count += num*(i+1);
    }    
    return count;
    }
}