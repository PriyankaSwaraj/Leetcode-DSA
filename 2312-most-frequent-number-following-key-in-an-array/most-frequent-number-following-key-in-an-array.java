class Solution {
    public int mostFrequent(int[] nums, int key) {
     int n=nums.length;
     HashMap<Integer,Integer> map=new HashMap<>();
     for(int i=0;i<n-1;i++)
     {
        if(nums[i]==key)
        {
          map.put(nums[i+1],map.getOrDefault(nums[i+1],0)+1);
        }
     }
     ArrayList<Integer> val1=new ArrayList<>(map.values());
     ArrayList<Integer> val2=new ArrayList<>(map.keySet());
     int max=Collections.max(val1);
     int index=val1.indexOf(max);
     return val2.get(index);   
    }
}