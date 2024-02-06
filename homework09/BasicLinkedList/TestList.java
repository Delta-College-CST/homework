// Delta College - CST 283 - Klingler                  
// Homework 9 - Linked List testing

public class TestList
{     
    public static void main(String [] args)
    {
        LinkedList<Integer> theList = new LinkedList<Integer>();

        theList.add(12);
        theList.add(23);
        theList.add(34);
        theList.add(56);
        theList.add(98);
        theList.add(76);
        theList.add(54);
        theList.add(21);
        
        System.out.println("List:");
        System.out.print(theList + "\n");

       theList.remove(98);

       if (theList.contains(76))
           System.out.println(76 + " in list");
       else
           System.out.println(76 + " not in list");

       theList.append(99);

        System.out.println("List:");
        System.out.print(theList + "\n");

        System.out.print("List size:");
        System.out.print(theList.size() + "\n");
    }  
}
