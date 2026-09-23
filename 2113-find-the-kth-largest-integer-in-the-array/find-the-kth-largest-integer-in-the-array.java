class Solution {
    class Pair implements Comparable<Pair>{
        String num;
        Pair(String str)
        {
            this.num=str;
        }
        public int compareTo(Pair other)
        {
            int n=this.num.length();
            if(n==other.num.length())
            {
                for(int i=0;i<n;i++)
                {
                    if(this.num.charAt(i)!=other.num.charAt(i))
                    {
                        return other.num.charAt(i)-this.num.charAt(i);
                    }
                }
            }
            return other.num.length()-this.num.length();
        }
    }
    public String kthLargestNumber(String[] nums, int k) {
    PriorityQueue<Pair> pq=new PriorityQueue<>();
    for(String num:nums)
    {
        pq.add(new  Pair(num));
    }    
    while(k>1)
    {
      pq.poll();
      k--;
    }
    return pq.poll().num;
    }
}