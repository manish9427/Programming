class PrimeNum{
    public static void main(String args[]){
        int num = 17;
        if(Solution(num)){
            System.out.println(num+" Prime");
        }else{
            System.out.println(num+" is Non Prime");
        }
    }
    public static boolean Solution(int num){  
        if(num<=1){
            return false;
        }

        for(int i=2;i*i<=num;i++){ 
            if(num%i==0){     
                return false;
            }
        }
        return true;
    }
}