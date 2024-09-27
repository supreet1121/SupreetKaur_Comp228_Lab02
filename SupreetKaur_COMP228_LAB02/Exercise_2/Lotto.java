import javax.swing.*;
import java.util.Random;

public class Lotto {
    private int[] lottoNumbers;

    // Constructor
    public Lotto() {
        lottoNumbers = new int[3];
        Random random = new Random();
        for (int i = 0; i < lottoNumbers.length; i++) {
            lottoNumbers[i] = random.nextInt(9) + 1;
        }
    }

    // Method to return the array of lotto numbers
    public int[] getLottoNumbers() {
        return lottoNumbers;
    }

    // Method to calculate the sum of the lotto numbers
    public int calculateSum() {
        int sum = 0;
        for (int i = 0; i < lottoNumbers.length; i++) {
            sum += lottoNumbers[i];
        }
        return sum;
    }
}
