class Solution {
    public int mostFrequent(int[] nums, int key) {
     int[] freq=new int[10001];
     int n=nums.length;
     for(int i=0;i<n-1;i++)
     {
        if(nums[i]==key)
        {
            freq[nums[i+1]]++;
        }
     }
     int max=0,val=0;
    for(int i=0;i<10001;i++)
    {
        if(freq[i]>max)
        {
            max=freq[i];
            val=i;
        }
    }   
     return val;
    }
}