class Solution {
    public String sortSentence(String s) {
    ArrayList<String> arr = new ArrayList<String>();
    int k=0,n=s.length();
    for(int i=0;i<n;i++)
    {
        if(s.charAt(i)==' ')
        {
            String str = s.substring(k,i);
            arr.add(str);
            k =i+1;
        }
    } 
    arr.add(s.substring(k,n));
    Collections.sort(arr, Comparator.comparingInt(
            h -> h.charAt(h.length() - 1)
        ));
    String result="";
    for(String sc:arr)
    {
        result += sc.substring(0,sc.length()-1);
        result += " ";
    }
    return result.substring(0,result.length()-1); 
    }
}