class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> s=new LinkedHashSet<>();
        for(int n:nums){
            s.add(n);
        }

          int i = 0;
    for (int n : s) {
        nums[i++] = n;
    }

   return s.size();
        
    }
}