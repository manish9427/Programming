public class _Pattern {
    public static void main(String args[]){
        int n=5;
        // Triangle
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<2*i+1;k++){
                // Hollow 
                if(i==0||i==n-1||k==0||k==2*i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //Diamond

    }    
}
