
public class Main {

    public static void main(String[] args) {

        int firstNumber = 15;
        int secondNumber = 5;

        int choice1 = 1;
        int choice2 = 6;
        int choice3 = 8;
        int choice4 = 9;
        int choice5 = 10;

        int choiceNumber = 1;
        int choice = 0;

        do {
            if (choiceNumber == 1) {
                choice = choice1;
            } else if (choiceNumber == 2) {
                choice = choice2;
            } else if (choiceNumber == 3) {
                choice = choice3;
            } else if (choiceNumber == 4) {
                choice = choice4;
            } else if (choiceNumber == 5) {
                choice = choice5;
            }

            switch (choice) {

                case 1:
                    System.out.println("Selected Operation: Addition");
                    System.out.println("Result: " + (firstNumber + secondNumber));
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Selected Operation: Subtraction");
                    System.out.println("Result: "
                            + (firstNumber - secondNumber));
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Selected Operation: Multiplication");
                    System.out.println("Result: "
                            + (firstNumber * secondNumber));
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Selected Operation: Division");

                    if (secondNumber != 0) {
                        System.out.println("Result: "
                                + (firstNumber / secondNumber));
                    } else {
                        System.out.println("Cannot divide by zero.");
                    }

                    System.out.println();
                    break;

                case 5:
                    System.out.println("Selected Operation: Remainder");

                    if (secondNumber != 0) {
                        System.out.println("Result: "
                                + (firstNumber % secondNumber));
                    } else {
                        System.out.println(
                                "Cannot find remainder with zero.");
                    }

                    System.out.println();
                    break;

                case 6:
                    System.out.println(
                            "Selected Operation: Increment First Number");

                    firstNumber++;

                    System.out.println(
                            "Updated First Number: " + firstNumber);
                    System.out.println();
                    break;

                case 7:
                    System.out.println(
                            "Selected Operation: Decrement Second Number");

                    secondNumber--;

                    System.out.println(
                            "Updated Second Number: " + secondNumber);
                    System.out.println();
                    break;

                case 8:
                    System.out.println(
                            "Selected Operation: Compare Numbers");

                    String result;

                    if (firstNumber > secondNumber) {
                        result = "First number is greater.";
                    } else if (firstNumber < secondNumber) {
                        result = "Second number is greater.";
                    } else {
                        result = "Both numbers are equal.";
                    }

                    String comparison
                            = (firstNumber == secondNumber)
                                    ? "Both numbers are equal."
                                    : result;

                    System.out.println("Result: " + comparison);
                    System.out.println();
                    break;

                case 9:
                    System.out.println(
                            "Selected Operation: Change Sign");

                    firstNumber = -firstNumber;

                    System.out.println(
                            "Updated First Number: " + firstNumber);
                    System.out.println();
                    break;

                case 10:
                    System.out.println("Selected Operation: Exit");
                    System.out.println("Operator Explorer Closed.");
                    break;

                default:
                    System.out.println("Invalid menu choice.");
                    System.out.println();
            }

            choiceNumber++;

        } while (choice != 10);
    }

}
