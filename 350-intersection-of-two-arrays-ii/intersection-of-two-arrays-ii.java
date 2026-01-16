class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
    HashSet<Integer> set = new HashSet<Integer>();
    ArrayList<Integer> arr = new ArrayList<Integer>();
    int m=nums1.length,n=nums2.length;
    int[] count = new int[1001];
    for(int i=0;i<m;i++)
    {
        set.add(nums1[i]);
        count[nums1[i]]++;
    }    
    for(int i=0;i<n;i++)
    {
        if(set.contains(nums2[i])&&count[nums2[i]]>0)
        {
            arr.add(nums2[i]);
            count[nums2[i]]--;
        }
    }
    int k= arr.size();
    int[] num = new int[k];
    for(int i=0;i<k;i++)
    {
        num[i]=arr.get(i);
    }
    return num;
    }
}