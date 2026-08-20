class Solution {
    public boolean divideArray(int[] nums) {
    int n=nums.length;
    int[] freq=new int[501];
    for(int num:nums)
    {
        freq[num]++;
    }    
    for(int num:nums)
    {
        if((freq[num]%2)!=0)
        {
            return false;
        }
    }
    return true;
    }
}