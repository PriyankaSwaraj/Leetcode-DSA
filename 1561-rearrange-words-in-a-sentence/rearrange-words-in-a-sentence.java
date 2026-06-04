class Solution {
    public String arrangeWords(String text) {
     String[] word=text.split(" ");
      Arrays.sort(word, Comparator.comparingInt(String::length)); 
      String res = word[0].substring(0, 1).toUpperCase() + word[0].substring(1);
      String result=res;
      int n=word.length;
      for(int i=1;i<n;i++)
      {
        result +=" ";
        result += word[i].toLowerCase();
      }  
      return result;
    }
}