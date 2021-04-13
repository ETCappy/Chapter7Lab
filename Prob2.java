
public class Prob2  {
  public static void main(String[] args) {
    int[] values = { 6, 2, 1, 7, 12, 5 };
    // Can this loop increment the values?
// Not as a for each loop because local var is incremented, but it can as a for loop
    for (int i = 0; i < values.length; i++) {
      values[i]++;
      System.out.println("New val: " + values[i]);
    }
    // Print out array to see if they really changed
    System.out.println("Array after the loop: ");
    for (int i = 0; i < values.length; i++) {
      System.out.print(values[i] + " ");
    }
  }
}
