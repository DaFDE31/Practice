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
        expected = "[Wordly]";
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
        expected = "[Wow, Wordly]";
        actual = strTest.toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void HeadTest2(){
        intTest.insertAtHead(new Node<Integer>(3, new Node<Integer>(5)));
        String expected = "[3, 5, 2]";
        String actual = intTest.toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void EndTest(){
        intTest.insertAtEnd(7);
        strTrst.insertAtEnd(new Node<String>("Plan", new Node<String>("Doubly")))
        String expected = "[3, 5, 2, 7]";
        String actual = intTest.toString();
         Assert.assertEquals(expected, actual);
        expected = "[Wow, Wordly, Plan, Doubly]";
        actual = strTest.toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void ReplaceTest(){
        intTest.insertAtEnd(2, 6);
        strTrst.insertAtEnd("Doubly", "Wildy")
        String expected = "[3, 5, 6, 7]";
        String actual = intTest.toString();
         Assert.assertEquals(expected, actual);
        expected = "[Wow, Wordly, Plan, Wildy]";
        actual = strTest.toString();
        Assert.assertEquals(expected, actual);
    }
}
