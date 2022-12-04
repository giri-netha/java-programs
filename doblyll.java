import java.util.*;
public class doublyll {
    Node head;
    public class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public void insertfirst(int data){
        Node newnode=new Node(data);
        if (head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head.prev=newnode;
        head = newnode;
    }
    public void insertlast(int data){
        Node newnode=new Node(data);
        if (head==null){
            head=newnode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
        newnode.prev= temp;
    }
    public void deletefirst(){
        if (head==null){
            return;
        }
        Node temp=head;
        head=head.next;
        temp.next=null;
        head.prev=null;
    }
    public void deletelast(){
        if (head==null){
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
   

        temp.prev.next=null;
    }
    public int delete_pos(int data){
        if (head==null){
            return -1;
        }
        Node temp=head;
        while(temp!=null&&temp.data!=data){
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("element not found");
            return -1;
        }
        if(temp.data==data){
            int res;
            if(temp.next==null&&temp.prev==null){
                res =head.data;
                head=null;
            }
            else if(temp.next==null){
                res = temp.data;
                temp.prev.next=null;
            }
            else{
                res = temp.data;
                temp.prev.next=temp.next;
                temp.next.prev=temp.prev;
                temp=null;
            }
            return res;
        }
        return -1;
    }
    public void display(){
        if (head==null){
            System.out.println("list is empty");
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.print(temp.data);
        System.out.println();
        
    }
    public static void main(String[] args){
        doublyll list=new doublyll();
        Scanner sc=new Scanner(System.in);
    //   System.out.println("Enter your option : \n1.insert at first\n2.insert at last\n3.delete at first.\n4.deletelast\n5.delete position\n6.display\n7.exit");
      System.out.println("enter the num");
      int n = sc.nextInt();
        for(int i=1;i<n;i++){
            list.insertfirst(sc.nextInt());
        }
        list.display();
        
    //   while(n!=7){
    //     if(n==1){
    //         System.out.println("Enter the element\n");
    //         list.insertfirst(sc.nextInt());
    //     }
    //     else if(n==2){
    //         System.out.println("Enter the element\n");
    //         list.insertlast(sc.nextInt());
            
    //     }
    //     else if(n==3){
    //         list.deletefirst();
    //     }
    //     else if(n==4){
    //         list.deletelast();        }
    //     else if(n==5){
    //         System.out.println("Enter the position element to be deleted");
    //         int del = sc.nextInt();
    //         System.out.println("the element : "+list.delete_pos(del)+ "deleted");
    //     }
    //     else if(n==6){
    //         list.display();
    //     }
    //     else if(n==7){
    //         break;
    //     }
    //     else{
    //         System.out.println("Enter valid num or 7 to exit..");
    //     }
    //     System.out.println("Enter your option: ");
    //     n=sc.nextInt();
    //   }

      sc.close();
    }
}
