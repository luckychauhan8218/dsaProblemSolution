
public class PrintPrimeNumbers {
    public static void main(String[] args) {

        for (int num = 1; num <= 10; num++) {
            boolean isPrime = true;

            if (num <= 1) {
                isPrime = false;
            }

            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(num);
            }
        }
    }
}
