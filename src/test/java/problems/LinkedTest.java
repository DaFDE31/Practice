package problems;

import org.junit.Assert;
import org.junit.Test;

public class LinkedTest {

    LinkedList<Integer> intTest = new LinkedList<>();
    LinkedList<String> strTest = new LinkedList<>("Worldly");
    @Test
    public void initTest(){
        String expected = "[]";
        String actual = intTest.toString();
        Assert.assertEquals(expected, actual);
        expected = "[Worldly]";
        actual = strTest.toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void HeadTest(){
        intTest.insertAtHead(2);
        strTest.insertAtHead("Wow");
        String expected = "[2]";
        String actual = intTest.toString();
        Assert.assertEquals(expected, actual);
        expected = "[Wow, Worldly]";
        actual = strTest.toString();
        Assert.assertEquals(expected, actual);
        System.out.println(intTest.toString());

    }

    @Test
    public void HeadTest2(){
        intTest.insertAtHead(2);
        intTest.insertAtHead(new Node<Integer>(3, new Node<Integer>(5)));
        String expected = "[3, 5, 2]";
        String actual = intTest.toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void EndTest(){
        intTest.insertAtHead(new Node<Integer>(3, new Node<Integer>(5, new Node<Integer>(2))));
        intTest.insertAtEnd(7);
        strTest.insertAtHead(new Node<String>("Wow"));
        strTest.insertAtEnd(new Node<String>("Plan", new Node<String>("Doubly")));
        String expected = "[3, 5, 2, 7]";
        String actual = intTest.toString();
        Assert.assertEquals(expected, actual);
        expected = "[Wow, Worldly, Plan, Doubly]";
        actual = strTest.toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void ReplaceTest(){
        intTest.insertAtHead(new Node<Integer>(3, new Node<Integer>(5, new Node<Integer>(2))));
        intTest.insertAtEnd(7);
        strTest.insertAtHead(new Node<String>("Wow"));
        strTest.insertAtEnd(new Node<String>("Plan", new Node<String>("Doubly")));
        intTest.replace(2, 6);
        strTest.replace("Doubly", "Wildy");
        String expected = "[3, 5, 6, 7]";
        String actual = intTest.toString();
         Assert.assertEquals(expected, actual);
        expected = "[Wow, Worldly, Plan, Wildy]";
        actual = strTest.toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containsTest(){
        intTest.insertAtHead(new Node<Integer>(3, new Node<Integer>(5, new Node<Integer>(2, new Node<>(7)))));
        Assert.assertTrue(intTest.contains(3));
        Assert.assertFalse(intTest.contains(4));
    }

    @Test
    public void sizeTest(){
        intTest.insertAtHead(new Node<Integer>(3, new Node<Integer>(5, new Node<Integer>(2, new Node<>(7)))));
        Assert.assertEquals(4, intTest.size());

        strTest.insertAtHead(new Node<String>("Wow"));
        strTest.insertAtEnd(new Node<String>("Plan", new Node<String>("Doubly")));
        Assert.assertEquals(4, strTest.size());


    }

    @Test
    public void removeTest(){
        strTest.remove("Worldly");
        Assert.assertEquals("[]", strTest.toString());

        intTest.insertAtHead(new Node<Integer>(3, new Node<Integer>(5, new Node<Integer>(2, new Node<>(7)))));
        intTest.remove(5);
        Assert.assertEquals("[3, 2, 7]", intTest.toString());
    }

    @Test
    public void insertTest(){
        intTest.insertAtHead(new Node<Integer>(3, new Node<Integer>(5, new Node<Integer>(2, new Node<>(7)))));

        intTest.insertBefore(5,4);
        Assert.assertEquals("[3, 4, 5, 2, 7]", intTest.toString());

        intTest.insertAfter(5,6);
        Assert.assertEquals("[3, 4, 5, 6, 2, 7]", intTest.toString());

    }
}
