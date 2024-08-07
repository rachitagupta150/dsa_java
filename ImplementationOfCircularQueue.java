//implementation of queue using array
// public class implementation_of_queue {
//     static class Queue{
//         static int arr[];
//         static int size;
//         static int rear;
//         Queue(int n){
//             arr=new int[n];
//             size=n;
//             rear=-1;
//         }
//         public static boolean isEmpty(){
//             return rear==-1;
//         }
//         public static void add(int data){
//             if(rear==size-1){
//                 System.out.println("queue is full");
//                 return;
//             }
//             rear=rear+1;
//             arr[rear]=data;
//         }
//         public static int remove(){
//             if(isEmpty()){
//                 System.out.println("empty queue");
//                 return -1;
//             }
//             int front=arr[0];
//             for(int i=0;i<rear;i++){
//                 arr[i]=arr[i+1];
//             }
//             rear =rear-1;
//             return front;
            
//         }
//         public static int peek(){
//             if(isEmpty()){
//                 System.out.println("empty queue");
//                 return -1;
//             }
//             return arr[0];
//         }
//     }
//     public static void main(String[] args) {
//         Queue q=new Queue(5);
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         while(!q.isEmpty()){
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }


//implementation of circular queue using array
public class ImplementationOfCircularQueue {
    static class Queue {
        private int[] arr;
        private int size;
        private int rear;
        private int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public boolean isEmpty() {
            return front == -1;
        }

        public boolean isFull() {
            return (rear + 1) % size == front;
        }

        public void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            if (isEmpty()) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int result = arr[front];
            if (front == rear) {
                front = rear = -1; 
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
