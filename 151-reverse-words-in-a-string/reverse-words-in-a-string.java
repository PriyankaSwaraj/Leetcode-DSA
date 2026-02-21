class Solution {
    public String reverseWords(String s) {
   String[] word=s.trim().replaceAll("\\s+"," ").split(" ");
   String str="";
   for(int i=word.length-1;i>=0;i--)
   {
     str += word[i].trim()+" ";
   }
    return str.trim();  
    }
}