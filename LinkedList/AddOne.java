package LinkedList;
import java.util.*;

//  Node class
class Node{
    int data;
    Node next;
    // node class constructor
    Node(int data){
        this.data=data;
        this.next=null;
    }
}


public class AddOne{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Linked list(comma-seprated values): ");
        String [] values=sc.nextLine().split(",");
        Node head =new Node(Integer.parseInt(values[0]));
        Node current=head;
        for(int i=1;i<values.length;i++){
            current.next=new Node(Integer.parseInt(values[i]));
            current=current.next;
        }
        
        //Add one to the Linked List
        head=addOne(head);
        
        //print the resulting linked list
        System.out.println("Result:- ");
        while(head != null){
            System.out.print(head.data);
            head=head.next;
            if(head!=null){
                System.out.print(" -> ");
            }
        }
    }

    public static Node reverse(Node head){
        Node current=head;
        Node prev=null;
        Node next=null;
        while(current != null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }
    
    public static Node addOne(Node head){
        Node new_head=reverse(head);
        int carry=0;
        Node prev=null;
        Node current1=new_head;
        Node curr=new_head;
        while(curr != null){
            int sum=0;
            if(prev == null){
                sum=curr.data+1;
            }else{
                sum=curr.data+carry;
            }
            carry=sum/10;
            curr.data=sum%10;
            prev=curr;
            curr=curr.next;
        }
        if(carry == 1){
            Node new_node=new Node(1);
            prev.next=new_node;
        }
        return reverse(current1);
    }
}