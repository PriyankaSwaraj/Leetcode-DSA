class Solution {
    public int minimumPairRemoval(int[] nums) {
    int n=nums.length,count=0;
    ArrayList<Integer> arr=new ArrayList<>();
    for(int i=0;i<n;i++)
    {
        arr.add(nums[i]);
    }
    int l=0;
    while(!isSorted(arr)){
        int sum=Integer.MAX_VALUE;
        int k=0,m=arr.size();
        for(int i=0;i<m-1;i++)
        {
          if(sum>arr.get(i)+arr.get(i+1)){
            k=i;
            sum=arr.get(i)+arr.get(i+1);
          }
        }
        arr.remove(k);
        arr.set(k,sum);
        count++;
    }
    return count;
    }
    public boolean isSorted(ArrayList<Integer> arr)
    {
        int n=arr.size();
        for(int i=1;i<n;i++)
        {
            if(arr.get(i)<arr.get(i-1))
            {
                return false;
            }
        }
        return true;
    }
}