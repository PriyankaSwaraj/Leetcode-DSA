class Solution {
    public List<List<Integer>> subsets(int[] nums) {
    int n= nums.length;
    int m=(int)Math.pow(2,n);
    ArrayList<List<Integer>> result=new ArrayList<>();
    for(int i=0;i<m;i++)
    {
        int num=i;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int j=0;j<n;j++)
        {
            if((num&1)==1)
            {
               arr.add(nums[j]);
            }
            num =num>>1;
        }
        result.add(new ArrayList<>(arr));
    }   
    return result;
    }
}