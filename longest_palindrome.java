class Solution {
    public String longestPalindrome(String s) {
        for(int i=s.length();i>0;i--){
            for(int start=0;start<=s.length()-i;start++){
                if(check(start,start+i,s)){
                    return s.substring(start,start+i);
                }
            }
        }
        return"";
        
    }
    public boolean check(int k,int g, String s){
        int left = k;
        int right =g-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left ++;
            right --;

        }
        return true;

    }
}
