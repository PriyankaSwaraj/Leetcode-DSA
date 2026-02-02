class Solution {
    public int findKthPositive(int[] arr, int k) {
    int n = arr.length; 
    HashSet<Integer> set=new HashSet<>();
    for(int i=0;i<n;i++)
    {
        set.add(arr[i]);
    }
    int val=0,count=0;
    while(count!=k)
    {
         val++;
        if(!set.contains(val))
        {
            count++;
        }
    }
    return val;
    }
}