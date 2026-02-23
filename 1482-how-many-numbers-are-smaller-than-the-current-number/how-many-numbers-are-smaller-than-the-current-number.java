class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
    int n=nums.length;
    int[] arr=Arrays.copyOf(nums,n);
    Arrays.sort(nums);
    HashMap<Integer,Integer> map=new HashMap<>();
    for(int i=0;i<n;i++)
    {
        if(!map.containsKey(nums[i]))
        map.put(nums[i],i);
    }
    for(int i=0;i<n;i++)
    {
        arr[i]=map.get(arr[i]);
    }
    return arr; 
    }
}