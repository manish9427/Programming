import java.util.*;
public class $14_CountEvenOdd {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Size:-");
        int n=sc.nextInt();
        System.out.println("Element:-");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int countEven=0,countOdd=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0)
                countEven++;
            else
                countOdd++;
        }
        System.out.println("the number of Even Element: "+countEven);
        System.out.println("the number of Even Element "+countOdd);
    }
}
