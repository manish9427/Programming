package Stack;

// import java.util.*;
// public class $1_PrintStack {
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         Stack<Integer>st=new Stack<Integer>();
//         st.push(10);
//         st.push(20);
//         st.push(30);
//         st.push(40);
//         st.push(50);
//         while(!st.isEmpty()){
//             System.out.println(st.peek());
//             st.pop();
//         }
//     }
// }

// /*--------------------------- using loop-------------------------------------- */
// import java.util.*;
// public class $1_PrintStack {
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the number of Elements : ");
//         int n=sc.nextInt();
//         Stack<Integer>st=new Stack<Integer>();
//         for(int i=0;i<n;i++){
//             st.push(sc.nextInt());
//         }
//         while(!st.isEmpty()){
//             System.out.print(st.peek()+" ");
//             st.pop();
//         }
//     }
// }


/*-- ------------------using array---------------------------------------------*/
// import java.util.*;
// public class $1_PrintStack {
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the size of array: ");
//         int n=sc.nextInt();
//         int[] arr=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         Stack<Integer>st=new Stack<Integer>();
//         for(int i=0;i<n;i++){
//             st.push(arr[i]);
//         }
//         while(!st.isEmpty()){
//             System.out.print(st.peek()+" ");
//             st.pop();
//         }
//     }
// }

/*------------- using string----------------------------------------------- */

import java.util.*;
public class $1_PrintStack {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str=sc.nextLine();
        Stack<Character>st=new Stack<>();
        for(int i=0;i<str.length();i++){
            st.push(str.charAt(i));
        }
        while(!st.isEmpty()){
            System.out.print(st.peek()+" ");
            st.pop();
        }
    }
}
