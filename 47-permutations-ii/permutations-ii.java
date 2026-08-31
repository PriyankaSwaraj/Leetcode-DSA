class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
    ArrayList<List<Integer>> result=new ArrayList<>();
    ArrayList<Integer> curr=new ArrayList<>();
    ArrayList<Integer> arr=new ArrayList<>();
    for(int num:nums)
    {
        arr.add(num);
    }
    recur(arr,curr,result);
    return result;    
    }
    public void recur( ArrayList<Integer> nums, ArrayList<Integer> curr,ArrayList<List<Integer>> result)
    {
        if(nums.size()==0)
        {
            if(!result.contains(curr))
            {
                result.add(new ArrayList<>(curr));
            }
            return;
        }
        int n=nums.size();
        for(int i=0;i<n;i++)
        {
            int a=nums.get(i);
            curr.add(a);
            nums.remove(i);
            recur(nums,curr,result);
            nums.add(i,a);
            curr.remove(curr.size()-1);
        }
    }
}