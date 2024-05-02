public class RemoveUnwanted {
    public static void main(String args[]){
        String [] arr = {"jdfhsdjh1","99dsaf999"}; // output 1000000
        int sum=0;
        for (String str : arr) {
            String cleanStr = str.replaceAll("[^0-9]", "");
            sum += Integer.parseInt(cleanStr);
        }
        System.out.println("Sum of numbers: " + sum);
    }
}
