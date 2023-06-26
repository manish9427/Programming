// 0 1 1 2 3 5 8 13 ....


public class fibonacci{
    public static void main(String args[]){
        System.out.println("fibonacci");
        int first = 0;
        int second = 1;
        int n=5;
        int third=0;
        while(n<=2){
            if(n==1){
                System.out.println(first);
            }
            else{
                System.out.println(second);
            }
        }
        for(int i=3;i<=n;i++){
            third = first + second;
            System.out.println(third);
            first=second;
            second =third;
        }
    }
}