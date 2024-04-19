import java.util.Set;
import java.util.HashSet;
public class Removeduplicates {
    public static void main(String args[]){
        Set<Integer>set=new HashSet<>();
        int [] arr = {1,2,1,1,2,1,2,1,2,1,1,2,1,1,2};
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        System.out.println(set);
    }
}
