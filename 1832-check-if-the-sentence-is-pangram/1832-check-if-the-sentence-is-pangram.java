class Solution {
    public boolean checkIfPangram(String sentence) {
       ArrayList<Character> arr= new ArrayList<>();
       for(char c:sentence.toCharArray()){
        if(c>='a' && c<='z' && !arr.contains(c))
          arr.add(c);
       }

        if (arr.size() == 26) {
          return true;
        } else {
           return false;
        }

    }
}