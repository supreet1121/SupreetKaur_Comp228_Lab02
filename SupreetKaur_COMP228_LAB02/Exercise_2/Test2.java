import javax.swing.*;

public class Test2 {
    public static void main(String[] args) {
        int userNumber = getUserNumber();
        boolean isWinner = false;

        for (int attempts = 0; attempts < 5; attempts++) {
            // Step 1: Generate 3 random lotto numbers
            Lotto lotto = new Lotto(); // Create a new Lotto object

            // Step 2: Calculate the sum of these numbers
            int sum = lotto.calculateSum(); // Add the lotto numbers

            // Step 3: Show the numbers and their sum to the user
            String message = "Lotto numbers: " + lotto.getLottoNumbers()[0] + ", " +
                    lotto.getLottoNumbers()[1] + ", " + lotto.getLottoNumbers()[2] +
                    "\nSum of these numbers is: " + sum;
            JOptionPane.showMessageDialog(null, message);

            // Step 4: Check if the user's number matches the sum
            if (sum == userNumber) {
                JOptionPane.showMessageDialog(null, "Congratulations! You win!");
                return;
            }
        }

// If the loop finishes and the user hasn't won, they lose
        JOptionPane.showMessageDialog(null, "Sorry, the computer wins. Better luck next time!");

    }

    // Method to get user input
    private static int getUserNumber() {
        int userNumber = 0;
        while (true) {
            String input = JOptionPane.showInputDialog("Choose a number between 3 and 27:");
            try {
                userNumber = Integer.parseInt(input);
                if (userNumber >= 3 && userNumber <= 27) {
                    return userNumber; // Return the valid user number
                } else {
                    JOptionPane.showMessageDialog(null, "Please enter a valid number between 3 and 27.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a number.");
            }
        }
    }
}
