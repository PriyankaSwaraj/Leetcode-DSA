class Solution {
    public List<Integer> findDuplicates(int[] nums) {
       ArrayList<Integer> arr = new ArrayList<Integer>();
       HashSet< Integer> set=new HashSet<>();
       for(int num : nums)
       {
        if(set.contains(num))
        {
            arr.add(num);
        }
        set.add(num);
       }
       return arr;
    }
}