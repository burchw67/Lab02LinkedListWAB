import java.util.Scanner;

public class Lab02LinkedListWAB
{
    public static void main(String[] args)
    {
       String introString = "Welcome to the Linked List Menu System\n" +
                            "Author: William Anthony Burch\n" +
                            "Using Singly Linked Lists\n\n" +
                            "1. Place an element at the head of the Linked List\n" +
                            "2. Place an element at the tail of the Linked List\n" +
                            "3. Remove an element from the head of the Linked List\n" +
                            "4. Remove an element from the tail of the Linked List\n" +
                            "5. Examine the element at the head of the Linked List\n" +
                            "6. Examine the element at the tail of the Linked List\n" +
                            "7. Place an element at a given position in the Linked List\n" +
                            "8. Remove an element at a given position in the Linked List\n" +
                            "9. Examine an element at a given position in the Linked List\n" +
                            "10. Examine an element and its successor at a given position in the Linked List\n" +
                            "11. Check if the Linked List is empty\n" +
                            "12. Get the current size of the Linked List\n" +
                            "13. Clear the contents of the Linked List\n" +
                            "14. Print the contents of the Linked List\n" +
                            "15. Quit\n\n" +
                            "Enter Your Choice:";
        String quit = "N";
        String choice = "x";
        String charChoice;
        int pos = 0;

       LinkedList<Character> labLL = new LinkedList<Character>();

       Scanner inp = new Scanner(System.in); // Create scanner

        while (quit.charAt(0) != 'Y' && quit.charAt(0) != 'y')
        {
            System.out.print(introString); // Print introduction string
            choice = inp.nextLine();
            charChoice = "";

            switch (choice)
            {
                case "1":
                    System.out.print("Enter the character to add:");
                    charChoice = inp.next();

                    if(charChoice.length() != 1)
                    {
                        System.out.println("Entry must contain exactly one character\n");
                        break;
                    }
                    else
                    {
                        System.out.println(charChoice + " Inserted at head!\n");
                        labLL.insertAtHead(charChoice.charAt(0));
                        break;
                    }

                case "2":
                    System.out.print("Enter the character to add:");
                    charChoice = inp.next();

                    if(charChoice.length() != 1)
                    {
                        System.out.println("Entry must contain exactly one character\n");
                        break;
                    }
                    else
                    {
                        System.out.println(charChoice + "Inserted at Tail!\n");
                        labLL.insertAtTail(charChoice.charAt(0));
                        break;
                    }

                case "3":
                    if(labLL.isEmpty())
                    {
                        System.out.println("You cannot remove elements from an empty Linked List\n");
                        break;
                    }
                    else
                    {
                        System.out.println("Head removed from the Linked List\n");
                        labLL.deleteAtHead();
                        break;
                    }

                case "4":
                    if(labLL.isEmpty())
                    {
                        System.out.println("You cannot remove elements from an empty Linked List\n");
                        break;
                    }
                    else
                    {
                        System.out.println("Tail removed from the Linked List\n");
                        labLL.deleteAtTail();
                        break;
                    }

                case "5":
                    labLL.getHead();
                    break;

                case "6":
                    labLL.getTail();
                    break;

                case "7":
                    System.out.print("Enter data to insert:");

                    charChoice = inp.next();

                    if(charChoice.length() != 1)
                    {
                        System.out.println("Entry must contain exactly one character\n");
                        break;
                    }
                    else
                    {
                        System.out.print("Enter position to add " + charChoice + " to:");
                        pos = Integer.parseInt(inp.next());

                        labLL.insertAtPos(charChoice.charAt(0), pos);
                        break;
                    }

                case "8":
                        System.out.print("Enter position to delete:");
                        pos = Integer.parseInt(inp.next());

                        if(pos > labLL.size-1 || pos < 0)
                        {
                            System.out.println("Position cannot exceed Linked List size\n");
                            break;
                        }
                        else
                        {
                            labLL.deleteAtPos(pos);
                            System.out.print("Position " + pos + " deleted!\n");
                            break;
                        }

                case "9":
                    System.out.print("Enter position to examine:");
                    pos = Integer.parseInt(inp.next());

                    if(pos > labLL.size-1 || pos < 0)
                    {
                        System.out.println("Position cannot exceed Linked List size\n");
                        break;
                    }
                    else
                    {
                        System.out.println("Data at position " + pos + " is: " + labLL.examineElementAtPos(pos) + "\n");
                        break;
                    }

                case "10":
                    System.out.print("Enter position to examine:");
                    pos = Integer.parseInt(inp.next());

                    if(pos > labLL.size-1 || pos < 0)
                    {
                        System.out.println("Position cannot exceed Linked List size\n");
                        break;
                    }
                    else
                    {
                        if(pos == labLL.size - 1)
                        {
                            System.out.println("Data at position " + pos + " is: " + labLL.examineElementAtPos(pos) + "\n");
                            System.out.println("It has no successor\n");
                        }
                        else
                        {
                            System.out.println("Data at position " + pos + " is: " + labLL.examineElementAtPos(pos) + "\n");
                            System.out.println("It is succeeded by " + labLL.examineElementAtPos(pos + 1) + "\n" );
                        }
                        break;
                    }

                case "11":
                    if(labLL.isEmpty())
                    {
                        System.out.println("The list is empty!\n");
                        break;
                    }
                    else
                    {
                        System.out.println("The list is not empty!\n");
                        break;
                    }

                case "12":
                    System.out.println("The linked list is of size " + labLL.size + "\n");
                    break;

                case "13":
                    labLL.clearList();
                    System.out.println("The linked list is cleared!\n");
                    break;

                case "14":
                    labLL.PrintList();
                    break;

                case "15":
                    System.out.print("Are you sure you want to quit? [Y/N]");
                    quit = inp.nextLine();

                    if(Character.toUpperCase(quit.charAt(0)) == 'N' || Character.toLowerCase(quit.charAt(0)) == 'n')
                    {
                        break;
                    }
                    else if(Character.toUpperCase(quit.charAt(0)) == 'Y' || Character.toLowerCase(quit.charAt(0)) == 'y')
                    {
                        quit = "yes";
                        break;
                    }
                    else
                    {
                        break;
                    }

                default:
                    break;
            }
        }
    }
}