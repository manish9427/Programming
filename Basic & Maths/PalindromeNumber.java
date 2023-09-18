public class PalindromeNumber {
    public static void main(String gargs[]){
        int num=121;
        int original=num;
        int rev=0;
        while(num!=0){
            int last=num%10;
            rev=rev*10+last;
            num=num/10;
        }
        System.out.println(rev);
        System.out.println(num);
        if(rev==original){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}

