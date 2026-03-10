class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
     Set<List<Integer>> set=new HashSet<>();
     Arrays.sort(nums);
     int n=nums.length;
     for(int i=0;i<n-1;i++)
     {
        int low=i+1,high=n-1;
        while(low<high)
        {
            int sum=nums[i]+nums[low]+nums[high];
            if(sum==0)
            {
                set.add(Arrays.asList(nums[i],nums[low],nums[high]));
                low++;
                high--;
            }
            else if(sum>0)
            {
                high--;
            }
            else{
                low++;
            }
        }
     }
     List<List<Integer>> arr=new ArrayList<>(set);
     return arr;
    }
}