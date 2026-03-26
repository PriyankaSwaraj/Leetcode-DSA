class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
    Queue<Integer> q=new LinkedList<>();
    int n=students.length;
    for(int i=0;i<n;i++)
    {
        q.add(students[i]);
    }    
    int m=sandwiches.length;
    for(int i=0;i<m;i++)
    {
        int k=q.size();
        while(q.peek()!=sandwiches[i]&&k>0)
        {
            k--;
            q.add(q.remove());
        }
        if(k==0)
        break;
        q.remove();
    }
    return q.size();
    }
}