class Solution {
    public int findMaxLength(int[] nums) {
    int n=nums.length,maxlen=0;
    for(int i=0;i<n;i++)
    {
        if(nums[i]==0)
        {
            nums[i]=-1;
        }
    }
    int prefix=0;
    HashMap<Integer,Integer> map=new HashMap<>();
    for(int i=0;i<n;i++)
    {
      prefix += nums[i];
      if(prefix==0)
      {
        maxlen=Math.max(maxlen,i+1);
      }
      if(map.containsKey(prefix))
      {
        maxlen=Math.max(maxlen,i-map.get(prefix));
        continue;
      }
      map.put(prefix,i);
    }
    return maxlen;
    }
}