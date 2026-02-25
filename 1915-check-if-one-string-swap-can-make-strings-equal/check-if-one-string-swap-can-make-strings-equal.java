class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
     int n=s1.length();
     int[] arr=new int[2];
     int k=0;
     for(int i=0;i<n;i++)
     {
        char ch=s1.charAt(i);
        if(ch!=s2.charAt(i))
        {
            if(k>=2)
            {
                return false;
            }
            arr[k]=i;
            k++;
        }
     }  
     char ch1=s1.charAt(arr[0]),ch2=s2.charAt(arr[1]);
     char c1=s1.charAt(arr[1]),c2=s2.charAt(arr[0]);
     return ch1==ch2&&c1==c2;
    }
}