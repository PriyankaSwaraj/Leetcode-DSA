class Solution {
    public int[] shuffle(int[] nums, int n) {
    int m=nums.length;
    int[] arr=new int[m];
    int k=0;
    int count=0;
    for(int i=0;i<n;i++)
    {
      arr[k]=nums[i];
      arr[k+1]=nums[n+count];
      k +=2;
      count++;
    }
     return arr;
    }
}