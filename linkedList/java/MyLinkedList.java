// Fill in each method in the MyLinkedList class to create a working linked list implementation. You can use
// UT_MyLinkedList for testing.
public class MyLinkedList
{
    Node head;
    // Create an empty linked list
    public MyLinkedList()
    {

    }

    private class Node
    {
        int Data;
        Node next;
        Node prev;

        public Node(int d)
        {
            this.Data = d;
            next = null;
        }
    }

    // Create a linked list that contains the data in the provided array
    public MyLinkedList(int[] initialData)
    {
        for (int i = 0; i < 3; i++)
        {
            if (i == 0)
            {
                push(initialData[i]);
            }
            else
            {
                insert(initialData[i], i);
            }
        }
    }
    
    // Add a node to the start of the list
    public void push(int newValue)
    {
        Node new_node = new Node(newValue);
        new_node.next = head;
        head = new_node;
        if (head != null)
        {
            head.prev = new_node;
            new_node.prev = null;
            head = new_node;
        }
    }
    
    // Add a node at the provided index (such that LinkedList.get(index) == newValue after this call completes)
    public void insert(int data, int index)
    {
        Node new_node = new Node(data);
        new_node.next = getNode(index-1).next;
        new_node.prev = getNode(index-1);
        getNode(index-1).next = new_node;
        if (new_node.next != null)
        {
            getNode(index+1).prev = new_node;
        } //brain farts! (called it)
    }

    // Remove a node from the front of the list
    public int pop()
    {
        int bye = head.Data;
        head = head.next;
        head.prev = null; //idk this
        return bye;
    }
    
    // Remove the node at the specified index
    public int remove(int index)
    {
        int bye = getNode(index).Data;
        getNode(index - 1).next = getNode(index).next;
        if (getNode(index).next != null)
        {
            getNode(index + 1).prev = getNode(index).prev;
        }
        return bye;
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
        Node curNode = head;
        for(int i = 0; i < index; i++)
        {
            curNode = curNode.next;
        }
        return curNode;
    }
}