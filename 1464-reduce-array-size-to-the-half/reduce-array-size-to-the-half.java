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
    public int minSetSize(int[] arr) {
    HashMap<Integer,Integer> map=new HashMap<>();
    for(int num:arr)
    {
        map.put(num,map.getOrDefault(num,0)+1);
    }    
    PriorityQueue<Pair> pq=new PriorityQueue<>((p1,p2)->p2.freq-p1.freq);
    for(Map.Entry<Integer,Integer> e:map.entrySet())
    {
        pq.add(new Pair(e.getKey(),e.getValue()));
    }
    int n=arr.length/2,m=0,res=0;
    while(m<n)
    {
       m += pq.poll().freq;
       res++;
    }
    return res;
    }
}