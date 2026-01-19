import java.util.Scanner;

class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        next = null;
    }
}

public class LinkedList
{
    Node head;

    void add_data()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value to add at end: ");
        int data = sc.nextInt();

        Node newNode = new Node(data);

        if(head == null)
        {
            head = newNode;
        }
        else
        {
            Node current = head;
            while(current.next != null)
            {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    void add_first()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value to add at first: ");
        int data = sc.nextInt();

        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void add_at_index()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value to add: ");
        int data = sc.nextInt();
        System.out.print("Enter index (0-based): ");
        int index = sc.nextInt();

        Node newNode = new Node(data);

        if(index == 0)
        {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        int count = 0;
        while(current != null && count < index - 1)
        {
            current = current.next;
            count++;
        }

        if(current != null)
        {
            newNode.next = current.next;
            current.next = newNode;
        }
        else
        {
            System.out.println("Index out of bounds");
        }
    }

    void r_data()
    {
        Node current = head;
        while(current != null)
        {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();

        list.add_data();
        list.add_data();
        list.add_first();
        list.add_at_index();
        list.r_data();
    }
}
