package Patterns;

public class Pattern8 {
    public static void main(String[] args){
        int n=5;
        for(int i=1;i<=2*n;i++){
            int c=i>n?2*n-i:i;
            for(int spaces=1;spaces<=n-c;spaces++){
                System.out.print(" ");
            }
            for(int j=c;j>=1;j--){
                System.out.print(j+" ");
            }
            for(int j=2;j<=c;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
