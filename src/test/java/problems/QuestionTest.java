package problems;

import org.junit.Assert;
import org.junit.Test;

public class QuestionTest {
    @Test
    public void gcfTest1(){
        int expected = 5;
        int actual = Questions.gcf(5,10);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void gcfTest2(){
        int expected = 13;
        int actual = Questions.gcf(1,13);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void gcfTest3(){
        int expected = 10; // Replaced the 5 here with 10
        int actual = Questions.gcf(100,30);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void gcfTest4(){
        int expected = 2;
        int actual = Questions.gcf(100,2);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void gcfTest5(){
        int expected = 45;
        int actual = Questions.gcf(45,90);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void cutTest1(){
        String [] expected = {"Ho", "Wd"};
        String [] actual = Questions.cut(new String[]{"Hello", "World"});
        Assert.assertArrayEquals(expected, actual);

    }

    @Test
    public void cutTest2(){
        String [] expected = {"To", "Te", "Ed"};
        String [] actual = Questions.cut(new String[]{"To", "The", "End"});
        Assert.assertArrayEquals(expected, actual);
    }

}
