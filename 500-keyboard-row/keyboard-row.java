class Solution {
    public String[] findWords(String[] words) {
    String f1="qwertyuiopQWERTYUIOP",f2="asdfghjklASDFGHJKL",f3="zxcvbnmZXCVBNM";
    ArrayList<Character> first=new ArrayList<>();
    for(int i=0;i<20;i++)
    {
        first.add(f1.charAt(i));
    }
    ArrayList<Character> second=new ArrayList<>();
    for(int i=0;i<18;i++)
    {
        second.add(f2.charAt(i));
    }
    ArrayList<Character> third=new ArrayList<>();
    for(int i=0;i<14;i++)
    {
      third.add(f3.charAt(i));
    }
    ArrayList<String> arr=new ArrayList<>();
    int n=words.length;
    for(int i=0;i<n;i++)
    {
        String word=words[i];
        boolean check1=true,check2=true,check3=true;
        for(int j=0;j<word.length();j++)
        {
            if(!first.contains(word.charAt(j)))
            {
                check1=false;
            }
            if(!second.contains(word.charAt(j)))
            {
                check2=false;
            }
            if(!third.contains(word.charAt(j)))
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