import java.util.*;

public class Subset {
    public static void main(String[] args){
        int[] arr={1,2,3};
        List<List<Integer>> res=subset(arr);
        for(List<Integer> list:res){
            System.out.println(list);
        }
    }
    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer= new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int i:arr){
            int n=outer.size();
            for(int j=0;j<n;j++){
                List<Integer> inner=new ArrayList<>(outer.get(j));
                inner.add(i);
                outer.add(inner);
            }
        }
        return outer;
    }
}
