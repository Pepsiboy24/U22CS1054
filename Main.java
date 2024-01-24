import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Calling scanner class So we can get input from the user
        Scanner userInput = new Scanner(System.in);

        //Initalizing variables for firstNumber secondNumber
        long firstNum;
        long secondNum;

        //Variable we use to run while loop to check if input is correct
        boolean correctInput;

        //this while loop is used so calculator app can be used continuosly
        while(true){

            //setting correct input to true  by default b4 user enters anything
            correctInput = true;

            //Label to tell user that first number should be entered
            System.out.print("Enter First Number");

            //condition to check if user actually entered a number
            if(userInput.hasNextLong()){
                //getting user input and storing it in firstNum variable
                firstNum = userInput.nextLong();

                /*Using while loop so that if user input for second number is not a number
                code doesn't restart from  collecting input for first Num
                */
                while(correctInput){
                    //Label to tell user to enter second number
                    System.out.print("Enter Second Number");
                    //Condition to check if user actually entered a number
                    if(userInput.hasNextLong()){
                        //getting user input and storing it in seconNum variable
                        secondNum = userInput.nextLong();

                        /*Using while loop so that if user input for the operator is not valid
                        code doesn't restart from  collecting input for firstNum
                        */
                        while(correctInput){
                            //La
                            System.out.print("Enter Operator (+, -, *, /): ");
                            String operator = userInput.next();

                            //Logical statement for checking type of operation user wants to carry out
                            if(operator.equals("+")){
                                //checking if operation is addition
                                addition(firstNum, secondNum);
                            }else if(operator.equals("-")){
                                //checking if operation is subtraction
                                subtraction(firstNum, secondNum);
                            }else if(operator.equals("*")){
                                //checking if operation is multiplication
                                Multiplication(firstNum, secondNum);
                            }else if(operator.equals("/")){
                                //checking if operation is division
                                Division(firstNum, secondNum);
                            }else if(operator.equalsIgnoreCase("quit")){
                                System.out.println("Exiting program...");
                                break;
                            }else{
                                System.out.println("Invalid operator");
                                continue;
                            }

                            correctInput = false;
                        }

                        correctInput = false;
                    }else {
                        String input = userInput.next();
                        if(input.equalsIgnoreCase("quit")){
                            System.out.println("Exiting program...");
                            break;
                        }else{
                            System.out.println("Error: Input has to be a number");
                        }
                    }
                }
            }else{
                String input = userInput.next();
                if(input.equalsIgnoreCase("quit")){
                    //If user typed quit the below code is executed
                    System.out.println("Exiting program...");
                    break;
                }else{
                    System.out.println("Error: Input has to be a number");
                }
            }
        }
    }

    public static void addition(long firstNum, long secondNum){
        //Function for adding numbers
        double additionResult = Math.addExact(firstNum, secondNum);
        System.out.println(additionResult);
    }

    public static void subtraction (long firstNum, long secondNum){
        //Function for subtracting numbers
        double subtractionResult = Math.subtractExact(firstNum, secondNum);
        System.out.println(subtractionResult);
    }

    public static void Multiplication(long firstNum, long secondNum){
        //Function for multiplying numbers
        double multiplicationResult = Math.multiplyExact(firstNum, secondNum);
        System.out.println(multiplicationResult);
    }

    public static void Division(long firstNum, long secondNum){
        //Function for dividing numbers

        //Checking if user is trying to divide numbers by 0
        if(secondNum != 0){
            //If user is not trying to divide by 0 the below code executes
            double divisionResult = (double) firstNum / (double) secondNum;
            System.out.println(divisionResult);
        }else{
            //if user tries to divide a number by 0 the below is printed
            System.out.println("Can not divide by 0");
        }
    }

}