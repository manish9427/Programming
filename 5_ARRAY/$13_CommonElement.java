// import java.util.*;
// public class $13_CommonElement {
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         int [] arr1={1,3,6,7,8,9};
//         int [] arr2={1,2,3,4,5,6,6,7,8};
//         for(int i=0;i<arr1.length;i++){
//             for(int j=0;j<arr2.length;j++){
//                 if(arr1[i]==arr2[j]){
//                     System.out.println(arr1[i]+" ");
//                 }
//             }
//         }
//     }
// }

class Solution{
    public void shuffleAll(Node head){
      Node mid = getMid(head);
      Node headSecond = reverseLinkedList(mid);
      Node headFirst = head;
          if(headFirst == null){
              return;
          }
          while(headFirst!= null && headSecond !=null){
              Node temp = headFirst.next;
              headFirst.next = headSecond;
              headFirst = temp;
  
              temp = headSecond.next;
              headSecond.next = headFirst;
              headSecond = temp;
          }
  
          if(headFirst!=null){
              headFirst.next = null;
          }
      }
  
      public Node reverseLinkedList(Node head){
          Node prev = null;
          Node current = head;
          Node next = current.next;
  
          while(current != null){
              current.next = prev;
              prev = current;
              current = next;
              if(next != null){
                  next = next.next;
              }
          }
  
          return prev;
      }
  
      public Node getMid(Node head){
          Node slow = head;
          Node fast = head;
          while(fast != null && fast.next !=null){
              slow = slow.next;
              fast = fast.next.next;
          }
  
          return slow;
    } 
  }
