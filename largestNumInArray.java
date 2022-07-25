//native solution by just Sorting Array and printing a[n-1] , n = arr.length
//this brings out time complexity of n*log n
//import java.util.Arrays;
//
//public class largestNumArray {
//    public static void main(String[] args) {
//        int arr1[] = {2,5,1,3,0};
//        int arr2[] = {8,10,5,7,9};
//
//        System.out.println(sort(arr1));
//        System.out.println(sort(arr2));
//    }
//
//    public static int sort(int  arr[]){
//        Arrays.sort(arr);
//        return arr[arr.length -1];
//    }
//}

//optimal solution O(1) complexity
public class largestNumArray {
    public static void main(String[] args){
        int arr1[] = {2,5,1,3,0};
        int arr2[] = {8,10,5,7,9};

        System.out.println(largest(arr1));
        System.out.println(largest(arr2));
    }

    public static int largest(int arr[]){
        int max = arr[arr.length - 1];
        for(int i = arr.length -1 ; i > 0; i--){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
