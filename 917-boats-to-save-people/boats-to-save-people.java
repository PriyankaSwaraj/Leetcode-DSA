class Solution {
    public int numRescueBoats(int[] people, int limit) {
     int n=people.length,count=0,i=0,j=n-1;
     Arrays.sort(people);
     while(i<=j)
     {
        if(people[i]+people[j]<=limit)
        {
            i++;
            j--;
        }
        else{
            j--;
        }
        count++;
     }
     return count;
    }
}