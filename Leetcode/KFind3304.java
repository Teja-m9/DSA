public class KFind3304 {
    public static void main(String[] args){
        int k=5;
        StringBuilder sb=new StringBuilder("a");
        while(sb.length()<k){
            int n=sb.length();
            for(int i=0;i<n;i++){
                char ch=sb.charAt(i);
                char c=(char)((ch-'a'+1)%26+'a');
                sb.append(c);
            }
        }
        System.out.println(sb.charAt(k-1));
    }
}
