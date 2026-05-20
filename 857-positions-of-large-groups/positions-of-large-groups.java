class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
     List<List<Integer>> result=new ArrayList<>();
     int n=s.length();
     for(int i=1;i<n;i++)
     {
        char ch=s.charAt(i);
        if(ch==s.charAt(i-1))
        {
            int count =2,j=i+1;
            while(j<n&&s.charAt(j)==ch)
            {
                count++;
                j++;
            }
            if(count>=3)
            {
                result.add(Arrays.asList(i-1,j-1));
            }
            i=j;
        }
     }  
     return result; 
    }
}