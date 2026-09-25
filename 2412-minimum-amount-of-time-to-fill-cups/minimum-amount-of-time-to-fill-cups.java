class Solution {
    public int fillCups(int[] amount) {
    PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
    for(int num:amount)
    {
        if(num>0)
        pq.add(num);
    } 
    int time=0;
    while(!pq.isEmpty())
    {
        int p=pq.poll();
        if(!pq.isEmpty())
        {
            int p2=pq.poll();
            if(p>1)
            pq.add(p-1);
            if(p2>1)
            pq.add(p2-1);
        }
        else{
            time += p;
            break;
        }
        time++;
    }   
    return time;
    }
}