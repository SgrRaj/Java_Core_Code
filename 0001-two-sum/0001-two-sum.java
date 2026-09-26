class Solution {
    public int[] twoSum(int[] nums, int target) {

          Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int comp=target-nums[i];
            int index=m.getOrDefault(comp,-1);
            if(index>=0){
                return new int[] {i,index};
            }
              m.put(nums[i],i);
          
        }
          return new int[] {-1,-1};


          
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]+nums[j]==target){
        //             return new int[]{i,j};
        //         }
        //     }
        // }
        // return new int[]{};
    }
    
}