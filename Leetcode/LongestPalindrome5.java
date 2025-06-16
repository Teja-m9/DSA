public class LongestPalindrome5 {
    public static void main(String[] args){
        String s="babad";
        System.out.println(longestPalindrome(s));
    }
    static String longestPalindrome(String s){
        String longest="";
        int maxLength=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String sub=s.substring(i,j+1);
                if(isPalindrome(sub) && sub.length() > maxLength){
                    longest=sub;
                    maxLength=sub.length();
                }
            }
        }
        return longest;
    }
    private static boolean isPalindrome(String s){
        int left=0,right=s.length()-1;
        while(left<right){
            if(s.charAt(left++)!=s.charAt(right--)){
                return false;
            }
        }
        return true;
    }
}
