
//stack implementation with arraylist

// import java.util.ArrayList;
// public class stack_implementation{
//     static class Stack{
//         static ArrayList<Integer> list =new ArrayList<>();
//         public static boolean isEmpty(){
//             return list.size()==0;
//         } 
//         public static void push(int a) {
//             list.add(a);    
//         }
//         public static int pop(){
//             if(isEmpty()){
//                 return -1;
//             }
//             int top=list.get(list.size()-1);
//             list.remove(list.size()-1);
//             return top;
//         }
//         public static int peek(){
//             if(isEmpty()){
//                 return -1;
//             }
//             return list.get(list.size()-1);
//         }
//     }
//     public static void main(String[] args){
//         Stack s=new Stack();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         while(!s.isEmpty()){
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }

//stack implementation with linkedlist
// import java.util.ArrayList;
// public class stack_implementation{
//     static class Node{
//         int data;
//         Node next;
//         Node(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }
//     static class Stack{
//         static Node head=null;
//         public static boolean isEmpty(){
//              return head==null;
//         }
//         public static void push(int data){
//             Node newNode=new Node(data);
//             if(isEmpty()){
//                 head=newNode;
//                 return;
//             }
//             newNode.next=head;
//             head=newNode;
//         }
//         public static int pop(){
//             if(isEmpty()){
//                 return -1;
//             }
//             int temp=head.data;
//             head=head.next;
//             return temp;
//         }
//         public static int peek(){
//             if(isEmpty()){
//                 return -1;
//             }
//             return head.data;
//         }
//     }
//     public static void main(String[] args){
//         Stack s=new Stack();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         while(!s.isEmpty()){
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }

//stack implementation with java collection framework
import java.util.*;
public class stack_implementation{
        public static void main(String[] args){
            Stack<Integer> s=new Stack<>();
           
            s.push(1);
            s.push(2);
            s.push(3);
            while(!s.isEmpty()){
                System.out.println(s.peek());
                s.pop();
            }
    }
}