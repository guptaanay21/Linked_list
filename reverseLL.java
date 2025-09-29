public class reverseLL {
        public static class Node{
            int data;
            Node next;
            public Node(int data){
                this.data=data;
                this.next=null;
            }
        }
        public static Node head;
        public static Node tail;

        public void addFirst(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        public void reverse(){
            Node prev=null;
            Node curr=tail=head;
            Node next;

            while ((curr!=null)){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            head=prev;
        }
    public void print(){
        if(head==null){
            System.out.println("linked list is empty");
            return;
        }
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
            reverseLL ll=new reverseLL();
            ll.addFirst(5);
            ll.addFirst(4);
            ll.addFirst(3);
            ll.addFirst(2);
            ll.addFirst(1);
            ll.print();
            ll.reverse();
            ll.print();


    }
}
