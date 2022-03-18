/**
 * Created by TGC on 18/03/2022.
 */
public class Node {
    /*give an algorithm for finding the
     second-to-last node in a singly
    linked list in which the last node is
    indicated by a null next reference*/

        int data;
        Node next;
        Node (int s){
            this.data=s;
            this.next=null;
        }
        static class LinkedList{
            Node start;
            LinkedList()
            {
               start=null;
            }
            public void push(int data)
            {
                if (this.start==null){
                    Node temp=new Node(data);
                    this.start=temp;
                }
                else
                {
                    Node temp=new Node(data);
                    temp.next=this.start;
                    this.start=temp;
                }

            }
            public int findSecondLaestNode(Node ptr){
                Node temp=ptr;
                if (temp==null||temp.next==null)
                    return -1;

                while (temp.next.next!=null){
                    temp=temp.next;
                }

                    return temp.data;

        }

            public static void main(String[] args) {
                LinkedList b=new LinkedList();
                b.push(12);
                b.push(29);
                b.push(11);
                b.push(23);
                b.push(8);
                System.out.println(b.findSecondLaestNode(b.start));

            }
    }
}
