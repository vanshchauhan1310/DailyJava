package Day5.Insertion;


public class Insertion{
    Node head;
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }

    }


    public void insertionAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }

        else{
            Node temp = head;

            while (temp.next!= null) temp =  temp.next;
            temp.next = newNode;
        }
    }


    public void insertionAtStart(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }

    }


    public void insertionAfter(int data1,int data2){

        if(head == null){
            System.out.println("List is empty");
        }

        else{
            Node temp = head;
            
            while (temp.data!=data1) temp = temp.next;
            Node nextnode = temp.next;
            Node newNode = new Node(data2);
            temp.next = newNode;
            newNode.next = nextnode;
        }
    }


    public void printList(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

        System.out.println();
     }



    public static void main(String Args[]){
        Insertion li =new Insertion();

        li.insertionAtStart(1);
        li.insertionAtEnd(10);
        li.insertionAtEnd(20);
        li.insertionAfter(20, 25);
        li.insertionAtEnd(30);
        li.insertionAtEnd(40);
        li.printList();
    }


}