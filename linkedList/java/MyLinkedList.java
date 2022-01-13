// Fill in each method in the MyLinkedList class to create a working linked list implementation. You can use
// UT_MyLinkedList for testing.
public class MyLinkedList
{
    // Create an empty linked list
    public MyLinkedList()
    {

    }

    private class Node
    {
        int Data;
        Node next;

        public Node(int d)
        {
            Data = d;
            next = null;
        }
    }

    public void insert (MyLinkedList list, int data)
    {
        Node new_node = new Node(data);
        new_node.next = new_node;
    }

    // Create a linked list that contains the data in the provided array
    public MyLinkedList(int[] initialData)
    {
    }
    
    // Add a node to the start of the list
    public void push(int newValue)
    {
    }
    
    // Add a node at the provided index (such that LinkedList.get(index) == newValue after this call completes)
    public void insert(int newValue, int index)
    {
    }
    
    // Remove a node from the front of the list
    public int pop()
    {
        return 0;
    }
    
    // Remove the node at the specified index
    public int remove(int index)
    {
        return 0;
    }
    
    // Set the value of the node at the specified index
    public void set(int newValue, int index)
    {
    }
    
    // Return the value held by the node at the specified index
    public int get(int index)
    {
        return 0;
    }
}