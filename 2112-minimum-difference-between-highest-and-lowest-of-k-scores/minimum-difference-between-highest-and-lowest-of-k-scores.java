class Solution {
    public int minimumDifference(int[] nums, int k) {
     Arrays.sort(nums);
     int n=nums.length,max=Integer.MAX_VALUE;
     for(int i=0;i<=n-k;i++)
     {
         ArrayList<Integer> arr= new ArrayList<Integer>();
        int l=k,m=i;
        while(l>0)
        {
          arr.add(nums[m]);
          m++;
          l--;
        }
        Collections.sort(arr);
        max=Math.min(max,arr.get(k-1)-arr.get(0));
     }
     return max;
    }
}