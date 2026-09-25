class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while(i>=0 && j>=0){
           if( nums1[i]>nums2[j]){
            nums1[k]=nums1[i];
            i--;   k--;
           }
           else {
            nums1[k]=nums2[j];
            j--; k--;
           }
        }
        while(j>=0){
              nums1[k]=nums2[j];
            j--; k--;
        }





        // int indx1=m-1;
        // int indx2=n-1;
        // int indx3=m+n-1;

        // while(indx2>=0){
        //     if(indx1>=0 && nums1[indx1]>nums2[indx2])
        //         nums1[indx3--]=nums1[indx1--];

        //     else nums1[indx3--]=nums2[indx2--];
        // }


    }
}