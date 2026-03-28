class Solution {
    public String smallestSubsequence(String s) {
    int[] freq=new int[26];
    int n=s.length();
    for(int i=0;i<n;i++)
    {
        freq[s.charAt(i)-'a']=i;
    }   
    Stack<Character> stack=new Stack<>();
    for(int i=0;i<n;i++)
    {
        char ch=s.charAt(i);
        while(!stack.isEmpty()&&!stack.contains(ch))
        {
          char ch2=stack.peek();
          if(ch2>ch&&freq[ch2-'a']>i)
          {
            stack.pop();
          }
          else{
            break;
          }
        }
        if(!stack.contains(ch))
        stack.push(ch);
    }
    ArrayList<Character> arr=new ArrayList<>();
    while(!stack.isEmpty())
    {
        arr.add(stack.pop());
    }
    int k=arr.size();
    StringBuilder sb=new StringBuilder();
    for(int i=k-1;i>=0;i--)
    {
        sb.append(arr.get(i));
    } 
    return sb.toString();
    }
}