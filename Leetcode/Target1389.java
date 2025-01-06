package Leetcode;
import java.util.*;
public class Target1389 {
    public static void main(String[] args){
        int[] nums={0,1,2,3,4};
        int[] index={0,1,2,2,1};
        int[] target=new int[nums.length];
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int j=index[i];
            list.add(j,nums[i]);
        }
        for(int i=0;i<list.size();i++){
            target[i]=list.get(i);
        }
        System.out.println(Arrays.toString(target));
    }
}
