class Solution {
    public int minOperations(List<Integer> nums, int k) {
    int count=0,n=nums.size();
    int[] occur=new int[51];
    for(int i=n-1;i>=0;i--)
    {
        count++;
        int num=nums.get(i);
        if(occur[num]==0)
        occur[num]=count;
    }
    int maxOccur=0;
    for(int i=1;i<=k;i++)
    {
        maxOccur=Math.max(maxOccur,occur[i]);
    }  
    return maxOccur;
    }
}