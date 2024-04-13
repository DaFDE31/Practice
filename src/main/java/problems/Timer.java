package problems;

/*
Here, you should create a Timer class
*/

public class Timer {

    // Instance Variables
    private int hours;
    private int minutes;
    private int seconds;

    public Timer(){
        //Make a constructor with no parameters that will set the time to 00:00:00
    }
    public Timer(int time){
        //Make a constructor with one parameter of time in seconds that converts that time to
        // HH:MM:SS

    }

    //TODO
    //Make getters for hours, minutes, and seconds


    public void setTime(int time){
        //Make a method that sets a new time, just like the constructor

    }

    public void setTime(int hours, int minutes, int seconds){
        //Overload that method to take three time parameters as hours, minutes, and seconds

    }


    public void addTime(int time){
        //Make a method that takes a time parameter in seconds, and adds that to the timer.
        //
        //EX: 02:40:10 + 700 seconds = 02:51:50

    }
    public void addTime(int hours, int minutes, int seconds){
        //Overload that method to take three time parameters as hours, minutes, and seconds
        //
        //EX: 02:40:10 + 0 hours, 11 minutes, 40 seconds = 02:51:50
    }

    public void addSecond(){
        // Make a method that adds one second to the timer
    }
    public void subtractSecond(){
        // Make a method that subtracts one method from the timer but make sure it
        //doesn't go below 00:00:00
    }

    public String toString(){
        return hours + ":" + minutes + ":" + seconds;
    }
}
