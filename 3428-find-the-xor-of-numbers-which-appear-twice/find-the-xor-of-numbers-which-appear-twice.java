class Solution {
    public int duplicateNumbersXOR(int[] nums) {
     int num=0;
     int[] freq=new int[51];
     for(int number:nums)
     {
        if(freq[number]>0)
        {
            num ^= number;
        }
        freq[number]++;
     }
     return num;
    }
}