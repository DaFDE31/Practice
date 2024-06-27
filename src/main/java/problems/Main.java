package problems;

import java.util.Arrays;
//import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        /*int [] one = {1,2,3,4,5};
        int[] two = new int[one.length+5];
        System.arraycopy(one, 0, two, 0, one.length);
        System.out.println(Arrays.toString(one));
        System.out.println(Arrays.toString(two));
        one = two;
        System.out.println(Arrays.toString(one));
        //LinkedList<Character> hello;
        /*LinkedList<Integer> linkTest = new LinkedList<>();
        System.out.println(linkTest.size());
        linkTest.insertAtHead(4);
        System.out.println(linkTest.size());
        linkTest.insertAtHead(6);
        linkTest.insertBefore(4, 5);
        linkTest.insertAfter(5, 9);
        linkTest.insertAfter(0, 3);
        linkTest.insertAtEnd(new Node<Integer>(5, new Node<>(6, new Node<>(0))));
        System.out.println(linkTest);
        linkTest.insertAtHead(new Node<Integer>(1, new Node<>(2, new Node<>(3))));
        System.out.println(linkTest);*/
        ArrayList<Integer> test = new ArrayList<>();
        test.add(5);
        test.add(2);
        test.add(6);
        test.add(9,1);
        test.replace(5,3);
        test.removeAtindex(3);
        System.out.println(test.get(1));

        System.out.println(test.size());
        System.out.println(test.contains(5));
        System.out.println(test.contains(4));
        System.out.println(test.index(2));
        System.out.println(test.get(0));
        System.out.println(test);


    }
}
