// public class ReverseNum {
//     public static void main(String args[]){
//         int n=123;
//         int result=Reverse(n);
//         System.out.println(result);
//     }
//     public static int Reverse(int n){
//         int ans=0;

//         while(n!=0){
//             int lastNum=n%10;
//             ans= ans*10+lastNum;
//             n=n/10;
//         }
//         return ans;
//     }
// }




public class ReverseNum{
    public static void main(String args[]){
        int n=123;
        int ans=0;
        while(n>0){
            int rem=n%10;
            ans=ans*10+rem;
            n=n/10;
        }
        System.out.println(ans);
    }
}