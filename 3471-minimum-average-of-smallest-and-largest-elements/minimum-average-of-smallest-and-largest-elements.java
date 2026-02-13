class Solution {
    public double minimumAverage(int[] nums) {
    ArrayList<Double> set=new ArrayList<>();
    ArrayList<Integer> arr=new ArrayList<>();
    for(int num : nums)
    {
        arr.add(num);
    }    
    while(arr.size()>1)
    {
        int max=Collections.max(arr);
        int min=Collections.min(arr);
        set.add((double)(max+min)/2);
        arr.remove(arr.indexOf(max));
        arr.remove(arr.indexOf(min));
    }
    return Collections.min(set);
    }
}