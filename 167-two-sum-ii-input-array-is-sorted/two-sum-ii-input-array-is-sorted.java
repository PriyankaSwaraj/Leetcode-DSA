class Solution {
    public int[] twoSum(int[] numbers, int target) {
    int n=numbers.length;
    for(int i=0;i<n-1;i++)
    {
        int sum=numbers[i];
        int left=i+1,right=n-1;
        while(left<=right)
        {
            int num=(left+right)/2;
            if(numbers[num]+sum==target)
            {
                return new int[]{i+1,num+1};
            }
            else if(numbers[num]>(target-sum))
            {
                right=num-1;
            }
            else{
                left=num+1;
            }
        }
    }
    return new int[]{};
    }
}