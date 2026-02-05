class Solution {
    public int[] rearrangeArray(int[] nums) {
    int positive=0,negative=1,n=nums.length;
    int[] arr=new int[n];
    for(int i=0;i<n;i++)
    {
        if(nums[i]>0)
        {
            arr[positive]=nums[i];
            positive += 2;
        }
        else{
           arr[negative]=nums[i];
           negative += 2;
        }
    }
    return arr;    
    }
}