/* Created By IntelliJ IDEA
 *  Author: Devansh Shukla (D-Coder135)
 *  Date: 09-11-2020
 *  Time: 06:44 PM
 */
package LinkedList;

public class LinkedList {
    /*Important Points about Linked List -->
    1. In Linked List, the first node is considered as the head node.
    2. Advantages of Linked List over arrays are -->
     a. The size of the Linked List is not fixed like arrays i.e. we can add or remove elements whenever we want.
     b. We can insert values in a Linked List from start, in the middle or at the end.
     */
    Node head;

    public void insertAtEnd(int data) {
        Node newNode = new Node(); // Every time data is inserted, it will be inserted in a new node.
        newNode.data = data;
        newNode.next = null;

        // If the value is inserted for the first time i.e. no other value was present before this value was added.
        // For that, checking the condition and assigning the node containing the first value as head.

        if (head == null) {
            head = newNode;
        } else {
            Node temporaryNode = head; // For traversing between different nodes.
            while (temporaryNode.next != null) {

                // This will travel from node to node in a series until the next block of the node contains null value.
                temporaryNode = temporaryNode.next;
            }
            temporaryNode.next = newNode; // This will make the next property of the node as not null.
        }
    }

    public void insertAtStart(int data) {
        Node newNode = new Node(); // Every time data is inserted, it will be inserted in a new node.
        newNode.data = data;
        newNode.next = null;
        newNode.next = head; // Being the first node, it should store the address of the next node.
        head = newNode; // As the value is inserted at the start, the node should be the head node.
    }

    public void insertAt(int indexValue, int data) {
        Node newNode = new Node(); // Every time data is inserted, it will be inserted in a new node.
        newNode.data = data;
        newNode.next = null;

        if (indexValue == 0) {
            insertAtStart(data);
        } else {
            Node temporaryNode = head;
            for (int index = 0; index < indexValue - 1; index++) {
                temporaryNode = temporaryNode.next; // Traversing till the node just before the indexValue inputted.
            }
            newNode.next = temporaryNode.next; // New node will have the address for the node succeeding it.
            temporaryNode.next = newNode; // Preceding node will have the address for the newly inserted node.
        }
    }

    public void deleteAt(int indexValue) {

        if (indexValue == 0) {
            head = head.next;
        } else {
            Node temporaryNode = head;
            Node anotherTemporaryNode;
            for (int index = 0; index < indexValue - 1; index++) {
                temporaryNode = temporaryNode.next;
            }
            anotherTemporaryNode = temporaryNode.next; // Store the node which is to be deleted.
            temporaryNode.next = anotherTemporaryNode.next; /* Store the address of the node succeeding the node at
                                                             inputted index value.*/
            anotherTemporaryNode = null; // Removed that node from the memory, which is to be deleted.
        }
    }

    public void print() {
        Node temporaryNode = head;

        while (temporaryNode.next != null) {
            System.out.println(temporaryNode.data);
            temporaryNode = temporaryNode.next;
        }
        System.out.println(temporaryNode.data);
    }
}
