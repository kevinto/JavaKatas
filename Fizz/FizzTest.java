import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FizzTest
{
  protected void setUp()
  {
  }

  @Test(expected = IllegalArgumentException.class)
  public void fizzbuzz_withStartGreaterThanEnd_throws()
  {
    System.out.println("Running...fizzbuzz_withStartGreaterThanEnd_throws...");
    FizzBuzz fizzbuzz = new FizzBuzz(10, 1);
  }

  @Test(expected = IllegalArgumentException.class)
  public void fizzbuzz_withStartLessThanZero_throws()
  {
    System.out.println("Running...fizzbuzz_withStartLessThanZero_throws...");
    FizzBuzz fizzbuzz = new FizzBuzz(-1, 10);
  }

  @Test
  public void fizzbuzz_with0to15_isCorrect()
  {
    System.out.println("Running...fizzbuzz_with0to15_isCorrect...");
    FizzBuzz fizzbuzz = new FizzBuzz(0, 15);
    fizzbuzz.Solve();
  }

   @Test
  public void fizzbuzz_with0to25_isCorrect()
  {
    System.out.println("Running...fizzbuzz_with0to15_isCorrect...");
    FizzBuzz fizzbuzz = new FizzBuzz(0, 25);
    fizzbuzz.Solve();
  }
}
