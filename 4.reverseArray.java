//aproach 3:  Collections library //O(n) time & O()
// collections requires wrapper class Integer instead of int

//The wrapper class in Java provides the mechanism to convert primitive into object and object into primitive.

import java.util.Arrays;
import java.util.Collections;

public class reverseArray {
    public static void main(String[] args) {
        //int n = 5;
        Integer arr1[] = {5, 4, 3, 2, 1}; //Integer Wrapper class
        Integer arr2[] = {10,20,30,40};
        reverse(arr1);
        reverse(arr2);

    }
    static void reverse(Integer arr[]){
        Collections.reverse(Arrays.asList(arr));
        //first change array to a list by Arrays.asList(arr)
        //then this list Collections.reverse() method
       //both takes argument as abject 

        for (int k = 0; k < arr.length; k++)
            System.out.print(arr[k] + " ");

        System.out.println("\n");
    }
}


//public class reverseArray {
//    public static void main(String[] args) {
//        int[] arr1 = {5,4,3,2,1};
//        //int[] arr2 = {10,20,30,40};
//        reverse(arr1);
//        //reverse(arr2);
//        for (int i = 0; i < arr1.length; i++)
//            System.out.print(arr1[i] + " ");
//    }
//    static public void reverse(int[] arr){
//        int n = arr.length;
//        for(int i =0;i<n;i++){
//            swap(arr,arr[i],arr[n-i-1]);
//        }
//
//        for (int i = 0; i < n; i++)
//            System.out.print(arr[i] + " ");
//    }
//
//    static public void swap(int[] arr,int a,int b){
//        int temp = arr[a];
//        arr[a] = arr[b];
//        arr[b] = temp;
//
//    }
//}

//Approach 1: use an extra array
//time complexity O(n) and

//public class reverseArray {
//    public static void main(String[] args) {
//        //int n = 5;
//        int[] arr1 = {5, 4, 3, 2, 1};
//        int[] arr2 = {10,20,30,40};
//        reverse(arr1);
//        reverse(arr2);
//    }
//    static void reverse(int[] arr){
//        int n = arr.length;
//        for (int k = 0; k < n; k++)
//            System.out.print(arr[k] + " ");
//        System.out.println("\r");
//        int[] auxArr = new int[n];
//        for(int i= n-1;i>=0;i--){
//            auxArr[n-1-i] = arr[i];
//        }
//        for (int k = 0; k < n; k++)
//            System.out.print(auxArr[k] + " ");
//
//        System.out.println("\n");
//    }
//}


//Approach 2: recursive
//public class reverseArray {
//    public static void main(String[] args) {
//        //int n = 5;
//        int[] arr1 = {5, 4, 3, 2, 1};
//        int[] arr2 = {10,20,30,40};
//        reverse(arr1);
//        reverse(arr2);
//    }
//    static void reverse(int[] arr){
//        int n = arr.length;
//        int start = 0;
//        int end = n-1;
//
//        rev(arr,start,end);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println("\n");
//    }
//
//    static void rev(int[] arr,int start,int end){
//        if(start<end){
//            int temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//            rev(arr,start+1,end-1);
//        }
//
//    }
//}


