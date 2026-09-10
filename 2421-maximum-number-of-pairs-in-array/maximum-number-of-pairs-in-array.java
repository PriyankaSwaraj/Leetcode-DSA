class Solution {
    public int[] numberOfPairs(int[] nums) {
     int[] freq=new int[101];
     int pair=0,n=nums.length;
     for(int num:nums)
     {
        freq[num]++;
     }
     for(int i=0;i<=100;i++)
     {
        pair += freq[i]/2;
     }
     return new int[]{pair,n-(pair*2)};
    }
}