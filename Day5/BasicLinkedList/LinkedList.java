package Day5.BasicLinkedList;


public class LinkedList{
    Node head;
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }

    }

    public LinkedList() {
        this.head =null;
    }

    public static void main(String Args[]){
        LinkedList ll =new LinkedList();
    }


}