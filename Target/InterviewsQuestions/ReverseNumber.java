/*
 * given n=123
 * output 321
 */

 public class ReverseNumber{
    public static void main(String args[]){
        int n=123;
        String str=Integer.toString(n);
        String s="";
        for(int i=str.length()-1;i>=0;i--){
            s+=str.charAt(i);
        }
        System.out.println(s);
        int ans=Integer.valueOf(s);
        System.out.println(ans);
    }
 }