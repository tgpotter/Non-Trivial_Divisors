import javax.swing.*;

public class NonTrivialDivisors {

    public static void main(String[] args) {

        String input;
        int naturalNumber;

        // dialog box for input from user
        input = JOptionPane.showInputDialog("Please input a number to check for divisors.");
        naturalNumber = Integer.parseInt(input);
        StringBuilder factors = factorsOfNaturalNumber(naturalNumber);

        // output results to dialog boxes
        if(NonTrivialDivisors.isPrime(naturalNumber)) {
            JOptionPane.showMessageDialog(null, naturalNumber + " is a prime number.");
        } else {
            JOptionPane.showMessageDialog(null, "Nontrivial divisors of " + naturalNumber + ": " + factors);
        }
    }

    // checks if the input is a prime number
    private static boolean isPrime(int number) {
        for(int i = 2; i <= number/i; ++i) {
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }

    // creates a string from all not-trivial divisors
    private static StringBuilder factorsOfNaturalNumber(int number) {
        StringBuilder factors = new StringBuilder();
        for (int i = 2; i <= number; ++i) {
            if (number % i == 0) {
                factors.append(i).append(" ");
            }
        }
        return factors;
    }
}

