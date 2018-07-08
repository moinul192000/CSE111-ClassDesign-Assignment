/**
 * Created By Dark Sh@dow
 */
public class Clock {
    private int hours;
    private int minutes;
    private int seconds;

    /** Constructors **/
    public Clock() {
        this.hours = 12;
        this.minutes = 0;
        this.seconds = 0;
    }

    public Clock(int hour, int minute, int second) {
        this.hours = hour;
        this.minutes = minute;
        this.seconds = second;
    }

    public Clock(int temp) {
        this.hours = temp / 3600;
        this.minutes = (temp % 3600) / 60;
        this.seconds = temp % 60;
    }

    /** Methods **/
    public void setClock(int temp){
        this.hours = temp / 3600;
        this.minutes = (temp % 3600) / 60;
        this.seconds = temp % 60;
    }
    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
    public int tick(){
        this.seconds+=1;
        return this.seconds;
    }
    public int tickDown(){
        this.seconds-=1;
        return this.seconds;
    }
}
