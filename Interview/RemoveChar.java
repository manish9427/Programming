// output => 1+345+123 => 469

public class RemoveChar {
  public static void main(String args[]){
    String[] arr = {"aB*1","3&45","rK#@","123","abddd","fhjf"};
    
    int sum = 0;
    for (String s : arr) {
      String cleaned = s.replaceAll("[^0-9]", "");
      if (!cleaned.equals("")) {
        sum += Integer.parseInt(cleaned);
      }
    }
    
    System.out.println(sum);
  }
}