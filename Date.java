public class Date {

  // Attributes

  private int day;
  private int month;
  private int year;

  // Constructors

  // Parameterized Constructor
  public Date(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  // Methods

  // Gets the day
  public int getDay() {
    return day;
  }

  // Gets the month
  public int getMonth() {
    return month;
  }

  // Gets the year
  public int getYear() {
    return year;
  }

  // Sets the day
  public void setDay(int day) {
    this.day = day;
  }

  // Sets the month
  public void setMonth(int month) {
    this.month = month;
  }

  // Sets the year
  public void setYear(int year) {
    this.year = year;
  }

  // Sets each date attribute
  public void setDate(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  // Formats the date with leading zeros and displays the date
  public String toString() {
    return String.format("%02d/%02d/%04d", day, month, year);
  }

}
