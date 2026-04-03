class Solution {
    public int maxFrequencyElements(int[] nums) {
    int[] freq=new int[101];
    int maxi=0;
    for(int num:nums)
    {
        freq[num]++;
        maxi=Math.max(maxi,freq[num]);
    } 
    int count=0;
    for(int i=1;i<101;i++)
    {
        if(freq[i]==maxi)
        {
            count += maxi;
        }
    }   
    return count;
    }
}