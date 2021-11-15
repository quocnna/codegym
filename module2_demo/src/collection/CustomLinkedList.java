package collection;

public class CustomLinkedList<E> extends CustomAbstractList<E> {
    private Node<E> head;

    public CustomLinkedList(E e){
        head= new Node(e);
        size++;
    }

    public CustomLinkedList(E e, Node<E> nodeRef){
        head= new Node(e, nodeRef);
    }

    public CustomLinkedList() {

    }

    public class Node<E>{
        private E data;
        private Node<E> next;

        public Node(E data){
            this.data= data;
            this.next= null;
        }

        public Node(E data, Node<E> nodeRef){
            this.data= data;
            this.next= nodeRef;
        }
    }

    @Override
    public void add(int i, E e) {
        Node tmp= head;
        for (int j = 0; j < i; j++) {
            tmp= tmp.next;
        }

        Node n= new Node(e, tmp.next);
        tmp.next= n;
        size++;
    }

    @Override
    public void remove(int i) {
        Node tmp= head;
        if(i==0) {
            removeFirst();
        }
        else {
            for (int j = 0; j <= i; j++) {
                if (j == i - 1) {
                    tmp.next = tmp.next.next;
                    break;
                }
                tmp = tmp.next;
            }
        }
        size--;
    }

    public void removeFirst(){
//        Node tmp= head.next;
//        head= tmp;

        head= head.next;
        size--;
    }

    public void removeLast(){
        Node tmp= head;
        while (tmp.next.next!=null)
            tmp= tmp.next;
//
        tmp.next= null;
//
//        Node a= head;
//        Node b= tmp;

//        Node tmp= head;
//        while (head.next!=null)
//            head= head.next;
//        head= head.next;
        size--;
    }

    @Override
    public int indexOf(E e) {
        return 0;
    }

    @Override
    public int lastIndexOf(E e) {
        return 0;
    }

    @Override
    public void clear() {

    }

    @Override
    public void read() {
        Node tmp= head;
        while (tmp!=null){
            System.out.println(tmp.data);
            tmp= tmp.next;
        }
    }

    @Override
    public E get(int i) {
//        E res= null;
//        for (int j = 0; j < size; j++) {
//            if(i==j){
//                res= (E)head.data;
//                break;
//            }
//            head= head.next;
//        }
//        return res;

        for (int j = 0; j < i; j++) {
            head= head.next;
        }
        return head.data;
    }

    public Node addFirst2(E e){
        Node tmp= head;
        head= new Node<>(e);
        head.next= tmp;
        size++;
        return head;
    }

    @Override
    public void addFirst(E e) {

//        Node tmp= new Node(e, head);
//        head= tmp;

        Node tmp= head;
        head= new Node(e);
        head.next= tmp;
        size++;
    }

    @Override
    public void addLast(E e) {
        Node tmp= head;
        if(tmp==null) addFirst(e);
        else {
            while (tmp.next!=null) tmp= tmp.next;
            tmp.next= new Node(e);
        }
        size++;
    }

    public void addAfter(Node node, E e){
        Node tmp= new Node(e, node.next);
        node.next= tmp;
        size++;
    }
}
