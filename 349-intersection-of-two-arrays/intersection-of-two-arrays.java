class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
    HashSet<Integer> set = new HashSet<Integer>();
    int m=nums1.length,n=nums2.length;
    for(int i=0;i<m;i++)
    {
        set.add(nums1[i]);
    }
    HashSet<Integer> num = new HashSet<Integer>();
    for(int j=0;j<n;j++)
    {
        if(set.contains(nums2[j]))
        {
        num.add(nums2[j]);
        }
    }
    int l=num.size();
    int[] arr = new int[l];
    Iterator<Integer> it = num.iterator();
    for(int i=0;i<l;i++)
    {
        arr[i]=it.next();;
    }
    return arr;
    }
}