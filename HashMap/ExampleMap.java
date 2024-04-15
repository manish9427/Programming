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

        // Update  --> this will update the value associate with key
        map.put("banana",25);
        System.out.println("updated value of banana: "+ map.get("banana"));

        //remove --> remove the key and value pair
        map.remove("grapes");
        System.out.println("After removing Grapes "+map);

        //Iteration
        System.out.println("Iterating over the HashMap:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
// or
        for (String key : map.keySet()) {
            int value = map.get(key);
            System.out.println(key + ": " + value);
        }

        //size
        System.out.println("Size of the HashMap: "+map.size());

        //clear 
        map.clear();
        System.out.println("After Clearing the HashMap: "+map);
        
    }
}
