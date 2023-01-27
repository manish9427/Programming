import java.util.*;
public class pattern2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        int n=5;
        for(int i=0;i<5;i++){ //row
            for(int j=0;j<=i;j++)//{column
                System.out.print(ch+" ");
            }
            System.out.println(" ");//System.out.print("\n")
        }
    }    
}
