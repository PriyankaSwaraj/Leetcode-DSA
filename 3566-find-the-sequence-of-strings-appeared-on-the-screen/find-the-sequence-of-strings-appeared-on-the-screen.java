class Solution {
    public List<String> stringSequence(String target) {
    List<String> arr=new ArrayList<>();
    int n=target.length(),k=0;
    StringBuilder sb=new StringBuilder();
    for(int i=0;i<n;i++)
    {
        char ch=target.charAt(i);
        sb.append('a');
        while(sb.charAt(k)!=ch)
        {
            arr.add(sb.toString());
            sb.setCharAt(k,(char)(sb.charAt(k)+1));
        }
        arr.add(sb.toString());
        k++;
    } 
    return arr;   
    }
}