import java.util.*;

public class permutationList {
    public static void main(String[] args){
        ArrayList<String> ans=permut("","abc");
        System.out.println(ans);
    }
    static ArrayList<String> permut(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> res=new ArrayList<>();
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            res.addAll(permut(f+ch+s,up.substring(1)));
        }
        return res;
    }
}
