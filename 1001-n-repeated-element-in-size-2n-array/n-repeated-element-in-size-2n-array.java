class Solution {
    public int repeatedNTimes(int[] nums) {
    int n=nums.length;
    ArrayList<Integer> set=new ArrayList<>();
    for(int i=0;i<n;i++)
    {
        if(set.contains(nums[i]))
        {
            return nums[i];
        }
        set.add(nums[i]);
    }
    return 0;
    }
}