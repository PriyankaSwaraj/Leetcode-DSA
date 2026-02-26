class Solution {
    public int[] finalPrices(int[] prices) {
    Stack<Integer> stack=new Stack<>();
    int n=prices.length;
    int[] arr=new int[n];
    for(int i=n-1;i>=0;i--)
    {
        int num=prices[i];
        while(!stack.isEmpty())
        {
            int a=stack.peek();
            if(a<=num)
            {
               arr[i]=num-a;
               stack.push(num);
               break;
            }
            else{
                stack.pop();
            }
        }
        if(stack.isEmpty())
        {
            arr[i]=num;
            stack.push(num);
        }
    }
    return arr;
    }
}