class Solution {
    public int lengthOfLastWord(String s) {
        s.trim();
        s= s.replaceAll("\\s+", " ");
     String[] word=s.split(" ");
     String wor=word[word.length-1];
     return wor.length();  
    }
}