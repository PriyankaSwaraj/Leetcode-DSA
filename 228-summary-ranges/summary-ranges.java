class Solution {
    public List<String> summaryRanges(int[] nums) {
    ArrayList<String> arr=new ArrayList<>();
    int n=nums.length;
    boolean check=false;
    int i;
    for( i=1;i<n;i++)
    {
        StringBuilder sb=new StringBuilder();
        sb.append(nums[i-1]);
        check=false;
        while(i<n&&nums[i]==nums[i-1]+1)
        {
            i++;
            check=true;
        }
        if(check)
        {
            sb.append("->");
            sb.append(nums[i-1]);
        }
        arr.add(sb.toString());
    }  
    if(i==n)
    {
        arr.add(Integer.toString(nums[n-1]));
    }
    return arr;  
    }
}