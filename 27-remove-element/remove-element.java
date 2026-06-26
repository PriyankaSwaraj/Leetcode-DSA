class Solution {
    public int removeElement(int[] nums, int val) {
       int k=0,count =0;
        for(int i =0;i<nums.length;i++)
        {
            if(nums[i]==val)
            {
                count++;
            }
                if(nums[i]!=val)
                {
                 int a = nums[i];
                 nums[i] = nums[k];
                 nums[k] =a;  
                 k++; 
                }
           
        }
       return nums.length-count;

    }
}