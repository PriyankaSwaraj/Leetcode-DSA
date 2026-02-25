class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
     boolean[] freq1=new boolean[101];
     boolean[] freq2=new boolean[101];
     boolean[] freq3=new boolean[101];
     List<Integer> arr=new ArrayList<>();
     for(int num:nums1)
     {
        freq1[num]=true;
     }
     for(int num:nums2)
     {
        freq2[num]=true;
     }
     for(int num:nums3)
     {
        freq3[num]=true;
     }
     for(int i=1;i<101;i++)
     {
      if(freq1[i]&&freq2[i]||freq2[i]&&freq3[i]||freq1[i]&&freq3[i])
      {
        arr.add(i);
      }
     }
     return arr;
    }
}