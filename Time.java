public class Time {

  // Attributes

  private int hour = 14;
  private int minute = 34;
  private int second = 26;

  // Constructors

  // Argumentless Constructor (it was giving me an error without this here)
  public Time() {
    this.hour = 14;
    this.minute = 34;
    this.second = 26;
  }

  // Parameterized Constructor
  public Time(int h, int m, int s) {
    this.hour = h;
    this.minute = m;
    this.second = s;
  }

  // Methods

  // Gets the hour
  public int getHour() {
    return this.hour;
  }

  // Gets the minute
  public int getMinute() {
    return this.minute;
  }

  // Gets the second
  public int getSecond() {
    return this.second;
  }

  // Sets the hour
  public void setHour(int hour) {
    this.hour = hour;
  }

  // Sets the minute
  public void setMinute(int minute) {
    this.minute = minute;
  }

  // Sets the second
  public void setSecond(int second) {
    this.second = second;
  }

  // Sets every attribute for the Time object
  public void setTime(int hour, int minute, int second) {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  // Formats the time with leading zeros and displays it
  public String toString() {
    return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
  }

  // Increments the second attribute for the object instance by 1
  public Time nextSecond() {
    this.second += 1;
    return this;
  }

  // Decrements the second attribute for the object instance by 1
  public Time previousSecond() {
    this.second -= 1;
    return this;
  }

}
