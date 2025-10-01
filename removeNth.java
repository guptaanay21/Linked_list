public class removeNth {
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

    public void addFirst(int data){
        Node newNode=new Node(data);
            if(head==null){
                head=tail=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        public void print(){
        if(head==null){
            System.out.println("ll is empty");
            return;
        }
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
            System.out.println("null");
    }
    public void deleteNthFromEnd(int n){
        //calculate size
        int sz=0;
        Node temp=head;
        while (temp!=null){
            temp=temp.next;
            sz++;
        }
        if(n==sz){
            head=head.next;//remove first
            return;
        }
        //sn-n
        int i=1;
        int iToFind=sz-n;
        Node prev=head;
        while (i<iToFind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }
    public static void main(String[] args) {
        removeNth ll=new removeNth();
        ll.print();
        ll.addFirst(5);
        ll.print();
        ll.addFirst(4);
        ll.print();
        ll.addFirst(3);
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.deleteNthFromEnd(3);
        ll.print();

    }
}
