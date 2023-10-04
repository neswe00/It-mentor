import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Calculate {

    public static void main(String[] args) throws Exception {
        // Announcing the scanner
        final Scanner sc = new Scanner(System.in);

        // Declaring all the variables that we are going to use
        String operation;
        String num1;
        String num2;


        while (true) {
            System.out.print("Enter the correct expression: ");
            // 10 + 10 or IV - I
            String input_data = sc.nextLine();
            List<String> input_data_list = Arrays.asList(input_data.split(" "));

            check_input_size(input_data_list);


            operation = input_data_list.get(1);
            num1 = input_data_list.get(0);
            num2 = input_data_list.get(2);

            check_input_number(num1, num2);


            switch (operation) {
                case "+":
                    System.out.println(addition(num1, num2));
                    break;
                case "-":
                    System.out.println(subtraction(num1, num2));
                    break;
                case "*":
                    System.out.println(multiplication(num1, num2));
                    break;
                case "/":
                    System.out.println(division(num1, num2));
                    break;
                default:
                    throw new Exception("invalid expression");
            }
        }

    }

    public static void check_input_size (List<String> input_data_list) throws Exception {
        if (input_data_list.size() != 3){
            throw new Exception( "The operation is incorrect");
        }
    }





    public static void check_input_number(String num1, String num2) throws Exception {
        int number1 = Integer.parseInt(num1) ;
        int number2 = Integer.parseInt(num2);



        if (number1 < 1 || number1 > 10) {
//            throw new Exception("impossible input number: " + number1);
            throw new Exception("impossible input number: " + number1);
        }

        if (number2 < 1 || number2 > 10) {
//            throw new Exception("impossible input number: " + number2);
            throw new Exception("impossible input number: " + number2);
        }
    }







    static String addition(String num1, String num2) {
        return String.valueOf(Integer.parseInt(num1) + Integer.parseInt(num2));
    }

    static String subtraction(String num1, String num2) throws Exception {
        return String.valueOf(Integer.parseInt(num1) - Integer.parseInt(num2));
    }

    static String multiplication(String num1, String num2) {
        return String.valueOf(Integer.parseInt(num1) * Integer.parseInt(num2));
    }
    static String division(String num1, String num2) {
        return String.valueOf(Integer.parseInt(num1) / Integer.parseInt(num2));
    }
}
