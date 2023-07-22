import java.util.Scanner;

class LinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node head;

    // Method to insert a new element in sorted order
    private void insertSorted(int data) {
        Node newNode = new Node(data);

        if (head == null || data < head.data) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null && current.next.data < data) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    // Method to print the linked list
    private void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();

        // Input for the first linked list
        System.out.print("Enter the number of elements in the first linked list: ");
        int n1 = scanner.nextInt();
        System.out.println("Enter  elements for the first linked list:");
        for (int i = 0; i < n1; i++) {
            int data = scanner.nextInt();
            list1.insertSorted(data);
        }

        // Input for the second linked list
        System.out.print("Enter the number of elements in the second linked list: ");
        int n2 = scanner.nextInt();
         System.out.println("Enter " + n2 + " elements for the second linked list:");
        for (int i = 0; i < n2; i++) {
            int data = scanner.nextInt();
            list2.insertSorted(data);
        }
        scanner.close();

        // Merge the two linked lists
        Node mergedListHead = mergeLists(list1.head, list2.head);

        // Print the sorted merged linked list
        LinkedList sortedMergedList = new LinkedList();
        sortedMergedList.head = mergedListHead;
        System.out.println("Sorted merged linked list:");
        sortedMergedList.printList();
    }

    // Method to merge two linked lists
    private static Node mergeLists(Node head1, Node head2) {
        Node mergedList = null;
        Node current = null;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                if (mergedList == null) {
                    mergedList = head1;
                    current = mergedList;
                } else {
                    current.next = head1;
                    current = current.next;
                }
                head1 = head1.next;
            } else {
                if (mergedList == null) {
                    mergedList = head2;
                    current = mergedList;
                } else {
                    current.next = head2;
                    current = current.next;
                }
                head2 = head2.next;
            }
        }

        if (head1 != null) {
            if (mergedList == null) {
                mergedList = head1;
            } else {
                current.next = head1;
            }
        }

        if (head2 != null) {
            if (mergedList == null) {
                mergedList = head2;
            } else {
                current.next = head2;
            }
        }

        return mergedList;
    }
}

