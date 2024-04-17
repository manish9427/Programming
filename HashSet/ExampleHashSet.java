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
    }
}
