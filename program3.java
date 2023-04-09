import java.util.Scanner;

public class program3 {
    public class node{
        int info;
        node next;
        node(int element){
            this.info=element;
            this.next=null;
        }
    }
    node head;
    public void insert(int element){
        if(head==null){
            node new_node= new node(element);
            head=new_node;
            return;
        }
        if(head!=null){
            node new_node = new node(element);
            node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=new_node;
        }
    }
    public void printlist(){
        System.out.println();
        node travers = head;
        while(travers!=null){
            System.out.print(travers.info+" ");
            travers=travers.next;
        }
    }
    public void delete(int element){

        if(head==null){
            System.out.println("list is empty!");
            return;
        }
        if(head.info==element){
            if(head.next==null){
                head=null;
            }else{
                head=head.next;
            }
            return;
        }
        node itr = head;
        node prev=itr;
        while(itr.info!=element && itr!=null){
            prev=itr;
            itr=itr.next;
        }
        if(itr==null){
            System.out.println("element is not found");
            return;
        }
        if(itr.info==element){
            if(itr.next==null){
                prev.next=null;
            }
            else{
                prev.next=itr.next;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        program3 l = new program3();
        // l.insert(11);
        for(int i=1;i<6;i++){
            l.insert(i);
        }
        l.printlist();
        System.out.println("\n enter the element to be deleted");
        int key = sc.nextInt();
        l.delete(key);
        l.printlist();
        sc.close();

        
    }
}
