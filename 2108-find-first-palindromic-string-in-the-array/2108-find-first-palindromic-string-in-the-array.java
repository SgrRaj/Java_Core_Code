class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            String original=words[i], Soriginal=words[i], rev="";
            for(int j=0;j<original.length();j++){
                rev=original.charAt(j)+rev;
            }
            if(Soriginal.equals(rev)){
                return Soriginal;
            }
        }
        return "";
    }
}