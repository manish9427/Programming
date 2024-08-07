import java.util.*;
public class AddElement {
    public class Node {
        int data;
        Node next;
        public Node(int data){
        this.data=data;
        this.next=null;
        }
    }

    Node head;
    public AddElement(){
        this.head=null;
    }

    public void addNumber(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void printList(){
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        AddElement list = new AddElement();
        for(int i=0;i<n;i++){
            list.addNumber(i);
        }
        list.printList();
    }

}
