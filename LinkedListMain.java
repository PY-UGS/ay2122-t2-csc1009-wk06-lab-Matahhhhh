import java.util.LinkedList;
import java.util.Random;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<Integer> linkedlist = new LinkedList<Integer>();
        linkedlist.add(1);
        linkedlist.add(3);
        linkedlist.add(5);
        linkedlist.add(7);
        linkedlist.add(9);
        linkedlist.add(11);

        System.out.println("LinkedList before add and sort: " + linkedlist);
        addAndSort(linkedlist, 6);
        System.out.println("LinkedList after add and sort: " + linkedlist);
        swapValues(linkedlist, 1, 6);
        System.out.println("LinkedList after swapping: " + linkedlist);
        System.out.println("Random LinkedList: " + randomLinkedList());
    }

    public static void addAndSort(LinkedList<Integer> linkedlist, int value){
        if ((int)linkedlist.get(linkedlist.size()-1)< value){
            linkedlist.add(linkedlist.size(), value);
        }
        else {
            int i = 0;
            while ((int)linkedlist.get(i)< value){
                i++;
            }
            linkedlist.add(i,value);
        }
            
        
    }

    public static void swapValues(LinkedList<Integer> linkedList, int value1, int value2){
        int tempnum1 = (int)linkedList.get(value1);
        int tempnum2 = (int)linkedList.get(value2);

        linkedList.remove(value1);
        linkedList.add(value1, tempnum2);
        linkedList.remove(value2);
        linkedList.add(value2,tempnum1);
        }

    public static int randomLinkedList(){
        Random rand = new Random();

        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        int index = -1;

        for (int i = 0; i <500; i++){
            linkedList.add(rand.nextInt(1000,10000));
        }
        int randomNumber = rand.nextInt(1000,10000);
        for (int i = 0 ; i < 500 ; i++){
            if ((int)linkedList.get(i) == randomNumber){
                index = i;
            }
        }
        return index;
    }
}