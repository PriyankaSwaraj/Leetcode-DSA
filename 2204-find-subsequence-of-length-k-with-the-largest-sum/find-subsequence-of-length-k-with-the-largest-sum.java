class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
    PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
    for(int num:nums)
    {
        pq.add(num);
    }
     int i=0,j=0,l=k;
    int[] result=new int[k];
    ArrayList<Integer> arr=new ArrayList<>();
    while(l>0)
    {
        arr.add(pq.poll());
        l--;
    }
    while(i<k)
    {
        if(arr.contains(nums[j]))
        {
            result[i]=nums[j];
            arr.remove(Integer.valueOf(nums[j]));
            i++;
        }
        j++;
    }
    return result;
    }
}