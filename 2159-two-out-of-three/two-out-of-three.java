class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
     boolean[] freq=new boolean[101];
     List<Integer> arr=new ArrayList<>();
     for(int num:nums1)
     {
        freq[num]=true;
     }
     HashSet<Integer> set=new HashSet<>();
     for(int num:nums2)
     {
        if(!set.contains(num))
        {
            if(freq[num])
            {
                arr.add(num);
            }
            else{
                freq[num]=true;
            }
        }
        set.add(num);
     }
     set.clear();
     for(int num:nums3)
     {
        if(!set.contains(num))
        {
            if(freq[num])
            {
                if(!arr.contains(num))
                arr.add(num);
            }
            else{
                freq[num]=true;
            }
        }
        set.add(num);
     }
     return arr;
    }
}