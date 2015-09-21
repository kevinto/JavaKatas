import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class FizzTestRunner
{
  public static void main(String[] args)
  {
    Result result = JUnitCore.runClasses(FizzTest.class);
    for (Failure failure : result.getFailures())
    {
      System.out.println(failure.toString());
    }

    if (result.wasSuccessful())
    {
      System.out.println("all tests passed");
    }
    else
    {
      System.out.println("some or all tests failed");
    }
  }
}
