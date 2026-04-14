class Solution {
    public int[] closestPrimes(int left, int right) {
    boolean[] prime=new boolean[right+1];
    prime[1]=true;
    for(int i=2;i*i<=right;i++)
    {
        if(!prime[i])
        {
          for(int j=i*i;j<=right;j += i)
          {
            prime[j]=true;
          }
        }
    }
    int p1=-1,p2=-1,i=left;
    int[] nums={-1,-1};
    boolean check=true;   
    while(i<=right)
    {
        if(!prime[i]&&check)
        {
            p1=i;
            check =false;
        }
        else if(!prime[i])
        {
            p2=i;
            break;
        }
        i++;
    }
    i++;
    if(p1!=-1&&p2!=-1)
    {
        nums[0]=p1;
        nums[1]=p2;
    }
    while(i<=right)
    {
        if(!prime[i])
        {
          int num=nums[1]-nums[0];
          if(i-p2<num)
          {
            nums[0]=p2;
            nums[1]=i;
          }
          p2=i;
        }
        i++;
    }
    return nums;
    }
}