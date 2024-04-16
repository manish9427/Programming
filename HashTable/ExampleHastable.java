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


        // Iterage
        for(String Key : table.keySet()){
            int value = table.get(Key);
            System.out.println(Key + " : "+value);
        }

    }
}
