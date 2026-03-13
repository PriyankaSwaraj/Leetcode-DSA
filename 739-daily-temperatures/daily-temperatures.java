class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
     int n=temperatures.length;
     int[] ans=new int[n];
     Stack<Integer> stack=new Stack<>();
     for(int i=n-1;i>=0;i--)
     {
        boolean check=false;
        while(!stack.isEmpty())
        {
            int idx=stack.peek();
          if(temperatures[idx]>temperatures[i])
          {
             ans[i]=idx-i;
             check=true;
             break;
          }
          else{
            stack.pop();
          }
        }
        if(!check)
        {
            ans[i]=0;
        }
        stack.push(i);
     } 
     return ans;  
    }
}