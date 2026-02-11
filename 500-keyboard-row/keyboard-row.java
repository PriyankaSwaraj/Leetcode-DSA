class Solution {
    public String[] findWords(String[] words) {
    ArrayList<String> arr=new ArrayList<>();
    String f1="qwertyuiopQWERTYUIOP",f2="asdfghjklASDFGHJKL",f3="zxcvbnmZXCVBNM";
    int n=words.length;
    for(int i=0;i<n;i++)
    {
        String word=words[i];
        boolean check1=true,check2=true,check3=true;
        for(int j=0;j<word.length();j++)
        {
             String ch=Character.toString(word.charAt(j));
            if(!f1.contains(ch))
            {            
                check1=false;
            }
            if(!f2.contains(ch))
            {
                check2=false;
            }
            if(!f3.contains(ch))
            {
                check3=false;
            }
        }
        if(check1||check2||check3)
        {
            arr.add(word);
        }
    }
    return arr.toArray(new String[0]);
    }
}