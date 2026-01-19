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
        System.out.print("Enter value: ");
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
        System.out.print("Enter value at first: ");
        int data = sc.nextInt();

        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
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

    void delete_data()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value to delete: ");
        int data = sc.nextInt();

        if(head == null)
            return;

        if(head.data == data)
        {
            head = head.next;
            return;
        }

        Node current = head;
        while(current.next != null && current.next.data != data)
        {
            current = current.next;
        }

        if(current.next != null)
        {
            current.next = current.next.next;
        }
    }

    public static void main(String[] args)
    {
        LinkedList l = new LinkedList();
        l.add_data();
        l.add_data();
        l.add_first();
        l.r_data();
        l.delete_data();
        l.r_data();
    }
}