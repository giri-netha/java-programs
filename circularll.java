import java.util.*;
public class circularll{
    Node head;
    Node tail;
    class Node{
        int  data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void insert(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            tail=newnode;
            return;
        }
        tail.next=newnode;
        newnode.next=head;
        tail=newnode;
    }
    public void delete(int elem){
        Node temp=head;
        if(temp==null){
            return;
        }
        if(head.data==elem){
            head=head.next;
            tail.next=head;
            return;
        }
        do{
            Node n=temp.next;
            if(n.data==elem){
                temp.next=n.next;
                break;
            }
            temp=temp.next;
        }while(temp!=head);
    }
    public void display(){
        Node temp=head;
        if(head==null){
            System.out.println("circular list is empty");
            return;
        }
        if(head!=null){
            do{
                System.out.print(temp.data+"-->");
                temp=temp.next;
            }
            while(temp!=head);
        }
        System.out.println("head");
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        circularll list=new circularll();
        System.out.println("enter the num of elements:");
        int n=sc.nextInt();
        // int a[]=new int[n];
        System.out.println("enter the elements:");
        for (int i=0;i<n;i++){
            // int num=sc.nextInt();
            list.insert(sc.nextInt());
        }
        list.display();
        list.delete(2);
        System.out.println("after delete the element:");
        list.display();

        // circularll list = new circularll();
        // list.insert(5);
        // list.insert(8);
        // list.insert(3);
        // list.insert(9);
        // list.display();
        // list.insert(23);
        // list.display();
        // list.delete(8);
        // list.display();
        sc.close();
    }
   
}
