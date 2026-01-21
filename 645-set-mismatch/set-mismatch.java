class Solution {
    public int[] findErrorNums(int[] nums) {
     int n=nums.length;
     int[] arr=new int[2];
     HashSet<Integer> set=new HashSet<Integer>();
     int sum1=n*(n+1)/2;
     int sum2=0,sum3=0;
     for(int i=0;i<n;i++)
     {
        sum2 += nums[i];
        set.add(nums[i]);
     }
    Iterator<Integer> it=set.iterator(); 
    while(it.hasNext())
    {
        sum3 += it.next();
    }
     arr[0]=sum2-sum3;
     arr[1]=sum1-sum3;
     return arr;
    }
}