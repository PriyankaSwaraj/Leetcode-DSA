class Solution {
    public int searchInsert(int[] nums, int target) {
     int n=nums.length;
     int left=0,right=n-1,res=n;
     while(left<=right)
     {
        int mid=(left+right)/2;
        if(nums[mid]==target)
        {
            return mid;
        }
        else if(nums[mid]>target)
        {
            right=mid-1;
            res=mid;
        }
        else{
            left=mid+1;
        }
     } 
     return res;
    }
}