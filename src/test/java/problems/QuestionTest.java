package problems;

import org.junit.Assert;
import org.junit.Test;

public class QuestionTest {

    Questions tester = new Questions();
    @Test
    public void gcfTest1(){
        int expected = 5;
        int actual = Questions.gcf(5,10);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void gcfTest2(){
        int expected = 1;
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
        String [] actual = new String[]{"Hello", "World"};
        Questions.cut(actual);
        Assert.assertArrayEquals(expected, actual);

    }

    @Test
    public void cutTest2(){
        String [] expected = {"To", "Te", "Ed"};
        String [] actual = new String[]{"To", "The", "End"};
        Questions.cut(actual);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void IndexReplaceTest1(){
        Integer [] expected = {1,2,3,4};
        Integer [] array = {1,2,6,4};
        tester.replaceAtindex(array, 2, 3);
        Assert.assertArrayEquals(expected, array);
    }

    @Test
    public void IndexReplaceTest2(){
        Integer [] expected = {10,9,8,7,6};
        Integer [] array = {10,9,8,7,2};
        tester.replaceAtindex(array, 4, 6);
        Assert.assertArrayEquals(expected, array);
    }

    @Test
    public void replaceTest(){
        Integer [] expected = {1,2,3,4};
        Integer [] array = {1,2,6,4};
        tester.replace(array, 6, 3);
        Assert.assertArrayEquals(expected, array);
    }

    @Test
    public void replaceTest2(){
        Integer [] expected = {1,9,8,1,1};
        Integer [] array = {10,9,8,10,10};
        tester.replace(array, 10, 1);
        Assert.assertArrayEquals(expected, array);
    }

    @Test
    public void replaceTest3(){
        String [] expected = {"Hello", "My", "Friends"};
        String [] array = {"Hello", "All", "Friends"};
        tester.replace(array, "All", "My");
        Assert.assertArrayEquals(expected, array);
    }

    @Test
    public void longestTest(){
        int expected = 5;
        Integer[][] he = {{}, {1,2,3,4,5}};
        int actual = tester.longestArray(he);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void palindromeTest1(){
        Assert.assertTrue(tester.palindrome("girafarig"));
    }
    @Test
    public void palindromeTest2(){
        Assert.assertFalse(tester.palindrome("money"));
    }
    @Test
    public void palindromeTest3(){
        Integer [] array = {1,2,3,4};
        Assert.assertFalse(tester.palindrome(array));
    }
    @Test
    public void palindromeTest4(){
        Integer [] array = {1,2,3,4,4,3,2,1};
        Assert.assertTrue(tester.palindrome(array));
    }

    @Test
        public void containsTest(){
            Integer [] array = {1, 2, 3, 4};
            Assert.assertTrue(tester.contains(array, 3));
    }

    @Test
    public void containsTest2() {
        Integer[] array = {1, 2, 3, 4};
        Assert.assertFalse(tester.contains(array, 5));

    }

}
