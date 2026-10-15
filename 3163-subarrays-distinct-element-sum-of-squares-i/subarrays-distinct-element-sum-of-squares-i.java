class Solution {
    public int sumCounts(List<Integer> nums) {
      int sum=0,n=nums.size();
      for(int i=0;i<n;i++)
      {
        HashSet<Integer> set=new HashSet<>();
        for(int j=i;j<n;j++)
        {
            set.add(nums.get(j));
            sum += (int)Math.pow(set.size(),2);
        }
      }
      return sum;
    }
}