import java.util.HashMap;
import java.util.Map.Entry;

public class PrintNonRepeatingElements {
    public static void main(String[] args) {
        int[] nums = {1,2,-1,1,3,1};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x:nums){
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
            } else {
                map.put(x,1);
            }
        }
        for(Entry<Integer,Integer> entry:map.entrySet()) {
            if(entry.getValue()==1)
                System.out.print(entry.getKey()+" ");
        }
    }
}
