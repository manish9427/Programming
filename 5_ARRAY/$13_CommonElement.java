import java.util.*;
public class $13_CommonElement {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int [] arr1={1,3,6,7,8,9};
        int [] arr2={1,2,3,4,5,6,6,7,8};
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]+" ");
                }
            }
        }
    }
}

