package problams;

public class GetNodeValue {
    public static <T> T getNodeValue(Node<T> head, int index) {
        T value = null;
        int currentIndex = 0;
        Node<T> current = head;
        while (current != null){
            if(currentIndex == index){
                return  current.val;
            }

            currentIndex += 1;
            current = current.next;
        }
        return value;

    }
    public static void main(String[] args){
        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");
        Node<String> d = new Node<>("d");

        a.next = b;
        b.next = c;
        c.next = d;

        String val = getNodeValue(a, 7);
        System.out.println(val);
    }
}
