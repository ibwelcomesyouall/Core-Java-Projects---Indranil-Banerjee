package org.indranil.learning.topicwise.DataStructure.LinkedList;

class SkipNode        
{
    private int element;
    private SkipNode right;
    private SkipNode down;
 
    public SkipNode(int x)
    {
        this(x, null, null);
    }

    public SkipNode(int x, SkipNode rt, SkipNode dt)
    {
        element = x;
        right = rt;
        down = dt;
    }
	public int getElement() {
		return element;
	}
	public void setElement(int element) {
		this.element = element;
	}
	public SkipNode getRight() {
		return right;
	}
	public void setRight(SkipNode right) {
		this.right = right;
	}
	public SkipNode getDown() {
		return down;
	}
	public void setDown(SkipNode down) {
		this.down = down;
	}
}
 
public class SkipList
{
    private SkipNode header;
    private int infinity;
    private SkipNode bottom = null;
    private SkipNode tail = null;
 
    public SkipList(int inf)
    {
        infinity = inf;
        bottom = new SkipNode(0);
        bottom.setRight(bottom); 
        bottom.setDown(bottom);
        tail = new SkipNode(infinity);
        tail.setRight(tail);
        header = new SkipNode(infinity, tail, bottom);
    }
    /* Function to insert element */
    public void insert(int x)
    {
        SkipNode current = header;
        bottom.setElement(x);
        while (current != bottom)
        {
            while (current.getElement() < x)
            current = current.getRight();
            /*  If gap size is 3 or at bottom level and must insert, then promote middle element */
            if (current.getDown().getRight().getRight().getElement() < current.getElement())
            {
                current.setRight(new SkipNode(current.getElement(), current.getRight(), current.getDown().getRight().getRight()));
                current.setElement(current.getDown().getRight().getElement());
            }
            else
                current = current.getDown();
        }
        /* Raise height of skiplist if necessary */
        if (header.getRight() != tail)
            header = new SkipNode(infinity, tail, header);
    }
    /* Function to clear list */
    public void makeEmpty()
    {
        header.setRight(tail);
        header.setDown(bottom);
    }
    /* Function to check if empty */
    public boolean isEmpty()
    {
        return header.getRight() == tail && header.getDown() == bottom;
    }
    /* Function to get node at a position */
    public int elementAt(SkipNode t)
    {
        return t == bottom ? 0 : t.getElement();
    }
    /* Function to print list */
    public void printList()
    {
        System.out.print("\nSkiplist = ");
        SkipNode current = header;
        while( current.getDown() != bottom )
            current = current.getDown();
        while (current.getRight() != tail )
        {
            System.out.print(current.getElement() +" ");
            current = current.getRight();
        }
        System.out.println();
    }   

    public static void main(String[] args)
    {            
        SkipList sl = new SkipList(100000000); 
        System.out.println("SkipList List Test\n");          
        sl.insert(100);
        sl.insert(50);
        sl.insert(30);
        sl.insert(200);
        sl.insert(300);
        sl.printList();
        System.out.println("Empty status = "+ sl.isEmpty());
        System.out.println("List cleared\n");
        sl.makeEmpty();
     }
}