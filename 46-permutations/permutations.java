class Solution {
    public List<List<Integer>> permute(int[] nums) {
    ArrayList<Integer> nu=new ArrayList<>();
    for(int num:nums)
    {
        nu.add(num);
    }    
    ArrayList<Integer> arr=new ArrayList<>();
    ArrayList<List<Integer>> mat=new ArrayList<>();
    recur(nu,arr,mat);
    return mat;
    }
    public void recur(ArrayList<Integer> nums,ArrayList<Integer> arr,List<List<Integer>> mat)
    {
        if(nums.size()==0)
        {
            mat.add(new ArrayList<>(arr));
            return;
        }
        for(int i=0;i<nums.size();i++)
        {
            int num=nums.get(i);
            arr.add(num);
            nums.remove(i);
            recur(nums,arr,mat);
            nums.add(i,num);
            arr.remove(arr.size()-1);
        }
    }
}