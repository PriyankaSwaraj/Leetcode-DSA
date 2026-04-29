class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
     String count1="",count2="",count3="";
     for(char ch:firstWord.toCharArray())
     {
        count1 += Integer.toString(ch-'a');
     }   
     for(char ch:secondWord.toCharArray())
     {
        count2 += Integer.toString(ch-'a');
     }
     for(char ch:targetWord.toCharArray())
     {
        count3 += Integer.toString(ch-'a');
     }
     return (Integer.parseInt(count1)+Integer.parseInt(count2))==Integer.parseInt(count3);
    }
}