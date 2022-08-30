public class bubbleSort {
    public static void main(String[] args) {
        int  n = 6;
        int[] arr = {13,46,24,52,20,9};

        printArr(arr);

        for(int j=0;j<n;j++){
            for(int i =0;i<n-j-1;i++){
                if(arr[i]>arr[i+1]){
                    swap(arr,i,i+1);
                }
            }
        }

        printArr(arr);
    }

    public static void swap(int[] arr,int a,int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void printArr(int[] arr) {
        for(int i =0;i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
    }



}
