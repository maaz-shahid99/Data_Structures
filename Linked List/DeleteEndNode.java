import java.util.Random;

public class DeleteEndNode {

    Node head;

    Random random = new Random();

    public void generateList(int n) {

        for (int i = 0; i < n; i++) {
            Node new_node = new Node();
            new_node.data = random.nextInt(125);
            new_node.next = head;
            head = new_node;
        }
    }

    public void deleteEndNode() {
        Node current_node, prev_node;

        current_node = prev_node = head;

        if (current_node.next == null)
            System.out.println("List is Empty");
        else {
            while (current_node.next != null) {

                current_node = current_node.next;

                if (current_node.next == null) {
                    prev_node.next = null;
                    break;
                }
                prev_node = prev_node.next;

            }
        }

    }

    public void printList() {

        Node trav;

        trav = head;
        System.out.print("List: ");
        while (trav != null) {
            if (trav.next != null)
                System.out.print(trav.data + " -> ");
            else
                System.out.println(trav.data);

            trav = trav.next;
        }
    }

    public static void main(String[] args) {

        DeleteEndNode list = new DeleteEndNode();
        list.generateList(10);
        list.printList();
        list.deleteEndNode();
        list.printList();

    }
}
