class Node{
    int data;
    Node next;
    Node(int n)
    {
        this.data=n;
        this.next=null;
    }
    }
class linkedlist
{
    Node head=null;
    void add(int n)
    {
        Node newnode=new Node(n);
        if(head==null)
        { head=newnode; }
        else{
            Node curr=head;
            while(curr.next!=null)
            {
                curr=curr.next;
            }
            curr.next=newnode;
        }
    }
    void addf(int n)
    {
        Node newnode=new Node(n);
        newnode.next=head;
        this.head=newnode;
    }
    void display()
    {
        Node curr=head;
        while(curr!=null)
        {
            System.out.println(curr.data);
            curr=curr.next;
        }
    }
}
public class Addlast
{
	public static void main(String[] args) {
	    linkedlist l=new linkedlist();
	    l.addf(1);
	    l.addf(2);
	    l.addf(3);
	    l.addf(4);
	    l.addf(5);
	    l.display();
	}
}