package problems;

import org.junit.Assert;
import org.junit.Test;

public class TimerTest {

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
        Timer tester = new Timer();
        tester.setTime(4832);
        String expected = "1:20:32";
        String actual = tester.toString();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setTest2(){
        Timer tester = new Timer();
        tester.setTime(1,0,0);
        String expected = "1:0:0";
        String actual = tester.toString();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void addTest1(){
        Timer tester = new Timer();
        tester.addTime(3600);
        String expected = "1:0:0";
        String actual = tester.toString();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void addTest2(){
        Timer tester = new Timer(3600);
        tester.addTime(4,20,100);
        String expected = "5:21:40";
        String actual = tester.toString();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void secondsTest1(){
        Timer tester = new Timer();
        tester.setTime(6,21,40);
        tester.addSecond();
        String expected = "6:21:41";
        String actual = tester.toString();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void secondsTest2(){
        Timer tester = new Timer();
        tester.setTime(1,0,59);
        tester.addSecond();
        String expected = "1:1:0";
        String actual = tester.toString();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void subtractTest1(){
        Timer tester = new Timer();
        tester.setTime(1,0,0);
        tester.subtractSecond();
        String expected = "0:59:59";
        String actual = tester.toString();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void subtractTest2(){
        Timer tester = new Timer();
        tester.setTime(0,0,0);
        tester.subtractSecond();
        String expected = "0:0:0";
        String actual = tester.toString();
        Assert.assertEquals(expected,actual);
    }
}
