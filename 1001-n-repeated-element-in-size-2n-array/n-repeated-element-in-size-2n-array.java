class Solution {
    public int repeatedNTimes(int[] nums) {
    int n=nums.length;
    int[] freq=new int[100001];
    for(int i=0;i<n;i++)
    {
        freq[nums[i]]++;
        if(freq[nums[i]]>1)
        {
            return nums[i];
        }
    }    
    return 0;
    }
}