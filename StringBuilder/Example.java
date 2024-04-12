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

        // insert()
        sb.insert(6, "Manish ");
        System.out.println(sb.toString());

        // replace()
        sb.replace(13,20,"Verma");
        System.out.println(sb.toString());

        // delete()
        sb.delete(0, 6);

        System.out.println(sb.toString());

    }
}
