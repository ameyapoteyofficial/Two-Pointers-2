// Time Complexity : O(M+N) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
         int i=m-1;
        int j=n-1;
        int k=m+n-1;
        
        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                
                nums1[k]=nums1[i];
                i--;k--;
            }
            else{
                nums1[k]=nums2[j];
                k--;j--;
            }
        }
        while(i>=0){
            nums1[k--]=nums1[i--];
        }
        while(j>=0)
            nums1[k--]=nums2[j--];
    }
}
