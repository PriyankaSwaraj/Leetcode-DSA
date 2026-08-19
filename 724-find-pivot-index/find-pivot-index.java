class Solution {
    public int pivotIndex(int[] nums) {
    int n=nums.length;
    int[] left=new int[n];
    int[] right=new int[n];
    left[0]=nums[0];
    right[n-1]=nums[n-1];
    for(int i=1,j=n-2;i<n;i++,j--)
    {
        left[i]=left[i-1]+nums[i];
        right[j]=right[j+1]+nums[j];
    }    
    if(n==1||right[1]==0)
    {
        return 0;
    }
    for(int i=1;i<n-1;i++)
    {
       if(left[i-1]==right[i+1])
       return i;
    }
    return left[n-2]==0?n-1:-1;
    }
}