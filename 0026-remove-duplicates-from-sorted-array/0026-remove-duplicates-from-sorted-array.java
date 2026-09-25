class Solution {
    public int removeDuplicates(int[] nums) {
        int k=1;
       for(int i=1;i<nums.length;i++){
        if(nums[i]!=nums[i-1]){
            nums[k]=nums[i];
            k++;
        }
       }
       return k;




    //     Set<Integer> s=new LinkedHashSet<>();
    //     for(int n:nums){
    //         s.add(n);
    //     }
    //      int i=0;
    //      for(int n : s) {
    //          nums[i++] = n;
    //      }
    // return s.size();
    }
}