
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class RemoveRepeatedIntegers {

    public static void removeDuplicates(Node head) {
        if (head == null) {
            return;
        }

        Node current = head;
    //    / HashSet<Integer> uniqueElements = new HashSet<>();

        while (current != null) {
            Node runner = current;
            while(runner.next != null){
            if (runner.next.data == current.data) {
                runner.next = runner.next.next;
               
            } else {
                runner = runner.next;
            }
            }

            current = current.next;
        }
    }

    public static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in linkedlist:");
        int n =sc.nextInt();
        System.out.println("Enter the element of Linked List:");
        Node head = null;
        Node tail = null;
        for(int i=0; i<n;i++){
            int data = sc.nextInt();
            Node newNode = new Node(data);
            if( head == null){
                head = newNode;
                tail = newNode;
            }else{
                tail.next = newNode;
                tail = newNode;
            }
        }
        sc.close();
        System.out.println("Original Linked List:");
        printLinkedList(head);
        removeDuplicates(head);

        System.out.println("\nLinked List after removing repeated integers:");
        printLinkedList(head);
    }
}


    
