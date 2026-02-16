class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
      HashMap<String,Integer> map1=new HashMap<>();
      HashMap<String,Integer> map2=new HashMap<>();
      for(String str: s1.split(" "))
      {
        map1.put(str,map1.getOrDefault(str,0)+1);
      }  
      for(String str: s2.split(" "))
      {
        map2.put(str,map2.getOrDefault(str,0)+1);
      }
      ArrayList<String> arr=new ArrayList<>();
      for(String str : s1.split(" "))
      {
        if(!map2.containsKey(str)&&map1.get(str)==1)
        {
            arr.add(str);
        }
      }
      for(String str : s2.split(" "))
      {
        if(!map1.containsKey(str)&&map2.get(str)==1)
        {
            arr.add(str);
        }
      }
      return arr.toArray(new String[0]);
    }
}