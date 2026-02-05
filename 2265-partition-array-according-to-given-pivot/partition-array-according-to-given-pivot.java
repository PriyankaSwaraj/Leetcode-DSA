class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
       int index=0,n=nums.length;
       int[] arr=new int[n];
       for(int i=0;i<n;i++)
       {
        if(nums[i]<pivot)
        {
            arr[index]=nums[i];
            index++;
        }
       }
       for(int i=0;i<n;i++)
       {
        if(nums[i]==pivot)
        {
            arr[index]=nums[i];
            index++;
        }
       }
       for(int i=0;i<n;i++)
       {
        if(nums[i]>pivot)
        {
            arr[index]=nums[i];
            index++;
        }
       }
        return arr;
    }
}