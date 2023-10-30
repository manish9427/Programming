// class PrimeNum{
//     public static void main(String args[]){
//         int num = 17;
//         if(Solution(num)){
//             System.out.println(num+" Prime");
//         }else{
//             System.out.println(num+" is Non Prime");
//         }
//     }
//     public static boolean Solution(int num){  
//         if(num<=1){
//             return false;
//         }

//         for(int i=2;i*i<=num;i++){ 
//             if(num%i==0){     
//                 return false;
//             }
//         }
//         return true;
//     }
// }



class PrimeNum{
    public static void main(String args[]){
        int n=17;

        boolean isPrime=true;
        for(int i=2;i*i<n;i++){
            if(n%i==0){
                isPrime=false;
            }
        }

        if(isPrime){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
    }
}