public class Example {
    public static void main(String args[]){
        StringBuilder sb =new StringBuilder();
        //append()
        sb.append("Hello");
        sb.append(" ");
        sb.append("world");
        sb.append("!");

        //toString() --> Converting StringBuilder to String 

        String result =sb.toString();
        System.out.println(result);

    }
}
