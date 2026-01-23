class Solution {
    public int minAddToMakeValid(String s) {
    int count=0,n=s.length(),count1=0;
    Stack<Character> st=new Stack<>();
    for(int i=0;i<n;i++)
    {
        char ch=s.charAt(i);
        if(ch=='(')
        {
        st.push(ch);
        count1++;
        }
       else{
        if(st.isEmpty())
        {
            count++;
        }
        else{
            st.pop();
            count1--;
        }
       }
    }
    return count+count1;    
    }
}