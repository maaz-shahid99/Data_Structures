import java.util.Random;

public class DeleteStartingNode {

    Node head;

    Random random = new Random();

    public void generateList(int n) {

        for (int i = 0; i < n; i++) {
            Node new_node = new Node();
            new_node.data = random.nextInt(100);
            new_node.next = head;
            head = new_node;
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
                    System.out.print(trav.data);

                trav = trav.next;
            }
        }

    }

    public static void main(String[] args) {

        DeleteStartingNode list = new DeleteStartingNode();

        list.generateList(10);
        list.printList();

    }
}
