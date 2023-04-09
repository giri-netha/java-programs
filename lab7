import java.util.Scanner;
public class test7 {
static class queue{
        static int[] arr;
        static int size;
        static int rear = -1;
        queue(int n){
            arr = new int[n];
            size = n;
        }
        public static boolean isEmpty(){
            return rear == -1;
        }
        public static boolean isFull(){
            return rear == size-1;
        }
        public static void enque(int element){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            rear++;
            arr[rear]=element;
        }
        public static int deque(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            int front = arr[0];
            for(int i = 0 ; i< rear;i++){
                arr[i]= arr[i+1];
            }
            rear--;
            return front;
        }
        
        public static void display(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return ;
            }
            for(int i = 0; i<=rear;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the Queue");
        int n =sc.nextInt();
        queue Q = new queue(n);
        for(int i = 0; i<(n);i++){
            Q.enque(sc.nextInt());
        }
        Q.display();
        Q.enque(9);
        System.out.println("deleted peek element is "+Q.deque());
        Q.enque(7);
        Q.display();
        sc.close();
    }
    
}

