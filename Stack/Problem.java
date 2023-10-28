import java.util.Stack;
public class Problem {
    public static void main(String args[]){
        Stack<Integer> st= new Stack<>();


        // push
        st.push(1);
        st.push(2);
        st.push(3);

        // peek
        System.out.println(st.peek());
        
        for(int i: st){
            
            System.out.println(i);
        }

        //pop
        System.out.println(st.pop());
        while(!st.isEmpty()){
            int element=st.pop();
            System.out.println(element);
        }

        // isEmpty()
        if(st.isEmpty()){
            System.out.println("empty");
        }else{
            System.out.println("Not Empty");
        }


    }    
}
