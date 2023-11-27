// import java.util.*;
// public class RemoveDuplicate {
//     public static void main(String args[]){
//         int[] arr = {1, 7, 1, 8, 4, 9, 7, 3};
//         // 1, 7, 8, 4, 9, 3 --> Output

//         int[] ans = Solution(arr);
//         Arrays.sort(ans);
//         System.out.println(Arrays.toString(ans));
//     }

//     public static int[] Solution(int[] arr){
//         int n = arr.length;
//         Stack<Integer> st = new Stack<>();

//         for (int i = 0; i < n; i++){
//             if (!st.contains(arr[i])){
//                 st.push(arr[i]);
//             }
//         }

//         int[] ans = new int[st.size()];
//         for (int i = ans.length - 1; i >= 0; i--) {
//             ans[i] = st.pop();
//         }
//         return ans;
//     }
// }




import java.util.*;
class RemoveDuplicate{
    public static void main(String args[]){

        int [] arr= {1,2,1,2,4,2,8,2,10,6};
        Solution(arr);
    }

    public static void Solution(int [] arr){
        int n=arr.length;
        Stack<Integer> st =new Stack<>();
        for(int i=0;i<n;i++){

            while(!st.contains(arr[i])){
                st.push(arr[i]);
            }
        }

        while(!st.isEmpty()){
            System.out.print(st.peek()+" ");
            st.pop();
        }
    }
}