//native solution by just Sorting Array and printing a[0]
//this brings out time complexity of n*log n

//import java.util.Arrays;
//public class SmallestNumArray {
//    public static void main(String[] args){
//        int arr1[] = {2,5,1,3,0};
//        int arr2[] = {8,10,5,7,9};
//
//        System.out.println(sort(arr1));
//        System.out.println(sort(arr2));
//
//    }
//
//    public static int sort(int arr[]){
//        Arrays.sort(arr);
//        return arr[0];
//
//    }
//}

//optimal solution O(1) complexity
public class SmallestNumArray {
    public static void main(String[] args){
        int arr1[] = {2,5,1,3,0};
        int arr2[] = {8,10,5,7,9};

        System.out.println(smallest(arr1));
        System.out.println(smallest(arr2));
    }

    public static int smallest(int arr[]){
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min ;
    }
}
