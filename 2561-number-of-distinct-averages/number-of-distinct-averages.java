class Solution {
    public int distinctAverages(int[] nums) {
     HashSet<Float> set=new HashSet<>();
     ArrayList<Integer> arr=new ArrayList<>();
     for(int num : nums)
     {
        arr.add(num);
     }   
     while(arr.size()>1)
     {
        int max=Collections.max(arr);
        int min=Collections.min(arr);
        set.add((float)(max+min)/2);
        arr.remove(arr.indexOf(max));
        arr.remove(arr.indexOf(min));
     }
     return set.size();
    }
}