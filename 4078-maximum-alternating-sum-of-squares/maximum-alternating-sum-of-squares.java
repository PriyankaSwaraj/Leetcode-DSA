class Solution {
    public long maxAlternatingSum(int[] nums) {
       PriorityQueue<Integer> pq=new PriorityQueue<>();
       for(int num:nums)
       {
        pq.add(num*num);
       }
       int n=nums.length/2;
       long diff=0,ans=0;
       while(n>0)
       {
        diff += pq.poll();
        n--;
       }
       while(!pq.isEmpty())
       {
        ans += pq.poll();
       }
       return ans-diff;
    }
}