class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
     ArrayList<String> arr1=new ArrayList<>(Arrays.asList(list1));
      ArrayList<String> arr2=new ArrayList<>();
    int n=list2.length,check=Integer.MAX_VALUE,k=0;
     for(int i=0;i<n;i++)
     {
        int index=arr1.indexOf(list2[i]);
        if(index!=-1)
        {
            check=Math.min(check,i+index);
        }
     }
      for(int i=0;i<n;i++)
     {
        int index=arr1.indexOf(list2[i]);
        if(index!=-1&&index+i==check)
        {
          arr2.add(list2[i]);
        }
     }
      return arr2.toArray(new String[0]);
      }  
    }