class Solution {
    public int[] arrayRankTransform(int[] arr) {
     int n=arr.length;
     int[] nums=Arrays.copyOf(arr,n);
     Arrays.sort(nums);
     HashMap<Integer,Integer> map=new HashMap<>();
     int i=0;
     for(int num : nums)
     {
        if(map.containsKey(num))
        {
            continue;
        }
        map.put(num,i+1);
        i++;
     }
     i=0;
     for(int num: arr)
     {
        arr[i]=map.get(arr[i]);
        i++;
     }
     return arr;
    }
}