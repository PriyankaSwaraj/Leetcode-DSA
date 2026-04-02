class Solution {
    public int[] findOriginalArray(int[] changed) {
        if(changed.length%2!=0)
        {
            return new int[]{};
        }
    HashMap<Integer,Integer> map=new HashMap<>(); 
    Arrays.sort(changed);  
    int k=0,m=changed.length/2;
    int[] arr=new int[m]; 
    for(int num:changed)
    {
        if(map.containsKey(num/2)&&num%2==0)
        {   
        arr[k]=num/2;
        k++;
        int n=map.get(num/2);
        if(n==1)
        map.remove(num/2);
        else
        map.put(num/2,n-1);
       }
      else{
         map.put(num,map.getOrDefault(num,0)+1);
      }
    }
    return k==m?arr:new int[]{};
    }
}