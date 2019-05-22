package edu.cnm.deepdive;

/**
 *Exercises the method of the {@link FizzBuzz} methods class.
 *
 * @author anita &amp; Deep Dive Coding Java+Android Cohort 7.
 * @version 1.0.01
 */
public class Main {

  private Main () {}


  /**
   * Computes and displays the fizz buzz values corresponding to the input values 1&ndash;100.
   *
   * @param args Command Line arguments (ignored)
   */
  public static void main(String[] args) {
    for (int i = 1; i <= 100; i++){
      System.out.println(FizzBuzz.fizzBuzzValue(i));
    }
  }

}
