class Solution {
    public int kthSmallest(int[][] matrix, int k) {
    PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
    int m=matrix.length,n=matrix[0].length,l=0,i=0,j=0;
    while(i<m)
    {
        j=0;
        while(j<n)
        {
          if(l==k)
          {
             break; 
          }
          pq.add(matrix[i][j]);
          l++;
          j++;
        }
        if(l==k)
        break;
        i++;
    }    
    while(i<m)
    {
        while(j<n)
        {
           if(matrix[i][j]<pq.peek())
           {
            pq.poll();
            pq.add(matrix[i][j]);
           } 
           j++;
        }
        i++;
        j=0;
    }
    return pq.poll();
    }
}