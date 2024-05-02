import java.util.Map;
import java.util.HashMap;
public class OddNumOccurence {
    public static void main(String args[]){
        Map<Integer,Integer>map=new HashMap<>();

        int [] arr = {1,2,1,2,3,4,2,4,5};  //Output --> 2, 3 , 5
        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(arr[i])){
                int val = map.get(arr[i]);
                map.put(arr[i], val + 1); 
            }
            else{
                map.put(arr[i], 1); 
            }
        }
        boolean flag = false;
        for(Integer Key:map.keySet()){
            if(map.get(Key) % 2 != 0){
                System.out.print(Key+ " ");
                flag=true;
            }
        }
        
        if(!flag){
            System.out.println("0");
        }

    }
}
