class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
     ArrayList<Integer> result=new ArrayList<>();
     String s=Character.toString(x);
     int i=0;
     for(String str:words)
     {
        if(str.contains(s))
        result.add(i);
        i++;
     }
     return result;
     }
}