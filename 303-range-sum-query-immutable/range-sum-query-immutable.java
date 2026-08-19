class NumArray {
    int[] num;
    public NumArray(int[] nums) {
    int n=nums.length;
    num=new int[n];
    if(n==0)
    {
        return;
    }
    num[0]=nums[0];
    for(int i=1;i<n;i++)
    {
      num[i]=nums[i]+num[i-1]; 
    }    
    }
    
    public int sumRange(int left, int right) {
    return left>0?num[right]-num[left-1]:num[right];   
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */