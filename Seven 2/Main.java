import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in); //Create scanner object
    System.out.println("Enter a number");

    String userInput = myObj.nextLine();
    int integer = Integer.parseInt(userInput);
    if (integer > 7) {
      System.out.println("Privet");
      } 
    else {
      System.out.println("Poka");
    }
  }
}
