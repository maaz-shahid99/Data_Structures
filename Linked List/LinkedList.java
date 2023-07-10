public class LinkedList
{
    Node head;
    public void insert(int data)
    {
        Node new_node = new Node();
        new_node.data = data;
        new_node.next = head;
        head = new_node;
    }

    public void printList()
    {
        Node trav = head;
        System.out.print("List: ");
        while(trav!=null)
        {   
            if(trav.next == null)
                System.out.print(trav.data);
            
            else
                System.out.print(trav.data+" -> ");

            trav = trav.next; 
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(6);
        list.insert(5);
        list.insert(4);
        list.insert(3);
        list.insert(2);
        list.insert(1);
        list.insert(0);

        list.printList();

    }
}