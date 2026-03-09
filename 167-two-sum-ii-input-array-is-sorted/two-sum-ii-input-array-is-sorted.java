class Solution {
    public int[] twoSum(int[] numbers, int target) {
    int n=numbers.length;
    int[] arr=new int[2];
    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            int a=numbers[i]+numbers[j];
            if(a==target)
            {
                arr[0]=i+1;
                arr[1]=j+1;
                return arr;
            }
            else if(a>target)
            {
                break;
            }
        }
    }
    return arr;
    }
}