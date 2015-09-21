/**
 * This is a class that solves the fizzbuzz problem.
 */
class FizzBuzz
{
  private int start = 0; // Even without initialization the value is zero by default
  private int end = 0;

  /**
   * The constructor for the FizzBuzz class.
   * @param beginning The start number for fizzbuzz range.
   * @param ending The end number for fizzbuzz range.
   */
  public FizzBuzz(int beginning, int ending)
  {
    ValidateConstructorArgs(beginning, ending);

    start = beginning;
    end = ending;
  }

  /**
   * Outputs the solution to FizzBuzz
   */
  public void Solve()
  {
    System.out.println("hello from solve...");
  }

  private void ValidateConstructorArgs(int beginning, int ending)
  {
    if (beginning > ending)
    {
      throw new IllegalArgumentException("Starting number is greater than ending number.");
    }
    else if (beginning < 0 || ending < 0)
    {
      throw new IllegalArgumentException("Starting number or ending number cannot be less than zero.");
    }
  }
}
