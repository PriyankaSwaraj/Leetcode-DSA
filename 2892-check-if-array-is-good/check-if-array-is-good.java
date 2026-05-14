class Solution {
    public boolean isGood(int[] nums) {
    int[] count=new int[201];
    int max=0;
    for(int num:nums)
    {
        count[num]++;
        max=Math.max(num,max);
    }
    for(int i=1;i<max;i++)
    {
        if(count[i]!=1)
        return false;
    }
    return count[max]==2;
    }
}