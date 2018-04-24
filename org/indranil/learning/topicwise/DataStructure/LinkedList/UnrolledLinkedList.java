package org.indranil.learning.topicwise.DataStructure.LinkedList;

class ULLNode    
{
    private ULLNode next;
    protected int numElements;
    protected int array[];
 
    public ULLNode(int n) {
        next = null;
        numElements = 0;
        array = new int[n];        
    }

	public ULLNode getNext() {
		return next;
	}

	public void setNext(ULLNode next) {
		this.next = next;
	}

	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}
}
 
public class UnrolledLinkedList
{
    private ULLNode start;
    private ULLNode end;
    private int sizeNode;
    private int nNode;
 
    public UnrolledLinkedList(int capacity)
    {
        start = null;
        end = null;
        nNode = 0;
        sizeNode = capacity + 1;
    }
    /*  Function to check if list is empty  */
    public boolean isEmpty()
    {
        return start == null;
    }
    /*  Function to get size of list  */
    public int getSize()
    {
        return nNode;
    }  
    /* Function to clear list */
    public void makeEmpty()
    {
        start = null;
        end = null;
        nNode = 0;
    }
    /* Function to insert element */
    public void insert(int x)
    {
        nNode++;
        if (start == null)
        {
            start = new ULLNode(sizeNode);
            start.array[0] = x;
            start.numElements++;
            end = start;
            return;
        }
        if (end.numElements + 1 < sizeNode)
        {
            end.array[end.numElements] = x;
            end.numElements++;                        
        }
        else
        {
            ULLNode nptr = new ULLNode(sizeNode);
            int j = 0;
            for (int i = end.numElements / 2 + 1; i < end.numElements; i++)
                nptr.array[j++] = end.array[i];
            nptr.array[j++] = x;
            nptr.numElements = j;
            end.numElements = end.numElements/2 + 1;
            end.setNext(nptr);  
            end = nptr;          
        }        
    }
    /* Function to display list */
    public void display()
    {
        System.out.print("\nUnrolled Linked List = ");
        if (nNode == 0) 
        {
            System.out.print("empty\n");
            return;
        }
        System.out.println();
        ULLNode ptr = start;
        while (ptr != null)
        {
            for (int i = 0; i < ptr.numElements; i++)
                System.out.print(ptr.getArray()[i] +" ");
            System.out.println();            
            ptr = ptr.getNext();
        }
    }
  
    public static void main(String[] args)
    {             
        UnrolledLinkedList list = new UnrolledLinkedList(10); 
        list.insert(100);   
        list.insert(200); 
        list.insert(300); 
        list.insert(400); 
        System.out.println("Empty status = "+ list.isEmpty()); 
        list.display();
        System.out.println("Size = "+ list.getSize() +" \n");
        System.out.println("List Cleared\n");
        list.makeEmpty();
        list.display();
    }
}