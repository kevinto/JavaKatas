/**
 * A class for producting simple greetings.
 */
public class Greeter
{
  /**
   * Constructs a Greeter object that cna greet a person or entity.
   * @param aName the name of the person or entity who should be addressed in the greetings.
   */
  public Greeter(String aName)
  {
    name = aName;
  }

  /**
   * Greet with a "Hello" message.
   * @return a message containing "Hello" and the name of the greeted person or entity.
   */
  public String sayHello()
  {
    return "hello, " + name + "!";
  }

  private String name;
}
