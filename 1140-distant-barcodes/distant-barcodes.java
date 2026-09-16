class Solution {
    class Pair{
        int num;
        int freq;
        Pair(int n,int f)
        {
            this.num=n;
            this.freq=f;
        }
    }
    public int[] rearrangeBarcodes(int[] barcodes) {
    HashMap<Integer,Integer> map=new HashMap<>();
    for(int num:barcodes)
    {
        map.put(num,map.getOrDefault(num,0)+1);
    }    
    PriorityQueue<Pair> pq=new PriorityQueue<>((p1,p2)->p2.freq-p1.freq);
    int n= barcodes.length,idx=0;
    for(Map.Entry<Integer,Integer> e:map.entrySet())
    {
        pq.add(new Pair(e.getKey(),e.getValue()));
    }
    int[] result=new int[n];
    Pair a=pq.poll();
    result[idx++]=a.num;
    if(a.freq>1)
    {
        a.freq -= 1;
        pq.add(a);
    }
    while(!pq.isEmpty())
    {
        Pair p=pq.poll();
        if(p.num==result[idx-1])
        {
            Pair p2=pq.poll();
            result[idx++]=p2.num;
            if(p2.freq>1)
            {
                p2.freq -= 1;
                pq.add(p2);
            }
            pq.add(p);
            continue;
        }
        result[idx++]=p.num;
        if(p.freq>1)
        {
            p.freq -= 1;
            pq.add(p);
        }
    }
    return result;
    }
}