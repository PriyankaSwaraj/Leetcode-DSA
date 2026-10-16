class Solution {
    public int[] restoreArray(int[][] adjacentPairs) {
     HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
     HashSet<Integer> set=new HashSet<>();
      int num=0,m=adjacentPairs.length+1;
      for(int[] arr:adjacentPairs)
      {
        ArrayList<Integer> nums;
        ArrayList<Integer> nums1;
         if(map.containsKey(arr[0]))
         {
            nums=map.get(arr[0]);
         }
         else{
            nums=new ArrayList<>();
         }
         nums.add(arr[1]);
         if(map.containsKey(arr[1]))
         {
            nums1=map.get(arr[1]);
         }
         else{
            nums1=new ArrayList<>();
         }
         nums1.add(arr[0]);
         map.put(arr[0],nums);
         map.put(arr[1],nums1);
         num ^= arr[0];
         num ^= arr[1];
      }
      int nums1=0;
      for(int[] arr:adjacentPairs)
      {
        if(map.get(arr[0]).size()==1)
        {
            nums1=arr[0];
            break;
        }
        if(map.get(arr[1]).size()==1)
        {
            nums1=arr[1];
            break;
        }
      }
     int[] result=new int[m];
     result[0]=nums1;
     set.add(nums1);
     for(int i=1;i<m;i++)
     {
        ArrayList<Integer> nums=map.get(result[i-1]);
        int n=nums.size(),j=0;
        while(j<n&&set.contains(nums.get(j)))
        {
            j++;
        }
        result[i]=nums.get(j);
        set.add(result[i]);
     }
      return result;
    }
}