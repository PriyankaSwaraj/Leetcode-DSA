class Solution {
    public List<Integer> findMissingElements(int[] nums) {
     int[] freq=new int[101];
     int n=nums.length,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
     List<Integer> list=new ArrayList<>();
     for(int num: nums)
     {
       max=Math.max(max,num);
       min=Math.min(min,num);
       freq[num]++;
     }   
    for(int i=min+1;i<max;i++)

    {
        if(freq[i]==0)
        {
            list.add(i);
        }
    }
    return list;
    }
}