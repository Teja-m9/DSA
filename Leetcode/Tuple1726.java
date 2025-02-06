package Leetcode;
import java.util.HashMap;

public class Tuple1726 {
    public static int tupleSameProduct(int[] nums) {
        HashMap<Integer, Integer> productMap = new HashMap<>();
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int product = nums[i] * nums[j];
                if (productMap.containsKey(product)) {
                    result += productMap.get(product);
                }
                productMap.put(product, productMap.getOrDefault(product, 0) + 1);
            }
        }

        return result * 8;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 3, 4, 6};
        System.out.println(tupleSameProduct(nums1));

        int[] nums2 = {1, 2, 4, 5, 10};
        System.out.println(tupleSameProduct(nums2));
    }
}
