/**
 * Given an array {"123f", "1dsa12", "1212ds", "65fd", "sadfa", "asdasd"};
 * Each item can contain 0-9, a-z, A-Z where a-z, A-Z characters are unwanted
 * Sum of all the numbers after removing all the unwanted characters 123+112+1212+65
**/
package Strings;

public class removeUnwantedChar {
    public static void main(String args[]){
        String str[]={"123f", "1dsa12", "1212ds", "65fd", "sadfa", "asdasd"};
        int total=0;
        for(int i=0;i<str.length;i++){
            String s=str[i];
            String digit=s.replaceAll("[^0-9]", "");
            if(digit.length()!=0){
                total+=Integer.valueOf(digit);
            }
        }
        System.out.println(total);
    }
}
