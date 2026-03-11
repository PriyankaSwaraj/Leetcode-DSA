class Solution {
    public int compress(char[] chars) {
    int count=1,n=chars.length,k=0;
    for(int i=1;i<n;i++)
    {
        if(chars[i]==chars[i-1])
        {
            count++;
        }
        else{
            chars[k]=chars[i-1];
            k++;
            if(count>1)
            {
               for(char ch:String.valueOf(count).toCharArray())
               {            
                chars[k]=ch;
                k++;
               }
            }
            count=1;
        }
    }
    k++;
    chars[k-1]=chars[n-1];
    if(count>1)
    {
    for(char ch:String.valueOf(count).toCharArray())
     {
       chars[k]=ch;
        k++;
     }
    }
    return k;
    }
}