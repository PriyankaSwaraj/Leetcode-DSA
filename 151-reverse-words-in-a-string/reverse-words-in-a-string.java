class Solution {
    public String reverseWords(String s) {
    ArrayList<String> arr = new ArrayList<String>();
    int n=s.length();
    int k=0;
    for(int i=0;i<s.length();i++)
    {
        if(s.charAt(i)!=' ')
        {
          for(int j=i+1;j<n;j++)
           {
             if(s.charAt(j)==' ')
              {
                String str = s.substring(i,j);
                arr.add(str.trim());
                i=j;
                k=j+1;
                break; 
              }
           }
        }
    } 
    arr.add((s.substring(k,n)).trim());
    String val="";
    int m =arr.size();
    for(int i=m-1;i>=0;i--)
    {
        val += arr.get(i)+" ";
    }
    return val.trim();  
    }
}