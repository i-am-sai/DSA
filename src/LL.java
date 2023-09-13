import  java.util.LinkedList;

public class LL {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(7);
        ll.add(77);
        System.out.println(ll);
        System.out.println(ll.get(1));
        System.out.println(ll.set(0, 10));
        System.out.println(ll);
    }
}
