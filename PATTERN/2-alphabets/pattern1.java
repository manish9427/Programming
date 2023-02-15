public class pattern1 {
    public static void main(String[] args){
        char ch='A';int n=5;
        for(int i=0;i<5;i++){ //row
            for(int j=0;j<=i;j++){
                System.out.print(ch+" ");
            }
            System.out.println(" ");//System.out.print("\n")
        }
    }    
}
