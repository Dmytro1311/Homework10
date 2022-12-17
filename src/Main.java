
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int[] numbersFirm = new int [7];
        for(int i = 0; i < numbersFirm.length; i++){
            numbersFirm[i] = random.nextInt( 9 - 0) + 0;
            Arrays.sort(numbersFirm);
            System.out.print(numbersFirm[i] + " ");
        }
        System.out.println();
        int[] guessednumbers = new int [7];
        for(int j = 0; j < guessednumbers.length; j++){
            guessednumbers[j] = random.nextInt(9 -0) + 0;
            Arrays.sort(guessednumbers);
            System.out.print(guessednumbers[j] + " ");
        }
        System.out.println();
        int count = 0;
        for ( int i = 0; i < numbersFirm.length && i < guessednumbers.length; i++){
            if (numbersFirm[i] == guessednumbers[i]){
                count++;

            }
                    }
        System.out.println("Кількість збігів: " + count);


    }
}