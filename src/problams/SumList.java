package problams;


import java.util.List;

public class SumList {

    public static int sumList(Node<Integer> head) {
        int value = 0;
        Node<Integer> current = head;

        while (current != null){
            value = value + current.val;
            current = current.next;
        }
        return  value;
    }

    public static void main(String[] args){
        Node<Integer> a = new Node<>(2);
        Node<Integer> b = new Node<>(8);
        Node<Integer> c = new Node<>(3);
        Node<Integer> d = new Node<>(-1);
        Node<Integer> e = new Node<>(7);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        int vla = sumList(a);
        System.out.println(vla);
    }
}
