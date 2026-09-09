class Solution {
    class Pair{
        int num;
        char ch;
        Pair(int num,char ch)
        {
            this.num=num;
            this.ch = ch;
        }
    }
    public String longestDiverseString(int a, int b, int c) {
        PriorityQueue<Pair> pq=new PriorityQueue<>((p1,p2)-> p2.num-p1.num);
        if(a>0)
        pq.add(new Pair(a,'a'));
        if(b>0)
        pq.add(new Pair(b,'b'));
        if(c>0)
        pq.add(new Pair(c,'c'));
        StringBuilder sb=new StringBuilder();
        while(!pq.isEmpty())
        {
            Pair p=pq.poll();
            int len=sb.length();
            if(len>1&&sb.charAt(len-1)==sb.charAt(len-2)&&sb.charAt(len-1)==p.ch)
            {
                if(pq.isEmpty())
                {
                    break;
                }
                Pair p2=pq.poll();
                sb.append(p2.ch);
                if(p2.num>1)
                pq.add(new Pair(p2.num-1,p2.ch));
                pq.add(p);
                continue;
            }
            sb.append(p.ch);
            int g=p.num-1;
            if(g>0)
            pq.add(new Pair(g,p.ch));
        }
        return sb.toString();
    }
}