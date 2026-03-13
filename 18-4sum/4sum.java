class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
     HashSet<List<Integer>> set=new HashSet<>();
     List<List<Integer>> result=new ArrayList<>();
     Arrays.sort(nums);
     int n=nums.length;
     for(int i=0;i<n-2;i++)
     {
        for(int j=i+1;j<n-1;j++)
        {
            long sum=nums[i]+nums[j];
          int low=j+1,high=n-1;
          while(low<high)
          {
            long val=sum+nums[low]+nums[high];
            if(val==target)
            {
              ArrayList<Integer> num=new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[low],nums[high])); 
              if(!set.contains(num))
              {
                 result.add(num);
                 set.add(num);
              }
                 low++;
                 high--;            
            }
            else if(val>target)
              {
                high--;
              }
              else{
               low++;
              }
          }
          
        }
     }
     return result;   
    }
}