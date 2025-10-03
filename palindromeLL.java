public class palindromeLL {
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

    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
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
        System.out.println();
    }
   public Node findMid(Node head){
        Node slow=head;
        Node fast=head;

        while (fast!=null&&fast.next!=null){
            slow=slow.next;//+1
            fast=fast.next.next;//+2
        }
        return slow;//mid
   }
   public boolean checkPalindrome(){
        if(head==null&& head.next==null){
            return true;
        }
        //step1-> find mid
       Node midNode=findMid(head);

       //step2-> reverse 2nd half
       Node prev=null;
       Node curr=midNode;
       Node next;
       while (curr!=null){
           next=curr.next;
           curr.next=prev;
           prev=curr;
           curr=next;
       }
       Node right=prev;
       Node left=head;
       //step3-> check left and right half
       while (right!=null){
           if(left.data!=right.data){
               return false;
           }
           left=left.next;
           right=right.next;
       }
       return true;
   }
    public static void main(String[] args) {
        palindromeLL ll=new palindromeLL();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);
        ll.print();
        System.out.println(ll.checkPalindrome());
    }
}
