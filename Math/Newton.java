package Math;
public class Newton {
    public static void main(String[] args){
        double n=40;
        double x=n;
        double root;
        while(true){
            root=0.5*(x+(n/x));
            if(Math.abs(root-x)<1){
                break;
            }
            x=root;
        }
        System.out.println(root);
    }
}
