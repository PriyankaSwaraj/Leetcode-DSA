class Solution {
    public List<Integer> findMissingElements(int[] nums) {
    int small=nums[0],large=nums[0];
    boolean[] freq=new boolean[101];
    for(int num:nums)
    {
        if(num<small)
        {
            small=num;
        }
        if(num>large)
        {
            large=num;
        }
        freq[num]=true;
    }    
    ArrayList<Integer> arr=new ArrayList<>();
    for(int i=small;i<=large;i++)
    {
        if(!freq[i])
        {
            arr.add(i);
        }
    }
    return arr;
    }
}