import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in); //Create scanner object
    System.out.println("Enter a name");

    String userInput = myObj.nextLine();
    if (userInput.equals("Vyacheslav")) {
      System.out.println("Привет, Вячеслав");
      } 
    else {
      System.out.println("Нет такого имени");
    }
  }
}
