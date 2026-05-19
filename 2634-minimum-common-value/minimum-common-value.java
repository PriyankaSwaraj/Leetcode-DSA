class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
    int m=nums1.length,n=nums2.length;
    if(n<m)
    {
        for(int i=0;i<n;i++)
        {
        int low=0,high=m-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums1[mid]==nums2[i])
            {
                return nums1[mid];
            }
            else if(nums1[mid]>nums2[i])
            {
                high = mid-1;
            }
            else{
                low =mid+1;
            }
        }
        }
    }
    else{
      for(int i=0;i<m;i++)
      {
        int low=0,high=n-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums2[mid]==nums1[i])
            {
                return nums2[mid];
            }
            else if(nums2[mid]>nums1[i])
            {
                high = mid-1;
            }
            else{
                low=mid+1;
            }
        }
      }
    } 
    return -1;   
    }
}