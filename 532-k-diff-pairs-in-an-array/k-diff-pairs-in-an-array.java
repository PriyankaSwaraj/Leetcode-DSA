class Solution {
    public int findPairs(int[] nums, int k) {
     int count=0;
     ArrayList<Integer> arr=new ArrayList<>();
     HashMap<Integer,Integer> set=new HashMap<Integer,Integer>();
     for(int num : nums)
     {
        arr.add(num);
     }
     for(int num : nums)
     {
        arr.remove(Integer.valueOf(num));
        if(arr.contains(num-k))
        {
         arr.remove(Integer.valueOf(num-k));
          set.put(num,num-k);
        }
        arr.add(num);
     }
     return set.size();  
    }
}