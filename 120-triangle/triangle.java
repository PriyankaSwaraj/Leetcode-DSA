class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int m=triangle.size();
        int fmin=triangle.get(0).get(0),n=2;
        ArrayList<Integer> arr=new ArrayList<>(); 
        arr.add(fmin);
        for(int i=1;i<m;i++)
        {
            ArrayList<Integer> nums=new ArrayList<>();
            List<Integer> curr=triangle.get(i);
            nums.add(curr.get(0)+arr.get(0));
            int min=nums.get(0);
            for(int j=1;j<n-1;j++)
            {
                int c=curr.get(j);
                nums.add(Math.min(arr.get(j-1)+c,arr.get(j)+c));
                min=Math.min(min,nums.get(j));
            }
            nums.add(curr.get(n-1)+arr.get(n-2));
            fmin=Math.min(min,nums.get(n-1));
            arr.clear();
            arr.addAll(nums);
            n++;
        }
        return fmin;
    }
}