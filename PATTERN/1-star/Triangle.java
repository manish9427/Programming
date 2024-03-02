public class Triangle {
    public static void main(String args[]){
        for(int i=0;i<5;i++){
            for(int j=0;j<5-i-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<2*i+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
2*i+1
0 => 1
1 => 3
2 => 5
3 => 7
4 => 9

2*i+1=>2*4+1=> 9 
 */
