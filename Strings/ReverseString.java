public class ReverseString{
    public static void main(String arg[]){
        String str="manish";
        String ans="";
        for(int i=0;i<str.length();i++){
            ans=str.charAt(i)+ans;
        }
        System.out.println(ans);
    }
}