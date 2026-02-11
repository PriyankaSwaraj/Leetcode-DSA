class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
    int n=words.length,m=licensePlate.length(); 
    int[] frequency=new int[26];
    for(int i=0;i<m;i++)
    {
        char ch=licensePlate.charAt(i);
       if(ch>='a'&&ch<='z')
       {
        frequency[ch-97]++;
       }
       else if(ch>='A'&&ch<='Z')
       {
        frequency[ch-65]++;
       }
    }

    int realCheck=0,k=0;
    for(int i=0;i<n;i++)
    {
        int[] frequency2=new int[26];
        String str=words[i];
        int check=0;
        for(int j=0;j<str.length();j++)
        {
          char ch=str.charAt(j);
          if(ch>='a'&&ch<='z')
          {
            frequency2[ch-97]++;
          }
          else if(ch>='A'&&ch<='Z')
          {
            frequency2[ch-65]++;
          }
        }
        for(int j=0;j<26;j++)
        {
            if(frequency[j]!=0&&frequency2[j]!=0)
            {
                if(frequency[j]>frequency2[j])
                check += frequency2[j];
                else
                check += frequency[j];
            }
        }
        if(check>realCheck)
        {
            realCheck=check;
            k=i;
        }
       else if(check==realCheck&&str.length()<words[k].length())
       {
        k=i;
       }
    } 
 
    return words[k]; 
    }
}