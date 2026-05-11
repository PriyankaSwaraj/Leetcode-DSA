class Solution {
    public int[] separateDigits(int[] nums) {
    ArrayList<Integer> arr=new ArrayList<>();
    for(int num:nums)
    {
        String str=Integer.toString(num);
        for(char ch:str.toCharArray())
        {
            arr.add(Character.getNumericValue(ch));
        }
    }    
    int n=arr.size();
    int[] result=new int[n];
    for(int i=0;i<n;i++)
    {
        result[i]=arr.get(i);
    }
    return result;
    }
}