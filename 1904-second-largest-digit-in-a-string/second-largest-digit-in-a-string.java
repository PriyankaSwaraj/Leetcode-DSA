class Solution {
    public int secondHighest(String s) {
    HashSet<Integer> set = new HashSet<Integer>();
     int n = s.length();
     for(int i=0;i<n;i++)
     {
        if(s.charAt(i)>='0'&&s.charAt(i)<='9')
        {
           int ch = Character.getNumericValue(s.charAt(i));
           set.add(ch);
        }
     }
     ArrayList<Integer> arr = new ArrayList<Integer>(set);
     Collections.sort(arr); 
     int a= arr.size();  
     System.out.print(arr);
     if(a<2)
     {
        return -1;
     }
     return arr.get(a-2);
    }
}