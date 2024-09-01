package problams;

public class LinkedListFind {
    public static <T> boolean linkedListFind(Node<T> head, T target) {
        boolean found = false;
        Node<T> current = head;

        while (current != null){
            if(current.val.equals(target)){
                return true;
            }
            current = current.next;
        }
        return found;
    }

    public static void main(String[] args){
//        Node<String> a = new Node<>("a");
//        Node<String> b = new Node<>("b");
//        Node<String> c = new Node<>("c");
//        Node<String> d = new Node<>("d");
//
//        a.next = b;
//        b.next = c;
//        c.next = d;
        Node<String> node1 = new Node<>("jason");
        Node<String> node2 = new Node<>("leneli");

        node1.next = node2;

        boolean val = linkedListFind(node1, "leneli");
        System.out.println(val);
    }
}
