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

    @Test
    public void IndexReplaceTest1(){
        int [] array = {1,2,6,4};
        Questions.replaceAtindex(array, 2, 3);
        Assert.assertArrayEquals(new int[]{1,2,3,4}, array);
    }

    @Test
    public void IndexReplaceTest2(){
        int [] array = {10,9,8,7,2};
        Questions.replaceAtindex(array, 4, 6);
        Assert.assertArrayEquals(new int[]{10,9,8,7,6}, array);
    }

    @Test
    public void replaceTest(){
        int [] array = {1,2,6,4};
        Questions.replace(array, 6, 3);
        Assert.assertArrayEquals(new int[]{1,2,3,4}, array);
    }

    @Test
    public void replaceTest2(){
        int [] array = {10,9,8,10,10};
        Questions.replace(array, 10, 1);
        Assert.assertArrayEquals(new int[]{1,9,8,1,1}, array);
    }

    @Test
    public void longestTest(){
        int expected = 5;
        int [] one = {};
        int [] two = {1,2,3,4,5};
        int actual = Questions.longestArray(new int[][]{one, two});
        Assert.assertEquals(expected, actual);
    }

    

}
