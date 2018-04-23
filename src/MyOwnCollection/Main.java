package MyOwnCollection;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args) {
        SimpleArrayList<Integer> array = new SimpleArrayList<>();



        array.add(5);
        array.add(3);
        array.add(7);
        array.add(9);


        array.printList();

       System.out.println(array.indexOf(10));

        System.out.println(array.isListEmpty());

        System.out.println(array.checkIfContains(7));

    }
}
