class Solution {
    class Pair implements Comparable<Pair>{
        int diff;
        int index;
        Pair(int d,int i)
        {
            diff=d;
            index=i;
        }
        public int compareTo(Pair other)
         {
        return this.diff - other.diff;
        }
    }
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
    PriorityQueue<Pair> pq=new PriorityQueue<>(Collections.reverseOrder());
    int n=arr.length;
    for(int i=0;i<k;i++)
    {
        pq.add(new Pair(Math.abs(arr[i]-x),i));
    }    
    for(int i=k;i<n;i++)
    {
        int diff=Math.abs(arr[i]-x);
        if(pq.peek().diff>diff)
        {
            pq.poll();
            pq.add(new Pair(diff,i));
        }
    }
    ArrayList<Integer> result=new ArrayList<>();
    while(!pq.isEmpty())
    {
        result.add(arr[pq.poll().index]);
    }
    Collections.sort(result);
    return result;
    }
}