import java.util.*;
public class ExampleHastable {
    public static void main(String args[]){
        Hashtable<String, Integer> table = new Hashtable<>();

        // put
        table.put("Apple",10);
        table.put("Mango",20);
        table.put("Grapes",30);

        //get
        System.out.println("What is the value of Apple: "+  table.get("Apple"));

        // Check for Key
        System.out.println("Does it contains the value of Apple: "+ table.containsKey("Apple"));

        // check for value
        System.out.println("Does the it contains the value of Grapes: "+ table.containsValue("Grapes"));

        // Update
        table.put("Mango",25);
        System.out.println("Upadate price of Mango: "+table.get("Mango"));

        // Remove - Key and Value
        table.remove("Grapes");
        System.out.println("table after removing Grapes: "+ table);


        // Iterage
        for(Map.Entry<String,Integer> entry : table.entrySet()){
            System.out.println(entry.getKey() +" : "+ entry.getValue());
        }

        for(String Key : table.keySet()){
            int value = table.get(Key);
            System.out.println(Key + " : "+value);
        }

        // Size
        System.out.println("Size : "+ table.size());

        //clear
        table.clear();
        System.out.println("table after clear: "+ table);

    }
}
