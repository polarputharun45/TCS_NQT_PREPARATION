import java.util.*;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}




public class CreateLinkedListAndAddElementsAndPrint {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter values count");
        int n= sc.nextInt();

        Node head= null;
        Node tail=null;

        System.out.println("enter values");

        for(int i=0;i<n;i++){
            int m=sc.nextInt();

            Node value = new Node(m);


            if(head==null){
                head =value;
                tail =value; 
            }
            else{
                tail.next=value;
                tail=value;
            }
            
        }
        System.out.println("linked list");

        Node temp = head;

        while(temp!=null){
            System.out.print(temp.data+" >- ");
            temp=temp.next;

        }

        System.out.print("null");




        
    }
}
