class Solution {
    public int countElements(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length,i=1;
        while(i<n&&nums[i]==nums[i-1])
        {
            n--;
            i++;
        }
        int j=nums.length-1;
        while(n>1&&nums[j]==nums[j-1]&&j>0)
        {
            n--;
            j--;
        }
        if(n-2<0)
        {
            return 0;
        }
    return n-2;    
    }
}