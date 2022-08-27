package com.TCSNQTPREPQUES.ArrayQ;

//method 1 by boolean array 
// public class frequencyOfNumInArray {
//     public static void main(String[] args) {
//         int[] arr = {10,5,10,15,10,5};
//         int n = arr.length;

//         boolean visited[] = new boolean[n];
//         //this boolean array stores true or false if particular number is visited or not
//         for(int i= 0;i<n;i++){
//             if (visited[i] == true){
//                 continue;
//             }

//             int count = 0;
//             for (int j = i;j<n;j++){
//                 if(arr[i] == arr[j]){
//                   //make matched numbsers as visited we dont 
//                     visited[j] = true;
//                     count++;
//                 }

//             }
//             System.out.println(arr[i]+" "+ count);
//         }

//     }
// }

//method by Map/Hash Map

import java.util.HashMap;
import java.util.Map;

public class frequencyOfNumInArray {
    public static void main(String[] args) {
        int[] arr = {10,5,10,15,10,5};
        int n = arr.length;

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i]) + 1);
            } else {
                map.put(arr[i],1);
            }
        }
        System.out.println(map);

        //loop iterates entry set (all keys n values)
        for (Map.Entry<Integer,Integer> entry : map.entrySet())
            System.out.println(entry.getKey()+" "+ entry.getValue());



    }
}

