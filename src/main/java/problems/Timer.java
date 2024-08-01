package problems;

/*
Here, you should create a Timer class
*/

public class Timer {

    // Instance Variables
    private int hours;
    private int minutes;
    private int seconds;

    //TODO Make a constructor with no parameters that will set the time to 00:00:00
    // The hours, minutes, and seconds variables should all be set to zero
    public Timer(){

    }
    //TODO Make a constructor with one parameter of time in seconds that converts that time to HH:MM:SS
    // So Timer(500) should make 8 hours, 20 minutes, 0 seconds/ 8:20:0
    public Timer(int time){


    }



    //TODO
    // Make getters for hours, minutes, and seconds




    //TODO Make a method that sets a new time, just like the constructor Timer(int time)
    public void setTime(int time){


    }

    //TODO Overload that method to take three time parameters as hours, minutes, and seconds
    // setTime(5, 23, 40) = 5 hours, 23 minutes, 40 seconds
    // setTime(5, 23, 150) = 5 hours, 25 minutes, 30 seconds
    public void setTime(int hours, int minutes, int seconds){


    }

    //TODO Make a method that takes a time parameter in seconds, and adds that to the timer.
    // EX: 02:40:10 + 700 seconds = 02:51:50
    public void addTime(int time){


    }

    //TODO Overload that method to take three time parameters as hours, minutes, and seconds
    // EX: 02:40:10 + 0 hours, 11 minutes, 40 seconds = 02:51:50
    public void addTime(int hours, int minutes, int seconds){

    }
    // TODO Make a method that adds one second to the timer
    public void addSecond(){

    }
    // TODO Make a method that subtracts one second from the timer but make sure it doesn't go below 00:00:00
    public void subtractSecond(){

    }
//DON'T EDIT THIS
    public String toString(){
        return hours + ":" + minutes + ":" + seconds;
    }
}