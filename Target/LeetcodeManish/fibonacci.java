// 0 1 1 2 3 5 8 13 ....


public class fibonacci{
    public static void main(String args[]){
        System.out.println("fibonacci");
        int first = 0;
        int second = 1;
        int n=4;
        int third;
        System.out.print(first + " "+ second + " ");

        for(int i=2;i<n;i++){
            third = first + second;
            System.out.print(third+" ");
            first=second;
            second =third;
        }
    }
}