package LinkList;

public class Mai {

    public static void main(String[] args) {
        Node node = new Node();
        node.data = 1;

        Node two = new Node();
        two.data = 2;

        Node three = new Node();
        three.data = 3;

        Node four = new Node();
        four.data = 4;
        four.next = null;


        three.next = four;
        two.next = three;
        node.next = two;

        while (node!=null){
            System.out.print(node.data+" ");
            node = node.next;
        }
    }
}
