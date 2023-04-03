public class splitFun {
    public static void main(String args[]){
        String str="my name is manish verma";
        String[] arr=str.split(" ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        // for (String word : arr) {
        //     System.out.println(word);
        // }
    }
}

