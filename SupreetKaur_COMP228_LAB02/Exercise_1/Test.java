import javax.swing.*;
import java.util.Random;

public class Test {
    private String[] questions = {
            "What is the capital of France?\n1. Berlin\n2. Madrid\n3. Paris\n4. Rome",
            "Which planet is known as the Red Planet?\n1. Earth\n2. Mars\n3. Venus\n4. Jupiter",
            "What is the largest mammal in the world?\n1. Elephant\n2. Blue Whale\n3. Great White Shark\n4. Giraffe",
            "What is the chemical symbol for gold?\n1. Au\n2. Ag\n3. Pb\n4. Fe",
            "Which country is known as the Land of the Rising Sun?\n1. China\n2. Japan\n3. Korea\n4. Thailand"
    };

    private int[] answers = {3, 2, 2, 1, 2}; // Correct answers corresponding to the questions
    private int correctAnswers = 0;
    private int incorrectAnswers = 0;
    private Random random = new Random();

    public void inputAnswer() {
        for (int i = 0; i < questions.length; i++) {
            String userAnswer = JOptionPane.showInputDialog(questions[i]);
            checkAnswer(i, userAnswer);
        }
        displayResults();
    }

    private void checkAnswer(int questionIndex, String userAnswer) {
        try {
            int answer = Integer.parseInt(userAnswer);
            if (answer == answers[questionIndex]) {
                correctAnswers++;
                generateMessage(true);
            } else {
                incorrectAnswers++;
                generateMessage(false, answers[questionIndex]);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a number between 1 and 4.");
        }
    }

    private void generateMessage(boolean isCorrect) {
        String message;
        switch (random.nextInt(4)) {
            case 0:
                message = isCorrect ? "Excellent!" : "No. Please try again.";
                break;
            case 1:
                message = isCorrect ? "Good!" : "Wrong. Try once more.";
                break;
            case 2:
                message = isCorrect ? "Keep up the good work!" : "Don't give up!";
                break;
            case 3:
                message = isCorrect ? "Nice work!" : "No. Keep trying..";
                break;
            default:
                message = "Try again.";
        }
        JOptionPane.showMessageDialog(null, message);
    }

    private void generateMessage(boolean isCorrect, int correctAnswer) {
        JOptionPane.showMessageDialog(null, "The correct answer was: " + correctAnswer);
    }

    private void displayResults() {
        int totalQuestions = questions.length;
        double percentage = (double) correctAnswers / totalQuestions * 100;
        String resultMessage = "Correct Answers: " + correctAnswers + "\nIncorrect Answers: " + incorrectAnswers +
                "\nPercentage Correct: " + String.format("%.2f", percentage) + "%";
        JOptionPane.showMessageDialog(null, resultMessage);
    }
}
