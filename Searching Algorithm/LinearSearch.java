public class LinearSearch {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        int find = 4;
        int index=-1;
        
        for(int i=0;i<arr.length;i++){
            if(find==arr[i]){
                index=i;
            }
        }
        if(index!=-1){
            System.out.println("The element "+arr[index]+" is on index  "+index);
        }
        else{
            System.out.println("The element "+arr[index]+" is not present in array");
        }
    }
}
