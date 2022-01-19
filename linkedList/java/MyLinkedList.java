// Fill in each method in the MyLinkedList class to create a working linked list implementation. You can use
// UT_MyLinkedList for testing.
public class MyLinkedList
{
    Node Head;
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
            this.Data = d;
            next = null;
        }
    }

    // Create a linked list that contains the data in the provided array
    public MyLinkedList(int[] initialData)
    {
        
    }
    
    // Add a node to the start of the list
    public void push(int newValue)
    {
        Node new_node = new Node(newValue);
        //newValue I think idk
        new_node.next = Head;
        Head = new_node;
    }
    
    // Add a node at the provided index (such that LinkedList.get(index) == newValue after this call completes)
    public void insert(int data, int index)
    {
        Node new_node = new Node(data);
        new_node.next = getNode(index-1).next;
        getNode(index-1).next = new_node;
    }
    
    // Remove a node from the front of the list
    public int pop()
    {
        Head = Head.next;
        return Head.Data;
    }
    
    // Remove the node at the specified index
    public int remove(int index)
    {
        getNode(index - 1).next = getNode(index).next;
        return getNode(index).Data;
    }
    
    // Set the value of the node at the specified index
    public void set(int newValue, int index)
    {
        getNode(index).Data = newValue;
    }

    public int get(int index)
    {
        return getNode(index).Data;
    }

    public Node getNode(int index)
    {
        Node curNode = Head;
        for(int i = 0; i < index; i++)
        {
            curNode = curNode.next;
        }
        return curNode;
    }
}