import java.util.Scanner;

public class stackwitharray{
    int size;
    int top=-1;
    int arr[];
    stackpractice(int data){
        this.size=data;
        this.arr=new int[size];
    }
    public boolean isEmpty(){
        if (top==-1){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isFull(){
        if(top==arr.length-1){
            return true;
        }
        else{
            return false;
        }
    }
    public void push(int elem){
        if (isFull()){
            System.out.println("stack is full");
        }
        else{
            top+=1;
            arr[top]=elem;
        }
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("stack is empty so pop is not possible");
            return -1;
        }
        else{
            int pop_element=arr[top--];
            return pop_element;
        }
    }
    public void display(){
        for(int i=top;i>=0;i--){
            System.out.println(arr[i]+" ");
        }
    }
    public int peek(){
        int a=arr[top];
        return a;
    }
    public void print_array_reverse()
    {
        if(!isEmpty()){
        System.out.print("Stack Elements In Reverse Order -> ");
        for(int i=top;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
        }
        else{
            System.out.print("Stack Empty....");
        }
        System.out.println();
    }
    
    public static void main(String[] args){
        stackwitharray stack= new stackwitharray(6);
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the value for n");
        int n=sc.nextInt();
        // int arr[]=new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<n;i++){
            stack.push(sc.nextInt());
        }
        System.out.println("result of stack:");
        stack.display();
        System.out.println("popped element is : "+stack.pop());
        System.out.println("after pop element");
        stack.display();
        System.out.println("peek element is :"+stack.peek());
        stack.print_array_reverse();
        // stack.display();


    }
}
