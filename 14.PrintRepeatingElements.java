import java.util.HashMap;

public class repeatingElements {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,4,5,2};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x:arr){
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1 );
            } else{
                map.put(x,1);
            }
            if(map.get(x) > 1){
                System.out.print(x+" ");
            }
        }
    }
}


//1 4 2
