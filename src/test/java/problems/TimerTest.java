package problems;

import org.junit.Assert;
import org.junit.Test;

public class TimerTest {

    Timer tester = new Timer();
    @Test
    public void timeTest1(){
        Timer con = new Timer();
        String expected = "0:0:0";
        String actual = con.toString();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void timeTest2(){
        Timer con = new Timer(7200);
        String expected = "2:0:0";
        String actual = con.toString();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setTest1(){
        tester.setTime(4832);
        String expected = "1:20:32";
        String actual = tester.toString();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setTest2(){
        tester.setTime(1,0,0);
        String expected = "1:0:0";
        String actual = tester.toString();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void addTest1(){
        tester.addTime(3600);
        String expected = "2:0:0";
        String actual = tester.toString();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void addTest2(){
        tester.addTime(4,20,100);
        String expected = "6:21:40";
        String actual = tester.toString();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void secondsTest1(){
        tester.addSecond();
        String expected = "6:21:41";
        String actual = tester.toString();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void secondsTest2(){
        tester.setTime(1,0,59);
        tester.addSecond();
        String expected = "1:1:0";
        String actual = tester.toString();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void subtractTest1(){
        tester.setTime(1,0,0);
        tester.subtractSecond();
        String expected = "0:59:59";
        String actual = tester.toString();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void subtractTest2(){
        tester.setTime(0,0,0);
        tester.subtractSecond();
        String expected = "0:0:0";
        String actual = tester.toString();
        Assert.assertEquals(expected,actual);
    }
}
