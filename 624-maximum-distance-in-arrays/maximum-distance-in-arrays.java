class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
      int max=Integer.MIN_VALUE,n=arrays.size();
      int a=Collections.max(arrays.get(0)),b=Collections.min(arrays.get(0));
      for(int i=1;i<n;i++)
      {
        ArrayList<Integer> nums=new ArrayList<>(arrays.get(i));
        int c=Collections.max(nums),d=Collections.min(nums);
        max=Math.max(Math.max(Math.abs(a-d),Math.abs(c-b)),max);
        a=Math.max(a,c);
        b=Math.min(b,d);
      }  
      return max;
    }
}