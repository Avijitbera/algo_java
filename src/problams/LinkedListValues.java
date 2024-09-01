package problams;

import java.util.ArrayList;
import java.util.List;


class Node<T> {
    T val;
    Node<T> next;

    public Node(T val) {
        this.val = val;
        this.next = null;
    }
}

public class LinkedListValues {

    public static List<String> getValues(Node<String> head, List<String> list){

        if(head == null){

            return list;
        }else if(head.next == null){

            list.add(head.val);
            return  list;
        }
        else {
            list.add(head.val);

            return getValues(head.next, list);
        }
    }
    public static List<String> linkedListValues(Node<String> head) {

        ArrayList<String> list = new ArrayList<>();

        Node<String> current = head;
        while (current != null){
            list.add(current.val);
            current = current.next;
        }
        return  list;
//        List<String> lis = getValues(head, list);
//        System.out.println(lis);
//        return lis;

    }
    public static void main(String[] args){
        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");
        Node<String> d = new Node<>("d");
        a.next = b;
        b.next = c;
        c.next = d;
        List<String> v = linkedListValues(a);
        System.out.println(v);
    }
}
