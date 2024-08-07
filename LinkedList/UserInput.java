import java.util.Scanner;

public class UserInput {
    // class Node to define the linked list node
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static void main(String[] args) {
        Node head = null;
        Node tail = null;
        int value = 0;

        // a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the data for the linked list (enter -1 to stop):");

        // The while loop takes user input and creates new nodes with the input data
        while (true) {
            System.out.print("Enter a value: ");
            value = input.nextInt();

            if (value == -1) {
                break;
            }

            Node newNode = new Node(value);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = tail.next;
            }
        }

        System.out.print("The linked list is: ");
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        input.close();
    }
}
