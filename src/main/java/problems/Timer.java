package problems;

/*
Here, you should create a Timer class

Make a constructor with no parameters that will set the time to 00:00:00

Make a constructor with one parameter of time in seconds that convert that time to 00:00:00

Make getters for hours, minutes, and seconds

Make a method that sets a new time, just like the constructor

Make a method that takes a time parameter in seconds, and adds that to the timer.

EX: 02:40:10 + 700 seconds = 02:51:50

Overload that method to take three time parameters as hours, minutes, and seconds

EX: 02:40:10 + 0 hours, 11 minutes, 40 seconds = 02:51:50

Make a method that prints, the time is ______.


*/

public class Timer {

    // Instance Variables
    private int hours;
    private int minutes;
    private int seconds;

    public Timer(){

    }
    public Timer(int time){
    }
    public void setTime(int time){

    }
    public void addTime(int time){

    }
    public void addTime(int hours, int minutes, int seconds){

    }

    public void addSecond(){

    }
    public void subtractSecond(){

    }

    public String toString(){
        return hours + ":" + minutes + ":" + seconds;
    }
}
