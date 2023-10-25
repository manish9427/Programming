package ArrayList;

import java.util.ArrayList;
public class Program {
    public static void main(String args[]){
        ArrayList<String> fruits=new ArrayList<>();
        // add
        fruits.add("apple");
        fruits.add("Mango");
        fruits.add("papaya");
        System.out.println(fruits.get(0));

        // size
        int size=fruits.size();
        System.out.println(size);

        // remove
        fruits.remove(0);
        System.out.println(fruits.get(0));

        
    }
}
