class Solution {
    public void sortColors(int[] nums) {
    int n = nums.length;
    int[] arr = new int[3];
    for(int i=0;i<n;i++)
    {
        arr[nums[i]]++;
    }
    int k=0;
    for(int i=0;i<n;i++)
    {
        while(arr[k]>0)
        {
          nums[i]=k;
          i++;
          arr[k]--;
        }
        i--;
        k++;
    }
    }
}