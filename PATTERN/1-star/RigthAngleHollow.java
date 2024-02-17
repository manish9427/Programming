public class RigthAngleHollow {
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                if(i==1||i==5||j==1||j==i){
                // if(i==1||i==5||j==1){
                // if(i==1||i==5){
                // if(i==1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
