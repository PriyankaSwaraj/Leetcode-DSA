class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
     int[] freq=new int[101];
     for(int num:nums)
     {
        freq[num]++;
     }   
     int i=1,k=0;
     while(i<target)
     {
       if(freq[i]>0)
       {
        k += freq[i];
       }
       i++;
     }
     List<Integer> arr=new ArrayList<>();
     i=freq[target];
     while(i>0)
     {
        arr.add(k++);
        i--;
     }
     return arr;
    }
}