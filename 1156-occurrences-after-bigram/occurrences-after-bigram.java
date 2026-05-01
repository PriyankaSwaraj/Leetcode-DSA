class Solution {
    public String[] findOcurrences(String text, String first, String second) {
    String[] words=text.split(" ");
    int n=words.length;
    String res="";
    for(int i=0;i<n-2;i++)
    {
       if(words[i].equals(first)&&words[i+1].equals(second))
       {
        res += words[i+2];
        res += " ";
       }
    }  
     return res.length()>0?res.split(" "):new String[]{};
    }
}