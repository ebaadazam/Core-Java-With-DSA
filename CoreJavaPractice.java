/*
 * findmiddle(done), 
 * detectLoop(done), 
 * findstartingpointofloop(done), 
 * reverselist(done), 
 * rotatelist(done), 
 * removeDuplicatesFromSortedLL(done), 
 * removeLoop(done), 
 * mergeTwoSortedList(done),
 * intersectionPoint(done), 
 * isPalindrome, mergeKSortedList, addTwoNumbers
 */
class Node {
    int data; Node next;
    Node() {}
    Node(int data) {
        this.data = data;
        this.next = null; } }
class LinkedList {
    Node head;
    // methods...

    // print list
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

class CoreJavaPractice {
    public static void main(String[] args) {
        Node n1 = new Node(1);
        n1.next = new Node(2);
        n1.next.next = new Node(3);
        n1.next.next.next = new Node(4);
        n1.next.next.next.next = new Node(5);
        n1.next.next.next.next.next = new Node(6);
        
        LinkedList obj = new LinkedList();
        obj.head = n1;

        System.out.println("Before dupl the list:");
        obj.print();

        // method call

        System.out.println("After dupl the list:");
        obj.print();

    }
}



// 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null

// 1 -> 2 -> 3 -> 10 -> 4 -> 5 -> 6 -> null

// pos - 3

// count = 2
// pos = 0
// temp = 3