/*
 Input str="abcd"
 output
 a
ab
abc
abcd
b
bc
bcd
c
cd
d


with substring method
TC => O(n^2)
SC => O(1)
without substring method
TC => O(n^3)
SC => O(1)
 */





public class Substring {
    public static void main(String[] args) {
        String str = "abcd";
        int length = str.length();

        // for (int i = 0; i < length; i++) {
        //     for (int j = i + 1; j <= length; j++) {
        //         String substring = str.substring(i, j);
        //         System.out.println(substring);
        //     }
        // }

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j <= length; j++) {
                for (int k = i; k < j; k++) {
                    System.out.print(str.charAt(k));
                }
                System.out.println();
            }
        }
    }
}
