class Solution {
    class Pair{
        int val;
        int idx;
        Pair(int v,int i)
        {
            val=v;
            idx=i;
        }
    }
    public int timeRequiredToBuy(int[] tickets, int k) {
    int n=tickets.length;
    int time=0;
    Queue<Pair> q=new LinkedList<>();
    for(int i=0;i<n;i++)
    {
        q.add(new Pair(tickets[i],i));
    }
    while(!q.isEmpty()&&tickets[k]>0)
    {
        Pair p=q.poll();
        p.val -= 1;
        if(p.idx==k)
        {
            tickets[k] -= 1;
        }
        time++;
        if(p.val>0)
        {
            q.add(p);
        }
    }
    return time;
    }
}