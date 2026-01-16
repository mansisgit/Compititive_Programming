import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class FrequencyCount {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] arr = {1,1,1,8,8,5,4,5,4,5,9};
        
        int count =0;
        for(int ele : arr){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        for(Map.Entry<Integer,Integer> ele : map.entrySet()){
            System.out.println(ele.getKey()+" times "+ ele.getValue());
        }//Hashmap arranges in the increasing order
    }
}
