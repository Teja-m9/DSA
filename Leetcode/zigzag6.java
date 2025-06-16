public class zigzag6 {
    public static void main(String[] args){
        String s="PAYPALISHIRING";
        int numRows=3;
        System.out.println(zigzag(s,numRows));
    }
    static String zigzag(String s,int n){
        if(n==1 || n>=s.length()){
            return s;
        }
        String[] ans=new String[n];
        for(int i=0;i<n;i++){
            ans[i]="";
        }
        int i=0;
        while(i<s.length()){
            for(int j=0;j<n && i<s.length();j++){
                ans[j]+=s.charAt(i++);
            }
            for(int j=n-2;j>0 && i<s.length();j--){
                ans[j]+=s.charAt(i++);
            }
        }
        StringBuilder result=new StringBuilder();
        for(String str : ans){
            result.append(str);
        }
        return result.toString();
    }
}
