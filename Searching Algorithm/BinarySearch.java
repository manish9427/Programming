public class BinarySearch {
    public static void main(String[] args){
        int[] arr= {1,2,3,4,5,4};
        int find = 4;
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==find){
                index=i;
            }
        }
        if(index!=-1){
            System.out.println(index);
        }else{
            System.out.println("not found");
        }
    }
}
