class Solution {
    public int[] twoSum(int[] numbers, int target) {
    int n=numbers.length;
    int[] arr=new int[2];
    HashMap<Integer,Integer> map=new HashMap<>();
    for(int i=0;i<n;i++)
    {
      map.put(numbers[i],i+1);
    }
    for(int i=0;i<n;i++)
    {
        int s=target-numbers[i];
        if(map.containsKey(s))
        {
            arr[0]=i+1;
            arr[1]=map.get(s);
            return arr;
        }
    }
    return arr;
    }
}