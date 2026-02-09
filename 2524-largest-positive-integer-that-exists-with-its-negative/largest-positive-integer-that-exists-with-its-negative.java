class Solution {
    public int findMaxK(int[] nums) {
    int n=nums.length,max=-1;
    ArrayList<Integer> arr=new ArrayList<>();
    for(int i=0;i<n;i++)
    {
        arr.add(nums[i]);
    }    
    for(int i=n-1;i>=0;i--)
    {
        if(arr.contains((-1)*arr.get(i)))
        {
            max=Math.max(max,arr.get(i));
        }
    }
    return max;
    }
}