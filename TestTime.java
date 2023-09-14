public class TestTime {

  public static void main(String[] args) {
    // Create two instances of the Time object (t1 & t2)
    Time t1 = new Time();
    Time t2 = new Time();

    // Set t1's and t2's attributes
    t1.setTime(21, 10, 15);
    t2.setTime(10, 20, 25);

    // Increment t1's seconds by 1 and decrement t2's seconds by 1
    t1.nextSecond();
    t2.previousSecond();

    System.out.println("\n");

    // Display the time for t1 and t2
    System.out.println("Time 1: " + t1.toString());
    System.out.println("Time 2: " + t2.toString());

  }
}
