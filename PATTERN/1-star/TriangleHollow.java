public class TriangleHollow {
    public static void main(String args[]){
        for(int i=0;i<5;i++){
            for(int j=0;j<5-i-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<i*2+1;k++){
                if(i==0||k==i*2||k==0||i==5-1){

                    System.out.print("*");
                }else{

                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
