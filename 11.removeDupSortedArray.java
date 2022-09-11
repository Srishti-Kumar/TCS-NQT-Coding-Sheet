//Approach 1: hash map.  O(nlogn)
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.HashMap;
// import java.util.HashSet;

//public class removeDuplicates {
//    public static void main(String[] args) {
//        int[] nums = {1,1,2,2,2,3,3};
//        int l = nums.length;
//
//        HashSet<Integer> hs = new HashSet<>();
//        for(int i=0;i<l;i++) {
//
//            hs.add(nums[i]);
//        }
//        System.out.println(hs);
//    }
//}

//approach 2: 2 pointer with new array. O(n)

public class removeDuplicates {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,2,3,3};
        int n = nums.length;

        int[] arrk = new int[n];
        int k =0;
        arrk[k] = nums[0];
        int j=1;
        for(int i=0;i<n;i++){
            if(nums[i] == nums[j]){
                j++;
            } else {
                i++;
                k++;
                arrk[k] = nums[i];
                //i++;
            }
        }

        for(int i=0;i< arrk.length;i++){
            System.out.print(arrk[i]+" ");
        }

    }
}
