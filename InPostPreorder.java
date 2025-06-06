class Node 
{
    int data;
    Node left;
    Node right;
    Node (int data)
    {
        this.data=data;
        this.left=null;
        this.right=null;
    }
    }
class tree
{
    Node root;
    tree()
    {
        this.root=null;
    }
    void insert(int n)
    {
        Node newnode=new Node(n);
        if(this.root==null) this.root=newnode;
        else
        {
            Node curr=this.root;
            while(true)
            {
                if(n>curr.data)
                {
                    if(curr.right==null)
                    { curr.right=newnode;
                    break;
                    }
                    else
                    {
                        curr=curr.right;
                    }
                }
                else
                {
                    if(curr.left==null)
                { curr.left=newnode;
                    break;
                }
                else{
                    curr=curr.left;
                }
            }
        }
    }
}
void inorder(Node root)
{
    if(root!=null)
    {
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
    }
void preorder(Node root)
    {
        if(root!=null)
        {
            System.out.println(root.data);
            preorder(root.left);
            preorder(root.right);
        }
    }
void postorder(Node root)
    {
        if(root!=null)
        {
            postorder(root.left);
            postorder(root.right);
            System.out.println(root.data);
        }
    }
}
public class InPostPreorder
{
	public static void main(String[] args) {
	    tree t=new tree();
	    t.insert(3);
	    t.insert(5);
	    t.insert(1);
	    t.inorder(t.root);
	    t.preorder(t.root);
	    t.postorder(t.root);
	}
}
