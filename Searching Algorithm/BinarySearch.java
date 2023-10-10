import java.util.Arrays;
public class BinarySearch {
    public static void main(String[] args){
        int[] arr={1,3,9,-8,-6,15};
        int target=9;
        int index=-1;
        Arrays.sort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        index=Arrays.binarySearch(arr,target);
        if(index!=-1){
            System.out.println(index);
        }
    }
}
