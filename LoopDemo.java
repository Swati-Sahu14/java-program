
public class LoopDemo {
    public static void main(String[] args) {
        // For loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }

        // While loop
        int j = 1;
        while (j <= 5) {
            System.out.println("While Number: " + j);
            j++;
        }

        // Do-while loop
        int k = 1;
        do {
            System.out.println("Do-While Number: " + k);
            k++;
        } while (k <= 5);
    }
}
