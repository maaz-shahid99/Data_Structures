import java.util.Random;

public class DeleteStartingNode {

    Node head=null, tail = null;

    Random random = new Random();

    public void deleteStartingNode() {
        head = head.next;
    }

    public void generateList(int n) {

        for (int i = 0; i < n; i++) {
            Node new_node = new Node();

            if (head == null) {
                head = new_node;
                tail = new_node;
                new_node.data = random.nextInt(100);
            } else {
                new_node.data = random.nextInt(100);
                new_node.next = head;
                head = new_node;
            }

        }
    }

    public void printList() {

        Node trav = head;

        System.out.print("List: ");

        if (trav.next == null)
            System.out.print("List is Empty");

        else {

            while (trav != null) {
                if (trav.next != null)
                    System.out.print(trav.data + " -> ");
                else
                    System.out.println(trav.data);

                trav = trav.next;
            }
        }
        System.out.println("Head: " + head.data + " Tail: " + tail.data);

    }

    public void insertTail(int data) {
        Node new_node = new Node();
        new_node.data = data;
        tail.next = new_node;
        tail = new_node;
    }

    public static void main(String[] args) {

        DeleteStartingNode list = new DeleteStartingNode();

        list.generateList(10);
        list.printList();
        list.deleteStartingNode();
        list.printList();
        // list.insertTail(1001);
        // list.printList();
    }
}
