import java.util.Map;
import java.util.HashMap;
public class ExampleMap {
    public static void main(String args[]){
        Map<String ,Integer>map =new HashMap<>();  // key , value

        // put  --> add element to map
        map.put("apple",10);
        map.put("banana",20);
        map.put("grapes",30);

        //get --> access the element
        System.out.println("value of apple: "+ map.get("apple"));

        //containsKey --> check key exist or not exist
        System.out.println("contains key 'banana'? "+map.containsKey("banana"));

        //containsValue --> check value exist or not exist
        System.out.println("contains value 20 ? " + map.containsValue(20));


        
    }
}
