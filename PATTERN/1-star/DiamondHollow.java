public class DiamondHollow {
    public static void main(String args[]){
        int num=5;
        for(int i=0;i<num;i++){
            for(int j=0;j<num-i-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<2*i+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=num-2;i>=0;i--){
            for(int j=0;j<num-i-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<2*i+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
