class Solution {
    public int missingInteger(int[] nums) {
    int n=nums.length,val=0,i=0;
    HashSet<Integer> set=new HashSet<>();
    while(i<n-1&&nums[i]+1==nums[i+1])
    {
        set.add(nums[i]);
       val += nums[i];
       i++;
    }
    val += nums[i];
    while(i<n)
    {
        set.add(nums[i]);
        i++;
    }
    while(set.contains(val))
    {
        val++;
    }
    return val;  
    }
}