// It does not contains duplicates

import java.util.HashSet;
import java.util.Set;
public class ExampleHashSet {
    public static void main(String args[]){
        Set<String>set=new HashSet<>();

        // create
        set.add("Apple");
        set.add("Mango");
        set.add("Grapes");
        set.add("Apple");

        //Access
        System.out.println("HashSet: " + set);

        //check element -- contains
        System.out.println("Check for element 'Apple' ? : " + set.contains("Apple"));

        // Update  it can`t  be use directly

        if(set.contains("Grapes")){
            set.remove("Grapes");
            set.add("Banana");
        }
        System.out.println("After Upadate HashSet: "+ set);

        // remove 
        set.remove("Mango");
        System.out.println("HashSet After Removing: "+ set);

        //Iteration
        for(String element:set){
            System.out.println(element);
        }

        //Size
        System.out.println("Size og the HashSet: " + set.size());

        //Clear
        set.clear();
        System.out.println("HashSet: "+set);
        
    }
}
