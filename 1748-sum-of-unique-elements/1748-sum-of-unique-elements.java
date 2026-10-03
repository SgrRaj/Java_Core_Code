class Solution {
    public int sumOfUnique(int[] nums) {
       HashMap<Integer,Integer> m= new HashMap<>();
       for(int n:nums){
        m.put(n,m.getOrDefault(n,0)+1);
       }
       int sum=0;
          for (int num : m.keySet()) {
            if (m.get(num) == 1) {
              sum+=num;
            }
        }
      return sum;
    }
}