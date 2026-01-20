class Solution {
    public String restoreString(String s, int[] indices) {
        ArrayList<Integer> arr= new ArrayList<>();
    int n=s.length();
    String str="";
    for(int i=0;i<n;i++)
    {
      arr.add(indices[i]);
    }    
    for(int i=0;i<n;i++)
    {
        int k=arr.indexOf(i);
        char ch =s.charAt(k);
        str +=Character.toString(ch);
    }
    return str;
    }
}