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

        // iterate
        for(String i:fruits){
            System.out.println(i);
        }

        //isEmpty
        System.out.println(fruits.isEmpty());
        
        //arraylist to array
        String []  a= new String[fruits.size()];
        a=fruits.toArray(a);
        for(String i:a){
            System.out.println(i);
        }
        
        // indexOf
        int index=fruits.indexOf("Mango");
        System.out.println(index);

        // contains()
        System.out.println(fruits.contains("apple"));

        // clear()
        fruits.clear();

            System.out.println(fruits);

    }
}
