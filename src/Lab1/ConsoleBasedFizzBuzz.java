package Lab1;

public class ConsoleBasedFizzBuzz implements FizzBuzz {

    @Override
    public void print(int from, int to) {
        for(int i = from; i <= to; i++) {
            if (i % 15 == 0) {
                System.out.println("Lab1.FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }
}
