import java.util.*;
public class SearchElementFromArray{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr [] = {1,2,3,4,5,6,7,8,9,10};
        System.out.print("Find the Element : ");
        int num=sc.nextInt();
        int target=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                target=i;
            }
        }
        if(target!=-1){
            System.out.println(num+" is at index "+target);
        }
        else{
            System.out.println("Not Found Element   " + num);
        }
    }
}
