/* Created By IntelliJ IDEA
 *  Author: Devansh Shukla (D-Coder135)
 *  Date: 09-11-2020
 *  Time: 06:44 PM
 */

public class LinkedList {

    // In Linked List, the first node is considered as the head node.
    Node head;

    public void insert(int data) {
        Node node = new Node(); // Every time data is inserted, it will be inserted in a new node.
        node.data = data;
        node.next = null;

        // If the value is inserted for the first time i.e. no other value was present before this value was added.
        // For that, checking the condition and assigning the node containing the first value as head.

        if (head == null) {
            head = node;
        } else {
            Node temporaryNode = head;
        }
    }
}
