import java.util.Scanner;
/**
 * asks the user for 2 numbers, will count up only the even numbers from the first number to the second
 * @author Graham Ellacott
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a Scanner for user input
    Scanner input = new Scanner(System.in);

    //initialize variables
    int firstNum; //the first number provided by the user
    int secondNum; //the second number provided by the user
    int remainder; //the remainder of the current "i" value divided by 2

    //ask user for first number
    System.out.println("What number do you want to begin counting from?");
    firstNum = input.nextInt();

    //ask user for second number
    System.out.println("What number do you want to end counting at?");
    secondNum = input.nextInt();

    //start the counting loop
    for(int i = firstNum; i <= secondNum; i++){ //set "i" to start at the first number, then repeat the loop until it reaches the second number
      //get the remainder of "i" and 2 (if the remainder is 0, it is an even number)
      remainder = i % 2;
      //if it is an even number
      if(remainder == 0){
        //print the current number
        System.out.println(i);
      }
    }
    
  }
}
