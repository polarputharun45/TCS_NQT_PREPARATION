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
        int count=0;
        

        // Node temp = head;

        // while(temp!=null){
        //     System.out.print(temp.data+" >- ");
        //     count++;
        //     temp=temp.next;

        // }

        // System.out.println("count  "+count+ "  null");



        // int sum=0;

        // temp = head;

        // while(temp!=null){
        //     sum+=temp.data;
        //     temp=temp.next;
            
        // }
        // System.out.println("sum " + sum);


        // Node temp = head;
        // int max= head.data;

        // while(temp!=null){
        //     if(temp.data>max){
        //         max=temp.data;

        //     }
        //     temp=temp.next;
        // }
        // System.out.println("max "+max);


        // Node temp = head;

        // int key =30;
        
        // while(temp!=null){
        //     if(temp.data==key){
        //         System.out.println("found");
        //         break;
        //     }
        //     temp = temp.next;
        // }

 
        
        // Node temp= head;
        // int min=temp.data;
        // while(temp!=null){
        //     if(temp.data<min){
        //         min=temp.data;
        //     }

        //     temp=temp.next;
        // }
        // System.out.println("min "+min);




        Node prev =null;
        Node curr = head;

        while(curr!=null){
            Node next =curr.next;
            curr.next= prev;
            prev = curr;
            curr= next;

        }
        head=prev;




        // Print Reversed List
        System.out.println("Reversed Linked List:");

        Node temp = head;

        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        // Find Middle Element

Node slow = head;
Node fast = head;

while(fast != null && fast.next != null){
    slow = slow.next;
    fast = fast.next.next;
}

System.out.println("Middle Element: " + slow.data);





        





        




        
    }
}
