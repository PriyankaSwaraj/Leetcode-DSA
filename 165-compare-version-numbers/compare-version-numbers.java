class Solution {
    public int compareVersion(String version1, String version2) {
    String[] v1=version1.split("\\.");
    String[] v2=version2.split("\\.");
    int n=v1.length,m=v2.length,i=0;
    while(i<n&&i<m)
    {
        int num=Integer.parseInt(v1[i]);
        int num2=Integer.parseInt(v2[i]);
     if(num2>num)
     {
        return -1;
     }
     else if(num>num2)
     {
        return 1;
     }
     i++;
    }
     while(i<n)
      {
        if(Integer.parseInt(v1[i])>0)        
        return 1;
        i++;
      }
      while(i<m)
      {
        if(Integer.parseInt(v2[i])>0)
        return -1;
        i++;
      }
    return 0; 
    }
}