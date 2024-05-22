import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ConsoleBasedFizzBuzz fizzBuzz = new ConsoleBasedFizzBuzz();

        System.out.println("Enter the limit");
        int limit = input.nextInt();

        fizzBuzz.print(1,limit);
    }
}
