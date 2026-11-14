class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int min=Integer.MAX_VALUE,n=nums.size();
        for(int i=0;i<n;i++)
        {
            int m=0;
            for(int j=i;j<n;j++)
            {
                int len=j-i+1;
                m += nums.get(j);
               if(len>=l&&len<=r&&m>0)
               {
                min=Math.min(min,m);
               }
           }
        }
        return min==Integer.MAX_VALUE?-1:min;
    }
}